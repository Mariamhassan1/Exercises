# MiniShell :)

A simple Java-based command-line shell implementation that provides basic file system navigation and manipulation capabilities.

## Overview

MiniShell is a lightweight command-line interface that allows users to navigate the file system and perform common file operations. The application is built in Java and provides a familiar shell-like experience with commands for directory navigation, file creation, and more.

## Features

- Display current working directory
- List files and directories
- Navigate between directories
- Create new directories
- Create new files
- Interactive command prompt

## Commands

| Command | Description | Usage |
|---------|-------------|-------|
| `pwd` | Print current working directory | `pwd` |
| `ls` | List files and directories in current location | `ls` |
| `cd` | Change directory | `cd [directory_name]` or `cd ..` |
| `mkdir` | Create a new directory | `mkdir [directory_name]` |
| `touch` | Create a new file | `touch [file_name]` |
| `help` | Display available commands | `help` |
| `exit` | Exit the program | `exit` |

## Project Structure

The project consists of two main Java classes:

1. **MiniShell.java** - Contains the main method and handles user input parsing
2. **ShellCommandHandler.java** - Implements the functionality for all shell commands

## Implementation Details

### File System Operations

- File and directory creation using Java's `File` class
- Directory navigation with parent directory support
- File existence verification before operations
- Error handling for common file operations

### User Interface

- Interactive command prompt showing current directory
- Command parsing with argument support
- Help system for command reference

## How to Run

1. Compile both Java files:
   ```
   javac MiniShell.java ShellCommandHandler.java
   ```

2. Run the application:
   ```
   java MiniShell
   ```

3. Start using the available commands at the prompt that appears.

## Example Usage

```
Welcome to MiniShell! Type 'help' for a list of commands.
/Users/username/projects > pwd
/Users/username/projects
/Users/username/projects > mkdir test_dir
Directory created: test_dir
/Users/username/projects > cd test_dir
Changed directory to: /Users/username/projects/test_dir
/Users/username/projects/test_dir > touch sample.txt
File created: sample.txt
/Users/username/projects/test_dir > ls
[FILE] sample.txt
/Users/username/projects/test_dir > cd ..
Changed directory to: /Users/username/projects
/Users/username/projects > exit
Goodbye user! Thank you.
```

## Technical Notes

- The application uses Java's `java.io.File` class for file system operations
- Directory listings differentiate between files and directories
- Error handling is implemented for common issues like non-existent directories
