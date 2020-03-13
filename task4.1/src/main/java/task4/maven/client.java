package task4.maven;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class client {
	private static  Logger LOGGER1=LogManager.getLogger(client.class);
	static {
 try {	
	double pr, rate, t, temp,temp1;
    Scanner sc=new Scanner (System. in);
    Socket s=new Socket("127.0.0.1",8004);
	Scanner sc1=new Scanner(s.getInputStream());
    System.out.println("Enter the amount:");
    pr=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    t=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rate=sc.nextDouble();
    PrintStream p=new PrintStream(s.getOutputStream());
    p.println(pr);
    p.println(t);
    p.println(rate);
    temp=sc1.nextDouble();
    temp1=sc1.nextDouble();
    LOGGER1.debug("SI,CI for given values");
    LOGGER1.debug("SIMPLE INTEREST : "+temp);
    LOGGER1.debug("COMPOUND INTEREST : "+temp1);
    //System.out.println(temp);
   // System.out.println(temp1);
    
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String args[]) {
	//
}
}
