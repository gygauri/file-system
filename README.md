# Description : This code demonstrates In-Memory File system that provides following features to user
1. Listing of files at given path [ls]
2. Creating new directories at given path [mkdir]

# Running the Program in terminal:
1. Open terminal and go to project root directory /file-system/
2. Enter command java -jar in-memory-file-system.jar to run the file system program.

Follow instructions in below steps to test

# Steps to start In-Memory File System in Eclipse:
1. Go to FileSystemDriver class and run as Java application
 --> This will provide Terminal$ in console
 2. Input command like ls /  to list directories at root path
 ---> It will return [] as no directories are created as of now

3. Input command like mkdir /dir1 to create a directory at root path
   Then ls /
   It will return [dir1]

4. To create nested directories use command as follows:
   mkdir /dir1/dir2
   Now command ls /dir1 will return [dir2]


#Snapshot of Eclipse IDE Console

Terminal$ls /
[]
Terminal$mkdir /dir1
Terminal$ls /
[dir1]
Terminal$mkdir /dir1/dir2
Terminal$ls /dir1
[dir2]
Terminal$


