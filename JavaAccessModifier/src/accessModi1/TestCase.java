package accessModi1;

import accessModi.ClassA;//beacuse ClassA form accessModi package
//classB we can't import because it is default modifier
//TestCase copied from package accessModi
public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassA obj=new ClassA();
obj.add();
//ClassB obj1=new ClassB(); can't do it
//obj1.show(); can't do it
	}

}
