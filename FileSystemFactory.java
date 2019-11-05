package com.razz.sample.standardchartered.assignment.filesystem;

/**
 * @author gauriyadav
 * Factory class to return the file system instance.
 */
public class FileSystemFactory {

	public static IFileSystem getFileSystem() {
		return new FileSystemImpl();
	}
}
