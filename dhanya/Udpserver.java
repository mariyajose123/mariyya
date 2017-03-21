import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Udpserver
{
public static void main(String[] args)
{
try
{
DatagramSocket ds1=new DatagramSocket(1234);
byte[]b=new byte[100];
DatagramPacket dp=new DatagramPacket(b,b.length);
ds1.receive(dp);
String fromclient=new String(b);
System.out.println("Received from client:"+fromclient);
}
catch(IOException e)
{
System.out.println("Exception is");
e.printStackTrace();
}
}
}

