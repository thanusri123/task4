	import java.io.IOException;
	import java.io.PrintStream;
	import java.net.Socket;
	import java.net.UnknownHostException;
	import java.util.Scanner;
	public class client2 {
	static {
		try {
		double  temp;
		int Construction_cost_per_sq_ft = 0,area;
		int material;
	    Scanner sc=new Scanner (System. in);
	    Socket s=new Socket("127.0.0.1",8080);
		Scanner sc1=new Scanner(s.getInputStream());
		 System.out.println("Enter the material standards:(choose 1,2,3,4)");
		System.out.println("1.standard materials\n2.above standard materials\n3.high standard material\n4.high standard material and fully automated home");
	   
	    material=sc.nextInt();
	    switch(material)
	    {
	    case 1:Construction_cost_per_sq_ft+=1200;break;
	    case 2:Construction_cost_per_sq_ft+=1500;break;
	    case 3:Construction_cost_per_sq_ft+=1800;break;
	    case 4:Construction_cost_per_sq_ft+=2500;break;
	    default:   	   System.out.println("/Enter material standards");
	    }
	    System. out. println("Enter the Area of house:");
	    area=sc.nextInt();
	    PrintStream p=new PrintStream(s.getOutputStream());
	    p.println(Construction_cost_per_sq_ft);
	    p.println(area);
	    
	    temp=sc1.nextInt();
	    
	    System.out.println("Total Cost:"+temp);
	 
	    
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


