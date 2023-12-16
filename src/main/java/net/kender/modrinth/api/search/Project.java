package net.kender.modrinth.api.search;

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

import net.kender.modrinth.api.project.ProjectID;
import net.kender.modrinth.api.project.version.VersionID;
import net.kender.modrinth.api.user.User;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "project_id", "project_type", "slug", "author", "title", "description", "categories",
		"display_categories", "versions", "downloads", "follows", "icon_url", "date_created", "date_modified",
		"latest_version", "license", "client_side", "server_side", "gallery", "featured_gallery", "color" })

public class Project {

	@JsonProperty("project_id")
	private String projectId;
	@JsonProperty("project_type")
	private String projectType;
	@JsonProperty("slug")
	private String slug;
	@JsonProperty("author")
	private String author;
	@JsonProperty("title")
	private String title;
	@JsonProperty("description")
	private String description;
	@JsonProperty("categories")
	private List<String> categories;
	@JsonProperty("display_categories")
	private List<String> displayCategories;
	@JsonProperty("versions")
	private List<String> versions;
	@JsonProperty("downloads")
	private Integer downloads;
	@JsonProperty("follows")
	private Integer follows;
	@JsonProperty("icon_url")
	private String iconUrl;
	@JsonProperty("date_created")
	private String dateCreated;
	@JsonProperty("date_modified")
	private String dateModified;
	@JsonProperty("latest_version")
	private String latestVersion;
	@JsonProperty("license")
	private String license;
	@JsonProperty("client_side")
	private String clientSide;
	@JsonProperty("server_side")
	private String serverSide;
	@JsonProperty("gallery")
	private List<Object> gallery;
	@JsonProperty("featured_gallery")
	private Object featuredGallery;
	@JsonProperty("color")
	private Integer color;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("project_id")
	public ProjectID getProjectId() throws JsonMappingException, JsonProcessingException {
		return ProjectID.getOf(projectId);
	}

	@JsonProperty("project_id")
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@JsonProperty("project_type")
	public String getProjectType() {
	return projectType;
	}

	@JsonProperty("project_type")
	public void setProjectType(String projectType) {
	this.projectType = projectType;
	}

	@JsonProperty("slug")
	public String getSlug() {
	return slug;
	}

	@JsonProperty("slug")
	public void setSlug(String slug) {
	this.slug = slug;
	}

	@JsonProperty("author")
	public User getAuthor() throws JsonMappingException, JsonProcessingException {
	return User.of(author);
	}

	@JsonProperty("author")
	public void setAuthor(String author) {
	this.author = author;
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

	@JsonProperty("categories")
	public List<String> getCategories() {
	return categories;
	}

	@JsonProperty("categories")
	public void setCategories(List<String> categories) {
	this.categories = categories;
	}

	@JsonProperty("display_categories")
	public List<String> getDisplayCategories() {
	return displayCategories;
	}

	@JsonProperty("display_categories")
	public void setDisplayCategories(List<String> displayCategories) {
	this.displayCategories = displayCategories;
	}

	@JsonProperty("versions")
	public List<String> getVersions() throws JsonMappingException, JsonProcessingException {
		return versions;
	}

	@JsonProperty("versions")
	public void setVersions(List<String> versions) {
	this.versions = versions;
	}

	@JsonProperty("downloads")
	public Integer getDownloads() {
	return downloads;
	}

	@JsonProperty("downloads")
	public void setDownloads(Integer downloads) {
	this.downloads = downloads;
	}

	@JsonProperty("follows")
	public Integer getFollows() {
	return follows;
	}

	@JsonProperty("follows")
	public void setFollows(Integer follows) {
	this.follows = follows;
	}

	@JsonProperty("icon_url")
	public String getIconUrl() {
	return iconUrl;
	}

	@JsonProperty("icon_url")
	public void setIconUrl(String iconUrl) {
	this.iconUrl = iconUrl;
	}

	@JsonProperty("date_created")
	public String getDateCreated() {
	return dateCreated;
	}

	@JsonProperty("date_created")
	public void setDateCreated(String dateCreated) {
	this.dateCreated = dateCreated;
	}

	@JsonProperty("date_modified")
	public String getDateModified() {
	return dateModified;
	}

	@JsonProperty("date_modified")
	public void setDateModified(String dateModified) {
	this.dateModified = dateModified;
	}

	@JsonProperty("latest_version")
	public String getLatestVersion() {
	return latestVersion;
	}

	@JsonProperty("latest_version")
	public void setLatestVersion(String latestVersion) {
	this.latestVersion = latestVersion;
	}

	@JsonProperty("license")
	public String getLicense() {
	return license;
	}

	@JsonProperty("license")
	public void setLicense(String license) {
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

	@JsonProperty("gallery")
	public List<Object> getGallery() {
	return gallery;
	}

	@JsonProperty("gallery")
	public void setGallery(List<Object> gallery) {
	this.gallery = gallery;
	}

	@JsonProperty("featured_gallery")
	public Object getFeaturedGallery() {
	return featuredGallery;
	}

	@JsonProperty("featured_gallery")
	public void setFeaturedGallery(Object featuredGallery) {
	this.featuredGallery = featuredGallery;
	}

	@JsonProperty("color")
	public Integer getColor() {
	return color;
	}

	@JsonProperty("color")
	public void setColor(Integer color) {
	this.color = color;
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
