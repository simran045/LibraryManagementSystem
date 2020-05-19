class Message
{
	int a=10;
	final int b=20;
	static int c=30;
	final static int d=40;
	
	void show()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
	
	static void end()
	{
		System.out.println("Thanks");
	}
	public static void main(String[]args)
	{
		Message obj=new Message();
		
		obj.show();
		
		
		System.out.println("obj.a="+obj.a);
		System.out.println("obj.b="+obj.b);
		//Using Object
		System.out.println("obj.c="+obj.c);
		System.out.println("obj.d="+obj.d);
		//Direct With Name
		System.out.println("c="+c);
		System.out.println("d="+d);
		//Using Class Name
		System.out.println("Message.c="+Message.c);
		System.out.println("Message.d="+Message.d);
		
		end();
		Message.end();
		obj.end();
	}
}
class Outside
{
	//initialise local class variable with non static variable of another class.
	int x=new Message().a;
	
	public static void main(String[]args)
	{
		Message obj=new Message();
		obj.show();
		System.out.println("obj.a="+obj.a);
		System.out.println("obj.b="+obj.b);
		//Using Object
		System.out.println("obj.c="+obj.c);
		System.out.println("obj.d="+obj.d);
		//Using Class Name
		System.out.println("Message.c="+Message.c);
		System.out.println("Message.d="+Message.d);
		
		
		Outside out=new Outside();
		System.out.println("out.x="+out.x);
		
		//end();
		Message.end();
		obj.end();
	}
	
}