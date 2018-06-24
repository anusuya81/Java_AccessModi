package methods;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=(int)(Math.random()*20);
System.out.println(num);;
if(num>10)
	System.out.println(num+ " is greater than 10");
else if(num>=5 && num<=10)
	System.out.println(num+ " between 5 and 10");
else
	System.out.println(num+" is less than 10");
	}

}
