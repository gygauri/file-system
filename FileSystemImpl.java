package com.razz.sample.standardchartered.assignment.filesystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/************************************************
 * @author gauriyadav
 * 
 *         Implementation provided :- a) ls : @args : dirPath b) mkdir @args :
 *         dirPath
 *
 ************************************************/
public class FileSystemImpl implements IFileSystem {

	class Directory {
		HashMap<String, Directory> dirMap = new HashMap<>();
	}

	Directory root;

	public FileSystemImpl() {
		root = new Directory();
	}

	/*
	 * It will iteratively go to last directory and return list of all directories.
	 */
	@Override
	public List<String> ls(String dirPath) {
		Directory file = root;
		if (!dirPath.equals("/")) {
			String[] d = dirPath.split("/");
			for (int i = 1; i < d.length; i++) {
				file = file.dirMap.get(d[i]);
			}
		}
		List<String> res_files = new ArrayList<>(file.dirMap.keySet());
		Collections.sort(res_files); // Return directories in lexicographical order
		return res_files;
	}

	/*
	 * It will create nested directories. If directory path doesn't 
	 * exist then it will iteratively create in between directories.
	 */
	@Override
	public void mkdir(String dirPath) {
		Directory file = root;
		String[] dir = dirPath.split("/");
		for (int i = 1; i < dir.length; i++) {
			if (!file.dirMap.containsKey(dir[i])) {
				file.dirMap.put(dir[i], new Directory());
			}
			file = file.dirMap.get(dir[i]);
		}
	}

}
