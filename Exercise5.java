import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) throws FileNotFoundException {
        int cnt=1;
        File file1=new File("/home/hp-probook/IdeaProjects/Fileassignment/src/hello.txt");
        Scanner inFile=new Scanner(System.in);
        System.out.println("Enter File Name:");
        String FileName=inFile.nextLine();
        PrintWriter out=new PrintWriter(FileName);
        Scanner in=new Scanner(file1);
        while (in.hasNextLine()){
            String value=in.nextLine();
            out.println("/*"+cnt+"*/"+value);
            cnt++;
        }
        in.close();
        out.close();
    }

}