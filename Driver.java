package javabegnierprojects;
import java.util.*;
import java.text.*;
public class Driver {
    public static void main(String arg[]) {
    	Scanner sc=new Scanner(System.in);
    	
    System.out.println("Enter your buying price per share:");
    double buyingPrice=sc.nextDouble();
    DecimalFormat deciFormat = new DecimalFormat("0.00");
    double closingPrice=0.0;
    int day=1;
    while(true) {
    	System.out.println("Enter the closing price ont day:"+ day + " If you want to exit then enter any negative value"); 
    	closingPrice=sc.nextDouble();
    	if(closingPrice<0.0) {
    		break;
    	}
    double Earning=closingPrice-buyingPrice;
    if(Earning>0.0) {
    	System.out.println("At end of day: "+ day + " you have earned "+ deciFormat.format(Earning) +" per share");
    	
    	
    }
    else if(Earning<0.0) { 
    	System.out.println("At end of day: "+ day + " you have lost "+ deciFormat.format(-Earning) +" per share");
    	
    	
    }
    else {
    	System.out.println("At end of day: "+ day + " you have lost no Earning per share");
    }
    day++;
    System.out.println("***************************************************************");
    }
     
    }
}
