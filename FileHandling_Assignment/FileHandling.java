import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args)throws IOException
    {
        int ch;
        FileReader fr=null;
        try {
            fr=new FileReader("C:\\Users\\mvsuhas\\Desktop\\StudentData.csv");
        }
        catch (FileNotFoundException fe){
            System.out.println("File not found");
        }
        while ((ch= fr.read())!=-1){
            System.out.print((char)ch);

        }

        fr.close();

    }
}
