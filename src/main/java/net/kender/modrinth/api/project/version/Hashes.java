
package net.kender.modrinth.api.project.version;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sha512",
    "sha1"
})
public class Hashes {

    @JsonProperty("sha512")
    private String sha512;
    @JsonProperty("sha1")
    private String sha1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("sha512")
    public String getSha512() {
        return sha512;
    }

    @JsonProperty("sha512")
    public void setSha512(String sha512) {
        this.sha512 = sha512;
    }

    @JsonProperty("sha1")
    public String getSha1() {
        return sha1;
    }

    @JsonProperty("sha1")
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
