import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) throws FileNotFoundException {
        String Notblank="";
        File file1=new File("/home/hp-probook/IdeaProjects/Fileassignment/src/hello.txt");
        Scanner in=new Scanner(file1);

        while (in.hasNext()){
            String value=in.next();
            Notblank+=value;
        }
    in.close();
        PrintWriter out=new PrintWriter("src/hello.txt");
        out.println(Notblank);
        out.close();
    }

}