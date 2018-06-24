package accessMember;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj1=new Test();
		System.out.println(obj1.publicvariable);
		//System.out.println(obj1.privatevariable);//can't call outside of other class in same package also
		System.out.println(obj1.protectedvariable);
		System.out.println(obj1.defaultvariable);
		
	}

}
