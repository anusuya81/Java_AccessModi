package accessModi1;

import accessMember.Test;//you have to import accessMember package to call

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test();
		System.out.println(obj.publicvariable);
		//private,protected,default variable not accessible in outside of the package
		//these three are in other package
		//System.out.println(obj.privatevariable);
		//System.out.println(obj.protectedvariable);
		//System.out.println(obj.defaultvariable);
		
	}

}
