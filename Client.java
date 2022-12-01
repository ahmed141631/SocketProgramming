import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
        System.out.println("client started");
        Socket soc=new Socket("localhost", 9806);
        BufferedReader usReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String str=usReader.readLine();
        PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            System.out.println(str);
            BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            out.println(in.readLine());
         }catch(Exception exception){
            exception.printStackTrace();
        }

    }
}
