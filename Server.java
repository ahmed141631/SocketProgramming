import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
        System.out.println("waiting the client...");
        ServerSocket ss=new ServerSocket(9806);
        Socket soc=ss.accept();
        System.out.println("connection established");
        BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String str=in.readLine();
        PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
        out.println("server says :" +str);


        }catch(Exception exception){
            exception.printStackTrace();
        }
        
    }
}
