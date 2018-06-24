package methods;

public class Static_NonStatic {
	//static component-->cann't call non-static component directly
	//
	public static void main(String orgs[])
	{
		Static_NonStatic m=new Static_NonStatic();
		m.go();//if static method call non static method have to create an object
	}
	public static void go3()
	{
		System.out.println("inside static go3 method");
		
	}
  public void go() {

	System.out.println("inside go method");
	go1();//non static can call directly other non static method
	go3();//non static can directly call static method without create an object
}
public void go1() {

	System.out.println("inside go1 method");
	go2();
}
public void go2() {

	System.out.println("inside go2 method");
}
}
