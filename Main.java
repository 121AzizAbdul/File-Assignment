import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out=new PrintWriter("src/hello.txt");
        out.println("I love this World");
        out.close();
        File file1=new File("/home/hp-probook/IdeaProjects/Fileassignment/src/hello.txt");
        Scanner in=new Scanner(file1);
        while (in.hasNextLine()){
            String value=in.nextLine();
            System.out.println(value);
        }

    in.close();
    }

}