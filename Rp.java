import java.io.*;
class Rp
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader
(new InputStreamReader(System.in));
int i=0;
int j=++i + i++ + i++ + i++ + i;
System.out.println(++i);
System.out.println(j);
}
}