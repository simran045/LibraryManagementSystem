class MyThread implement Runnable
{
public void run ()
{
for (int i=1;i<10;i++)
{
try
{
System.out.print(i+"\t");
thread.sleep(500);
}
catch(InterruptedException e){}
}
}
