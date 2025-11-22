public class DefaultValues{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
public static void main(String[] args){
    DefaultValues df=new DefaultValues();
System.out.println("Default value of byte is "+df.a);
 System.out.println("Default value of short is "+df.b);
 System.out.println("Default value of int is "+df.c);
 System.out.println("Default value of long is "+df.d);
 System.out.println("Default value of float is "+df.e);
 System.out.println("Default value of double is "+df.f);
 System.out.println("Default value of char is "+df.g);
 System.out.println("Default value of boolean is "+df.h);
 //This wont work for local variables because they dont get local values
}
}