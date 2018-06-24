package methods;

public class PredefinedMethods {

	public static void main(String[] args) {
	//random method is display decimal value 0 to 9	
     double num = Math.random()*10;
     System.out.println(num);
     //type cast-->if you want the result change double to int
     int num1=(int)(Math.random()*5);//if you change 10 into 5 it will give the result 0 to 4
     System.out.println(num1);
       
	}

}
