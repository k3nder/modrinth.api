
package net.kender.modrinth.api.search;

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
    "version_id",
    "project_id",
    "file_name",
    "dependency_type"
})

public class Dependency {

    @JsonProperty("version_id")
    private Object versionId;
    @JsonProperty("project_id")
    private String projectId;
    @JsonProperty("file_name")
    private Object fileName;
    @JsonProperty("dependency_type")
    private String dependencyType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("version_id")
    public Object getVersionId() {
        return versionId;
    }

    @JsonProperty("version_id")
    public void setVersionId(Object versionId) {
        this.versionId = versionId;
    }

    @JsonProperty("project_id")
    public String getProjectId() {
        return projectId;
    }

    @JsonProperty("project_id")
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @JsonProperty("file_name")
    public Object getFileName() {
        return fileName;
    }

    @JsonProperty("file_name")
    public void setFileName(Object fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("dependency_type")
    public String getDependencyType() {
        return dependencyType;
    }

    @JsonProperty("dependency_type")
    public void setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
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
