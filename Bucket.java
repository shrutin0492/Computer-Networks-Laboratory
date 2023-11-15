// package bucket;
import java.util.*;
public class Bucket
{
 static void solution(int pktsize, int output)
 {
 int buketsize=512;
 if(pktsize>buketsize)
 {
 System.out.println("\tBucket overflow");
 }
 else
 {
 while(pktsize>output)
 {
 System.out.println(output+"\tbytes outputed");
 pktsize=pktsize-output;
 }
 if(pktsize>0)
 {
 System.out.println( pktsize+"\tbytes outputed");
 }
 }
 }

 public static void main(String[] args)
 {
 int output,pktsize,n;
 Scanner read=new Scanner(System.in);
 Random rand=new Random();
 System.out.println( "\tEnter output rate: ");
 output=read.nextInt();
 System.out.println( "\tEnter the number of packets: ");
 n=read.nextInt();
 for(int i=1;i<=n;i++)
 {
 pktsize=rand.nextInt(1000);
 System.out.println( " packetno: "+i+" packetsize: "+pktsize);
 solution(pktsize,output);
 }
 }
}