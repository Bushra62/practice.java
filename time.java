import java.util.Scanner;
public class Time
{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
float speed,distance,time;
System.out.print("enter speed & distance");
speed=scan.nextFloat( )
distance=scan.nextFloat( )
time=distance/speed;
System.out.print("time is"+time);
}
}
