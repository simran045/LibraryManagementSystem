class ExampleOfThread
{
public static void main(String[] args) throws InterruptedException
{
for (int i=1;i<10;i++)

{
System.out.print(i+"\t");
Thread.sleep(500);
}
}





}