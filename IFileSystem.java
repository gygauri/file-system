package com.razz.sample.standardchartered.assignment.filesystem;

import java.util.List;

/************************************************
 * @author gauriyadav
 * 
 * Features provided :-
 * a) ls :    Lists directory/file at given path
 * b) mkdir : Creates new directory
 *
 ************************************************/
public interface IFileSystem {

	public List<String> ls(String path); //Path provided to list the directories/files
	public void mkdir(String dirPath); //Creates new directory
}
