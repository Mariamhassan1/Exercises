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
 :) 3.Example? compiler: Welcome to MiniShell! Type 'help' for a list of commands.

user: help

compiler: there are an available Commands that you can use: 1.cd [directory_name] - Change current directory 2.cd..[with adding ..] - Use '..' to move to parent directory 3.mkdir [directory_name] - Create a new directory" 4.touch [file_name] - Create a new file 5.ls - List files and directories in the current directory 6.pwd - Print current working directory path 7.help - Show this help message 8.exit - Exit the program

user: mkdir compiler: Usage: mkdir [directory_name]

user:mkdir folder1 compiler:Directory created: folder1
//-----------------------------------------------------------------------------------------------------------------------------------------------------------
:) 4.short explanation for the methods:
---> ShellCommandHandler Class Functions:
Constructor (ShellCommandHandler())
This function initializes the currentDirectory using System.getProperty("user.dir") to get the user's starting directory. It ensures the shell begins in the right location.

printWorkingDirectory()
This function prints the absolute path of the current directory by calling getAbsolutePath() on currentDirectory. It’s used for the pwd command.

listDirectory()
This function lists all files and directories in currentDirectory using listFiles() and a for loop. It uses isDirectory() and isFile() to print each item with a label like [DIR] or [FILE].

changeDirectory(String name)
This function changes the working directory based on user input. It uses conditions (if, equals, and getParentFile()) to handle moving into subfolders or going up with ...

makeDirectory(String n)
This function creates a new folder inside currentDirectory using the mkdir() method. It checks if the folder exists with exists() and shows messages based on success or failure.

createFile(String m)
This function creates a new file using createNewFile() inside try-catch to handle IOException. It checks if the file exists and gives feedback for each case.

printHelp()
This function displays a list of all supported commands with a short explanation. It is triggered by the help command.

getCurrentDirectory()
This function returns the current working directory so the MiniShell class can use it to show the shell prompt.

----> MiniShell Class Functions:
main(String[] args)
This is the main method that runs the shell. It creates a ShellCommandHandler object, uses Scanner to get user input, splits it into command and argument, and uses if-else to match the input with the right function.


 
