package Hello;

public class CheckEmployeeAttendence {

	public static void main(String[] args) 
	{
		double a=5.6;
		double b=6.1;
		
		System.out.println(Math.floor(a));
		System.out.println(Math.floor(b));
		int IS_FULL_TIME=1;
		
		double empCheck=Math.floor(Math.random()*10)%2;
		
		if(empCheck==IS_FULL_TIME)
			System.out.println("Employee is present:-"+empCheck);
		else
			System.out.println("Employee is Absent:-"+empCheck);

	}

}
