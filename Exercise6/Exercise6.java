import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercise6{
    public static void main(String[] args) throws FileNotFoundException {
        File file1=new File("/home/hp-probook/IdeaProjects/Fileassignment/src/hello.txt");
        Scanner inFile=new Scanner(System.in);
        System.out.println("Enter File Name:");
        String FileName=inFile.nextLine();
        PrintWriter out=new PrintWriter(FileName);
        Scanner in=new Scanner(file1);
        while (in.hasNextDouble()){
            double value1=in.nextDouble();
            double value2=in.nextDouble();
            out.println(MakeAvarage.avarage(value1,value2));

        }
        in.close();
        out.close();
    }

}