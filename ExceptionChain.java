
public class ExceptionChain {
	void method1() {
		int result=10/0;
	}
	void method2() {
	method1();
	}
	void method3() {
		try {
			method2();
		}
		catch(Exception e){
			System.out.println("exception Handled");
		}
	}

	public static void main(String[] args) {
		ExceptionChain ec=new ExceptionChain();
          // ec.method1();
          // ec.method2();
           ec.method3();
	}

}
