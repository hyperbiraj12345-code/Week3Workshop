public class MathOperations{
public static void main(String[] args){
 int a=10;
 int b=20;
 int c=a+b;
 System.out.println("The sum is "+c);
 int post=1;
 int pre=1;
 System.out.println(++post);
 System.out.println(pre++);
 System.out.println(" a=10,b=20:a>b:Result is "+(a>b));
 System.out.println("a=10,b=20"+(a>15 || b>10));
 String d=(c>40)?"The sum of a and b is greater than 40 ":"The sum of a and b is less than 40";
  System.out.println(d);
    
}
}