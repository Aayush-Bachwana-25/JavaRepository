package pack;

public class SomeClass {
	public static MyInterface getMyInterface() {
		return new MyInterface() {
			@Override
			public void disp() {
				// TODO Auto-generated method stub
				System.out.println("Inside anonyomous class disp!");
			}
		};
	}
}
