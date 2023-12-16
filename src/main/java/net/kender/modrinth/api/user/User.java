package net.kender.modrinth.api.user;

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
import net.kender.modrinth.api.project.ProjectID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"username",
"name",
"avatar_url",
"bio",
"created",
"role",
"badges",
"payout_data",
"auth_providers",
"email",
"email_verified",
"has_password",
"has_totp",
"github_id"
})
public class User {

@JsonProperty("id")
private String id;
@JsonProperty("username")
private String username;
@JsonProperty("name")
private String name;
@JsonProperty("avatar_url")
private String avatarUrl;
@JsonProperty("bio")
private Object bio;
@JsonProperty("created")
private String created;
@JsonProperty("role")
private String role;
@JsonProperty("badges")
private Integer badges;
@JsonProperty("payout_data")
private Object payoutData;
@JsonProperty("auth_providers")
private Object authProviders;
@JsonProperty("email")
private Object email;
@JsonProperty("email_verified")
private Object emailVerified;
@JsonProperty("has_password")
private Object hasPassword;
@JsonProperty("has_totp")
private Object hasTotp;
@JsonProperty("github_id")
private Object githubId;
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

@JsonProperty("username")
public String getUsername() {
return username;
}

@JsonProperty("username")
public void setUsername(String username) {
this.username = username;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("avatar_url")
public String getAvatarUrl() {
return avatarUrl;
}

@JsonProperty("avatar_url")
public void setAvatarUrl(String avatarUrl) {
this.avatarUrl = avatarUrl;
}

@JsonProperty("bio")
public Object getBio() {
return bio;
}

@JsonProperty("bio")
public void setBio(Object bio) {
this.bio = bio;
}

@JsonProperty("created")
public String getCreated() {
return created;
}

@JsonProperty("created")
public void setCreated(String created) {
this.created = created;
}

@JsonProperty("role")
public String getRole() {
return role;
}

@JsonProperty("role")
public void setRole(String role) {
this.role = role;
}

@JsonProperty("badges")
public Integer getBadges() {
return badges;
}

@JsonProperty("badges")
public void setBadges(Integer badges) {
this.badges = badges;
}

@JsonProperty("payout_data")
public Object getPayoutData() {
return payoutData;
}

@JsonProperty("payout_data")
public void setPayoutData(Object payoutData) {
this.payoutData = payoutData;
}

@JsonProperty("auth_providers")
public Object getAuthProviders() {
return authProviders;
}

@JsonProperty("auth_providers")
public void setAuthProviders(Object authProviders) {
this.authProviders = authProviders;
}

@JsonProperty("email")
public Object getEmail() {
return email;
}

@JsonProperty("email")
public void setEmail(Object email) {
this.email = email;
}

@JsonProperty("email_verified")
public Object getEmailVerified() {
return emailVerified;
}

@JsonProperty("email_verified")
public void setEmailVerified(Object emailVerified) {
this.emailVerified = emailVerified;
}

@JsonProperty("has_password")
public Object getHasPassword() {
return hasPassword;
}

@JsonProperty("has_password")
public void setHasPassword(Object hasPassword) {
this.hasPassword = hasPassword;
}

@JsonProperty("has_totp")
public Object getHasTotp() {
return hasTotp;
}

@JsonProperty("has_totp")
public void setHasTotp(Object hasTotp) {
this.hasTotp = hasTotp;
}

@JsonProperty("github_id")
public Object getGithubId() {
return githubId;
}

@JsonProperty("github_id")
public void setGithubId(Object githubId) {
this.githubId = githubId;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

protected static final String API_USER = "https://api.modrinth.com/v2/user/%s";
public static User of(String id) throws JsonMappingException, JsonProcessingException {
	String url = String.format(API_USER, id);
	String json = Json.SContentOf(url);
	return new ObjectMapper().readValue(json,User.class);
}
public List<ProjectID> getUserProjects() throws JsonMappingException, JsonProcessingException {
	String url = String.format("https://api.modrinth.com/v2/user/%s/projects", id);
	String json = Json.SContentOf(url);
	return new ObjectMapper().readValue(json, new ObjectMapper().getTypeFactory().constructCollectionType(List.class, ProjectID.class));
}
}