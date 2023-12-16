package net.kender.modrinth.api.project.version;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.kender.Kjson.Json;

public class VersionArray {
	protected static final String API_VERSIONS = "https://api.modrinth.com/v2/project/%s/version";
	public static ArrayList<VersionID> getOf(String id) throws JsonMappingException, JsonProcessingException{
		String url = String.format(API_VERSIONS,id);
		String json = Json.SContentOf(url);
		return new ObjectMapper().readValue(json, new ObjectMapper().getTypeFactory().constructCollectionType(ArrayList.class, VersionID.class));
	}
}
