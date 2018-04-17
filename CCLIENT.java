import java.net.Socket;
import java.io.*;

public class CLIENT
{
  public static void main (String [] args)
  {
    try
    {
      //start
      System.out.println("STARTING...");
   
      //ip address server
      Socket soc = new Socket("192.168.111.129", 4583);

      BufferedReader input = new BufferedReader (new 
InputStreamReader (System.in));

      //Conversation
      System.out.println("SAY GREETINGS: ");
      String str = input.readLine();

      PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
    
      out.println(str);
 
      BufferedReader in = new BufferedReader (new 
InputStreamReader(soc.getInputStream()));

      System.out.println (in.readLine());
  
      }
      catch (Exception e)
      {
      e.printStackTrace();
      }
    }
}
