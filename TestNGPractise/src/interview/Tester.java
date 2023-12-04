package interview;
//

//class A
//{
//    void m1()
//    {
//        System.out.println("In m1 A");
//    }
//
//	void m2() {
//		// TODO Auto-generated method stub
//		System.out.println("A class m2");
//		
//	}
//}
//class B extends A
//{
//    void m1()
//    {
//        System.out.println("In m1 B");
//    }
//    void m2()
//    {
//        System.out.println("In m2 B");
//    }
//}
//public class Tester {
// 
//    public static void main(String[] args) {
//        A a=new B();
//        a.m1();
//    }
//}

public class Tester {
	public static void main(String[] args) {
		System.out.println(exceptionTest());
	}

	public static int exceptionTest() {
		int i = 6;
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			i = 10;
			return i;
		} finally {
			i = 20;
			System.out.println("In finally block");
		}

	}
}
