package net.kender.modrinth.api.project;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.kender.Kjson.Json;

public class Dependecyes {
	private ArrayList<ProjectID> projects;
	private ArrayList<String> versions;
	
	@JsonIgnore
	private static final String API_DEPEND = "https://api.modrinth.com/v2/project/%s/dependencies";
	
	public static Dependecyes of(ProjectID s) throws JsonMappingException, JsonProcessingException {
		return obtain(s);
	}
	public static Dependecyes of(String id) throws JsonMappingException, JsonProcessingException {
		ProjectID s = ProjectID.getOf(id);
		return obtain(s);
	}
	private static Dependecyes obtain(ProjectID s) throws JsonMappingException, JsonProcessingException {
		String url = String.format(API_DEPEND, s.getId());
		String json = Json.SContentOf(url);
		return new ObjectMapper().readValue(json,Dependecyes.class);
	}
}
