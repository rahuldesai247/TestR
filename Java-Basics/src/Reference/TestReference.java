package Reference;

public class TestReference {
	public static void main(String args[])
	{
		
		
		TestObject obj1=new TestObject();
		TestObject obj2=new TestObject();
		TestObject obj3=new TestObject();
		obj1.setX("x is set");
		//Object2 and Object1 is referenced to same memory address 
		obj2=obj1;
		
		//When Object2 is set ,Memory address referencing is also changed,So Object1 is also changed
		obj2.setX("x reset");
		//Object1 is also set
		System.out.println(obj1.getX());
		
		//Object2 is referenced to new memory address
		obj2=obj3;
		obj2.setX("X is set after resetting to reference to obj3");
		//Object1 is not set after object2 is set to object3
		System.out.println(obj1.getX());
		
		
	}

}
