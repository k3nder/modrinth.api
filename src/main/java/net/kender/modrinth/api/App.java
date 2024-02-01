package net.kender.modrinth.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import net.kender.modrinth.api.project.ProjectID;
import net.kender.modrinth.api.project.version.File;
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
        Scanner scan = new Scanner(System.in);
        System.out.print("mod name: ");
        List<Project> p = s.search(scan.next());
        Map<Integer,Project> projects = new HashMap<>();
        int index = 0;
        for(Project project : p) {
        	ProjectID id = project.getProjectId();
        	System.out.println("-----------");
        	System.out.println(index + " | id: " + id.getId() + " | name: " + id.getSlug());
        	projects.put(index, project);
        	index++;
        }
        System.out.print("select: ");
        int selected = scan.nextInt();
        Project project = projects.get(selected);
        ProjectID id = project.getProjectId();
        System.out.println("VERSIONS");
        index = 0;
        System.out.println("select: ");
        selected =scan.nextInt();
        VersionID version = id.getVersions().get(selected);
        for(File file : version.getFiles()) {
        	System.out.println("filename: " + file.getFilename() + " | url: " + file.getUrl());
        }
    }
}
