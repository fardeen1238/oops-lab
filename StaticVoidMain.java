import java.util.Scanner;
import java.io.File;

class FileDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name/path: ");
        String name = input.nextLine();

        File f1 = new File(name);

        System.out.println("File Name: " + f1.getName());
        System.out.println("Path: " + f1.getPath());
        System.out.println("Abs Path: " + f1.getAbsolutePath());
        System.out.println("Parent: " + f1.getParent());
        System.out.println("The file is: " +
                (f1.exists() ? "Exists" : "Does not exist"));
        System.out.println("Is File: " + f1.isFile());
        System.out.println("Is Directory: " + f1.isDirectory());
        System.out.println("Is Readable: " + f1.canRead());
        System.out.println("Is Writable: " + f1.canWrite());
        System.out.println("Is Absolute: " + f1.isAbsolute());
        System.out.println("Last Modified: " + f1.lastModified());
        System.out.println("Size: " + f1.length() + " bytes");
        System.out.println("Is Hidden: " + f1.isHidden());

        input.close();
    }
}




