
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
    "hashes",
    "url",
    "filename",
    "primary",
    "size",
    "file_type"
})
public class File {

    @JsonProperty("hashes")
    private Hashes hashes;
    @JsonProperty("url")
    private String url;
    @JsonProperty("filename")
    private String filename;
    @JsonProperty("primary")
    private Boolean primary;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("file_type")
    private Object fileType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("hashes")
    public Hashes getHashes() {
        return hashes;
    }

    @JsonProperty("hashes")
    public void setHashes(Hashes hashes) {
        this.hashes = hashes;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("file_type")
    public Object getFileType() {
        return fileType;
    }

    @JsonProperty("file_type")
    public void setFileType(Object fileType) {
        this.fileType = fileType;
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
