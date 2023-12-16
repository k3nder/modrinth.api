package net.kender.modrinth.api.search;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.kender.Kjson.Json;
import net.kender.modrinth.api.search.Facet;

import java.util.ArrayList;

public class Seeker {

    private static final String API_SEARCH = "https://api.modrinth.com/v2/search?limit=%d&offset=%d";

    private Integer limit = 11;
    private Integer offset = 0;
    private String facets;
    private Facet[] tags;

    public Seeker(Facet... s) {
        facets = arrayToString(s);
        tags = s;
    }

    public ArrayList<Project> search() throws JsonMappingException, JsonProcessingException {
        String apiUrl = String.format(API_SEARCH, limit, offset * limit) + (tags.length > 0 ? "&" + facets : "");
        System.out.println("search in url not query: " + apiUrl);
        return new ObjectMapper().readValue(Json.SContentOf(apiUrl), D.class).hits;
    }

    public ArrayList<Project> search(String s) throws JsonMappingException, JsonProcessingException {
        String apiUrl = String.format(API_SEARCH, limit, offset * limit) + "&query=" + s + (tags.length > 0 ? "&" + facets : "");
        System.out.println("search in url: " + apiUrl);
        return new ObjectMapper().readValue(Json.SContentOf(apiUrl), D.class).hits;
    }

    public Integer getPage() {
        return offset;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setPage(int offset) {
        if (offset < 0) {
            throw new IllegalArgumentException("offset cannot be less than 0");
        }
        this.offset = offset;
    }

    public void nextPage() {
        offset++;
    }

    public void previousPage() {
        if (offset == 0) {
            throw new IllegalCircumstanceException("offset cannot be set to 0 when invoking this method, use nextPage or setPage");
        }
        offset--;
    }

    protected String arrayToString(Object[] myArray) {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < myArray.length; i++) {
            builder.append(myArray[i].toString());
            if (i < myArray.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}

class D {
    public ArrayList<Project> hits;
    public int offset;
    public int limit;
    @JsonProperty("total_hits")
    public long totalHits;
}
