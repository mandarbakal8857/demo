package Hello;



public class Print
{
	int q=10;
	static int c=19; //static variable
	
	int add()
	{
		int x=10;
		 
		return x; //local variable
		
	}

	public static void main(String[] args)
	{
		System.out.println("Hello");
		
		int a=10; //instance variable
		int b=10;
		int sum=a+b;
		
		System.out.println("sum:-"+sum);
		 
		Print p=new Print(); //creating object
		System.out.println(p.add()); //local variable access with object reference
		System.out.println(p.q);
		System.out.println(Print.c); //static variable access with class name
		
		
	}

}
