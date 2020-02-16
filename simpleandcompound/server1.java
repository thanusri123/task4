package task4.maven;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
static {
	double pr,t,rate,sim,com;
	ServerSocket s;
	try {
		s = new ServerSocket(8080);
	   Socket ss=s.accept();
    	Scanner sc=new Scanner(ss.getInputStream());
	   pr=sc.nextDouble();
	 t=sc.nextDouble();
	rate=sc.nextDouble();
	sim=(pr * t * rate)/100;
    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
    PrintStream p=new PrintStream(ss.getOutputStream());
    p.println(sim);
    p.println(com);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String args[])
{}
}
