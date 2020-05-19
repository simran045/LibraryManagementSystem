import java.io.*;
class ReadDataProgarm
{
public static void main(String args[])
throws ToException
{
File file =new file("ReadDataProgram.java");
FileInputStream finput=newFileInputStream(file);
int data;
 while (data=finput.read()>=0)
 {
 System.out.print ((char)data);
 }
}
}