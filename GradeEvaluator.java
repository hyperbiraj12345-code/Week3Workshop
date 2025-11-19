import java.util.Scanner;

public class GradeEvaluator{
public static void main(String[] args){
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the marks");
 int mark=s.nextInt();
 String result=(mark<40)?"Fail":"Pass";
 System.out.println(result);
 
 
    
}
}