package net.kender.modrinth.api.project;

import java.util.ArrayList;
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
import net.kender.modrinth.api.project.version.VersionID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "slug",
    "project_type",
    "team",
    "organization",
    "title",
    "description",
    "body",
    "body_url",
    "published",
    "updated",
    "approved",
    "queued",
    "status",
    "requested_status",
    "moderator_message",
    "license",
    "client_side",
    "server_side",
    "downloads",
    "followers",
    "categories",
    "additional_categories",
    "game_versions",
    "loaders",
    "versions",
    "icon_url",
    "issues_url",
    "source_url",
    "wiki_url",
    "discord_url",
    "donation_urls",
    "gallery",
    "color",
    "thread_id",
    "monetization_status"
})
public class ProjectID {
	
	@JsonProperty("id")
    private String id;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("project_type")
    private String projectType;
    @JsonProperty("team")
    private String team;
    @JsonProperty("organization")
    private Object organization;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("body")
    private String body;
    @JsonProperty("body_url")
    private Object bodyUrl;
    @JsonProperty("published")
    private String published;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("approved")
    private String approved;
    @JsonProperty("queued")
    private Object queued;
    @JsonProperty("status")
    private String status;
    @JsonProperty("requested_status")
    private Object requestedStatus;
    @JsonProperty("moderator_message")
    private Object moderatorMessage;
    @JsonProperty("license")
    private License license;
    @JsonProperty("client_side")
    private String clientSide;
    @JsonProperty("server_side")
    private String serverSide;
    @JsonProperty("downloads")
    private Integer downloads;
    @JsonProperty("followers")
    private Integer followers;
    @JsonProperty("categories")
    private List<String> categories;
    @JsonProperty("additional_categories")
    private List<Object> additionalCategories;
    @JsonProperty("game_versions")
    private List<String> gameVersions;
    @JsonProperty("loaders")
    private List<String> loaders;
    @JsonProperty("versions")
    private List<String> versions;
    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("issues_url")
    private String issuesUrl;
    @JsonProperty("source_url")
    private String sourceUrl;
    @JsonProperty("wiki_url")
    private String wikiUrl;
    @JsonProperty("discord_url")
    private String discordUrl;
    @JsonProperty("donation_urls")
    private List<Object> donationUrls;
    @JsonProperty("gallery")
    private List<Object> gallery;
    @JsonProperty("color")
    private Integer color;
    @JsonProperty("thread_id")
    private String threadId;
    @JsonProperty("monetization_status")
    private String monetizationStatus;
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

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("project_type")
    public String getProjectType() {
        return projectType;
    }

    @JsonProperty("project_type")
    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    @JsonProperty("team")
    public String getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(String team) {
        this.team = team;
    }

    @JsonProperty("organization")
    public Object getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(Object organization) {
        this.organization = organization;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("body_url")
    public Object getBodyUrl() {
        return bodyUrl;
    }

    @JsonProperty("body_url")
    public void setBodyUrl(Object bodyUrl) {
        this.bodyUrl = bodyUrl;
    }

    @JsonProperty("published")
    public String getPublished() {
        return published;
    }

    @JsonProperty("published")
    public void setPublished(String published) {
        this.published = published;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("approved")
    public String getApproved() {
        return approved;
    }

    @JsonProperty("approved")
    public void setApproved(String approved) {
        this.approved = approved;
    }

    @JsonProperty("queued")
    public Object getQueued() {
        return queued;
    }

    @JsonProperty("queued")
    public void setQueued(Object queued) {
        this.queued = queued;
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

    @JsonProperty("moderator_message")
    public Object getModeratorMessage() {
        return moderatorMessage;
    }

    @JsonProperty("moderator_message")
    public void setModeratorMessage(Object moderatorMessage) {
        this.moderatorMessage = moderatorMessage;
    }

    @JsonProperty("license")
    public License getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(License license) {
        this.license = license;
    }

    @JsonProperty("client_side")
    public String getClientSide() {
        return clientSide;
    }

    @JsonProperty("client_side")
    public void setClientSide(String clientSide) {
        this.clientSide = clientSide;
    }

    @JsonProperty("server_side")
    public String getServerSide() {
        return serverSide;
    }

    @JsonProperty("server_side")
    public void setServerSide(String serverSide) {
        this.serverSide = serverSide;
    }

    @JsonProperty("downloads")
    public Integer getDownloads() {
        return downloads;
    }

    @JsonProperty("downloads")
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @JsonProperty("followers")
    public Integer getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    @JsonProperty("categories")
    public List<String> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @JsonProperty("additional_categories")
    public List<Object> getAdditionalCategories() {
        return additionalCategories;
    }

    @JsonProperty("additional_categories")
    public void setAdditionalCategories(List<Object> additionalCategories) {
        this.additionalCategories = additionalCategories;
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

    @JsonProperty("versions")
    public List<VersionID> getVersions() throws JsonMappingException, JsonProcessingException {
    	List<VersionID> li = new ArrayList<>();
    	for(String s:versions) {
    		li.add(VersionID.of(s));
    	}
        return li;
    }

    @JsonProperty("versions")
    public void setVersions(List<String> versions) {
        this.versions = versions;
    }

    @JsonProperty("icon_url")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("icon_url")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    @JsonProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    @JsonProperty("source_url")
    public String getSourceUrl() {
        return sourceUrl;
    }

    @JsonProperty("source_url")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    @JsonProperty("wiki_url")
    public String getWikiUrl() {
        return wikiUrl;
    }

    @JsonProperty("wiki_url")
    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    @JsonProperty("discord_url")
    public String getDiscordUrl() {
        return discordUrl;
    }

    @JsonProperty("discord_url")
    public void setDiscordUrl(String discordUrl) {
        this.discordUrl = discordUrl;
    }

    @JsonProperty("donation_urls")
    public List<Object> getDonationUrls() {
        return donationUrls;
    }

    @JsonProperty("donation_urls")
    public void setDonationUrls(List<Object> donationUrls) {
        this.donationUrls = donationUrls;
    }

    @JsonProperty("gallery")
    public List<Object> getGallery() {
        return gallery;
    }

    @JsonProperty("gallery")
    public void setGallery(List<Object> gallery) {
        this.gallery = gallery;
    }

    @JsonProperty("color")
    public Integer getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Integer color) {
        this.color = color;
    }

    @JsonProperty("thread_id")
    public String getThreadId() {
        return threadId;
    }

    @JsonProperty("thread_id")
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    @JsonProperty("monetization_status")
    public String getMonetizationStatus() {
        return monetizationStatus;
    }

    @JsonProperty("monetization_status")
    public void setMonetizationStatus(String monetizationStatus) {
        this.monetizationStatus = monetizationStatus;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
	protected static String API_GET = "https://api.modrinth.com/v2/project/%s";
	public static ProjectID getOf(String id) throws JsonMappingException, JsonProcessingException {
		String url = String.format(API_GET, id);
		String json = Json.SContentOf(url);
		return new ObjectMapper().readValue(json,ProjectID.class);
	}
}
