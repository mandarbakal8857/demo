package Hello;

public class InstanceStaticMethod 
{
	void run() //Instance Method
	{
		
		
		System.out.println("java....");
	}
	static void create() //Static Method
	{
		System.out.println("Hello..");
	}

	public static void main(String[] args) 
	{
		InstanceStaticMethod Is=new InstanceStaticMethod();
		
		Is.run();
		create();
		

	}

}
