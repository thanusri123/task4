import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server2 {
	static {
	ServerSocket s;
	try {
		int Construction_cost_per_sq_ft,area,temp;
		s = new ServerSocket(8001);
	   Socket ss=s.accept();
    	Scanner sc=new Scanner(ss.getInputStream());
    	Construction_cost_per_sq_ft=sc.nextInt();
    	area=sc.nextInt();
	    temp=area*Construction_cost_per_sq_ft;
    PrintStream p=new PrintStream(ss.getOutputStream());
    p.println(temp);
    //p.println();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String args[])
{}
}


