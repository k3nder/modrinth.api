
package net.kender.modrinth.api.project.version;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.kender.Kjson.Json;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "project_id",
    "author_id",
    "featured",
    "name",
    "version_number",
    "changelog",
    "changelog_url",
    "date_published",
    "downloads",
    "version_type",
    "status",
    "requested_status",
    "files",
    "dependencies",
    "game_versions",
    "loaders"
})
public class VersionID {

    @JsonProperty("id")
    private String id;
    @JsonProperty("project_id")
    private String projectId;
    @JsonProperty("author_id")
    private String authorId;
    @JsonProperty("featured")
    private Boolean featured;
    @JsonProperty("name")
    private String name;
    @JsonProperty("version_number")
    private String versionNumber;
    @JsonProperty("changelog")
    private String changelog;
    @JsonProperty("changelog_url")
    private Object changelogUrl;
    @JsonProperty("date_published")
    private String datePublished;
    @JsonProperty("downloads")
    private Integer downloads;
    @JsonProperty("version_type")
    private String versionType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("requested_status")
    private Object requestedStatus;
    @JsonProperty("files")
    private List<File> files;
    @JsonProperty("dependencies")
    private List<Object> dependencies;
    @JsonProperty("game_versions")
    private List<String> gameVersions;
    @JsonProperty("loaders")
    private List<String> loaders;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("project_id")
    public String getProjectId() {
        return projectId;
    }

    @JsonProperty("project_id")
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @JsonProperty("author_id")
    public String getAuthorId() {
        return authorId;
    }

    @JsonProperty("author_id")
    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @JsonProperty("featured")
    public Boolean getFeatured() {
        return featured;
    }

    @JsonProperty("featured")
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("version_number")
    public String getVersionNumber() {
        return versionNumber;
    }

    @JsonProperty("version_number")
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    @JsonProperty("changelog")
    public String getChangelog() {
        return changelog;
    }

    @JsonProperty("changelog")
    public void setChangelog(String changelog) {
        this.changelog = changelog;
    }

    @JsonProperty("changelog_url")
    public Object getChangelogUrl() {
        return changelogUrl;
    }

    @JsonProperty("changelog_url")
    public void setChangelogUrl(Object changelogUrl) {
        this.changelogUrl = changelogUrl;
    }

    @JsonProperty("date_published")
    public String getDatePublished() {
        return datePublished;
    }

    @JsonProperty("date_published")
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    @JsonProperty("downloads")
    public Integer getDownloads() {
        return downloads;
    }

    @JsonProperty("downloads")
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @JsonProperty("version_type")
    public String getVersionType() {
        return versionType;
    }

    @JsonProperty("version_type")
    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("requested_status")
    public Object getRequestedStatus() {
        return requestedStatus;
    }

    @JsonProperty("requested_status")
    public void setRequestedStatus(Object requestedStatus) {
        this.requestedStatus = requestedStatus;
    }

    @JsonProperty("files")
    public List<File> getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(List<File> files) {
        this.files = files;
    }

    @JsonProperty("dependencies")
    public List<Object> getDependencies() {
        return dependencies;
    }

    @JsonProperty("dependencies")
    public void setDependencies(List<Object> dependencies) {
        this.dependencies = dependencies;
    }

    @JsonProperty("game_versions")
    public List<String> getGameVersions() {
        return gameVersions;
    }

    @JsonProperty("game_versions")
    public void setGameVersions(List<String> gameVersions) {
        this.gameVersions = gameVersions;
    }

    @JsonProperty("loaders")
    public List<String> getLoaders() {
        return loaders;
    }

    @JsonProperty("loaders")
    public void setLoaders(List<String> loaders) {
        this.loaders = loaders;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    protected static final String API_VERSION = "https://api.modrinth.com/v2/version/%s";
    public static VersionID of(String id) throws JsonMappingException, JsonProcessingException {
    	String url = String.format(API_VERSION, id);
    	String json = Json.SContentOf(url);
    	return new ObjectMapper().readValue(json,VersionID.class);
    }

}
