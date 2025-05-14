import java.io.File;
import java.io.IOException;

public class ShellCommandHandler {
    private File currentDirectory;

    public ShellCommandHandler() {
        // Initialize to the user's current working directory
        this.currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void printWorkingDirectory() {
        // Output format must be exact
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public void listDirectory() {
        File[] listing = currentDirectory.listFiles();
        if (listing != null && listing.length > 0) {
            for (File file : listing) {
                if (file.isDirectory()) {
                    System.out.println("[DIR] " + file.getName());
                } else if (file.isFile()) {
                    System.out.println("[FILE] " + file.getName());
                }
            }
        } else {
            System.out.println("The current directory is empty or cannot be accessed.");
        }
    }

    public void changeDirectory(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Usage: cd [directory_name]");
            return;
        }

        if (name.equals("..")) {
            File parent = currentDirectory.getParentFile();
            if (parent != null && parent.exists()) {
                currentDirectory = parent;
                System.out.println("Changed directory to: " + currentDirectory.getAbsolutePath());
            } else {
                System.out.println("Cannot move up. Already at the root directory.");
            }
        } else {
            File target = new File(currentDirectory, name);
            if (target.exists() && target.isDirectory()) {
                currentDirectory = target;
                System.out.println("Changed directory to: " + currentDirectory.getAbsolutePath());
            } else {
                System.out.println("Directory not found: " + name);
            }
        }
    }

    public void makeDirectory(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Usage: mkdir [directory_name]");
            return;
        }

        File newDir = new File(currentDirectory, name);
        if (newDir.exists()) {
            System.out.println("Directory already exists.");
        } else {
            if (newDir.mkdir()) {
                System.out.println("Directory created: " + name);
            } else {
                System.out.println("Failed to create directory.");
            }
        }
    }

    public void createFile(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Usage: touch [file_name]");
            return;
        }

        File newFile = new File(currentDirectory, name);
        if (newFile.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                if (newFile.createNewFile()) {
                    System.out.println("File created: " + name);
                } else {
                    System.out.println("Failed to create file.");
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }
    }

    public void printHelp() {
        System.out.println("Available commands:");
        System.out.println("cd [directory_name]    - Change current directory");
        System.out.println("cd ..                  - Move to parent directory");
        System.out.println("mkdir [directory_name] - Create a new directory");
        System.out.println("touch [file_name]      - Create a new file");
        System.out.println("ls                     - List files and directories");
        System.out.println("pwd                    - Print current working directory");
        System.out.println("help                   - Show this help message");
        System.out.println("exit                   - Exit the program");
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }
}