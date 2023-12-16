package net.kender.modrinth.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import net.kender.modrinth.api.project.version.VersionArray;
import net.kender.modrinth.api.project.version.VersionID;
import net.kender.modrinth.api.search.Project;
import net.kender.modrinth.api.search.Seeker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonMappingException, JsonProcessingException
    {
        Seeker s = new Seeker();
        for(Project p : s.search()) {
        	System.out.println("-----------------");
        	System.out.println(p.getProjectId().getId() + " :  " + p.getTitle());
        	System.out.println(p.getAuthor().getName());
        	for(VersionID v :VersionArray.getOf(p.getProjectId().getId())) {
        		System.out.println(v.getId() + " : " + v.getName() + " : " + v.getVersionNumber());
        	}
        	
        }
    }
}
