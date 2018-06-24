package accessModi1;

import accessMember.Test;

public class Sample2 extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 obj=new Sample2();
		System.out.println(obj.publicvariable);
		System.out.println(obj.protectedvariable);
		//you can't call private and default even you use inheritance(extends)
		//System.out.println(obj.privatevariable);
		//System.out.println(obj.defaultvariable);
		
	}

}
