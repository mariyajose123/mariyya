import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Udpclient
{
public static void main(String []args)
{
try
{
DatagramSocket ds=new DatagramSocket();
System.out.println("Enter any String:");
Scanner fromuser=new Scanner(System.in);
String fromkeyboard=fromuser.nextLine();
byte[]b=fromkeyboard.getBytes();
InetAddress ip=InetAddress.getByName("localhost");
DatagramPacket dp=new DatagramPacket(b,b.length,ip,1234);
ds.send(dp);
}
catch(IOException e)
{
System.out.println("Exception is");
e.printStackTrace();
}
}
}

