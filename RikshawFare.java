import java.util.Scanner;
public class RikshawFare{
public static void main(String[] args){
 Scanner s=new Scanner(System.in);
 System.out.println("Fee per km=Rs.100 and per minute=Rs.10");
 System.out.println("Charge of night=Rs.1000");
 System.out.println("Enter the distance in km and time in minutes");
 float distance=s.nextFloat();
 float time=s.nextFloat();
 float preTotal=distance*100+time*10;
 System.out.println("Your fare is Rs."+preTotal);
 System.out.println("Is the customer travelling at night: Press 1 if yes, 2 if No");
 int a=s.nextInt();
 float result=(a==1)?preTotal+1000:preTotal;
 System.out.println("Total fare is Rs."+result);
 
 
    
}
}