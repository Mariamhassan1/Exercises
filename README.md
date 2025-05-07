# Exercises
:) 1. General Description
In this project, we used the Java programming language through IntelliJ to write code that performs specific commands based on user input. In short, the code behaves like a terminal, allowing the user to interact with the file system through simple commands.

We created two Java classes:

MiniShell class: This acts as the main class. It runs the program, receives user input using the Scanner class, and calls functions based on the commands entered.

ShellCommandHandler class: This contains the actual methods that perform the operations. Each method implements one of the required file system commands (like listing files, changing directories, creating files, etc.).

The shell supports basic file system operations like navigating between directories, listing folder contents, and creating files and folders, similar to a real terminal.
//-------------------------------------------------------------------------------------------------------------------------------------------------
:) 2. About Compiling and Running the Code
I used IntelliJ and the Java language to build and run the project. First, I thought about the commands and what each one generally does in a real terminal. Then I started building functions for each command:
pwd, ls, cd, touch, mkdir, help, and exit.

These functions were implemented in the ShellCommandHandler class. When the MiniShell class runs, it waits for user input. Once the input is entered (e.g., ls folder1), the program splits the command into two parts: the command (ls) and the argument (folder1). Then it calls the appropriate method to perform the operation.

In the ShellCommandHandler class, I used the following libraries:

java.io.File and java.io.IOException for working with files and directories.
In the MiniShell class, I used:

java.util.Scanner to read user input.

The project uses predefined methods from the Java File class to check if files/folders exist, create new ones, or list directory contents.

 Note: The code runs in an infinite loop and does not stop until the user types the command exit, which triggers the exit function.
 //--------------------------------------------------------------------------------------------------------------------------------------------
 :)
 
