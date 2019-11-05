package com.razz.sample.standardchartered.assignment.filesystem;

import java.util.Scanner;

/**
 * @author gauriyadav Driver class to mock the terminal and test commands: ls
 *         and mkdir
 */
public class FileSystemDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			IFileSystem fs = FileSystemFactory.getFileSystem();

			while (true) {
				sc = new Scanner(System.in);
				System.out.print("Terminal$");

				String input = sc.nextLine();
				String[] inputArr = input.split("\\ "); // Splits input command into two fields : 1. command 2. path

				if (inputArr.length != 2) {
					System.out.println("Invalid number of arguments"); // Always input command followed by path
					continue;
				}

				switch (inputArr[0]) {
				case Constants.LS:
					System.out.println(fs.ls(inputArr[1]));
					break;
				case Constants.MKDIR:
					fs.mkdir(inputArr[1]);
					break;
				default:
					System.out.println("Command not supported");
				}
			}
		} finally {
			sc.close();
		}

	}

}
