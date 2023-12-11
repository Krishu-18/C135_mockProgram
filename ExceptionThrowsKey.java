import java.io.IOException;
public class ExceptionThrowsKey {
     void method1() throws IOException{
    	 throw new IOException ("device error");
     }
     void method2() throws IOException{
    	 method1();
     }
     void method3() {
    	 try {
    		 method2();    	
    		 }
    	 catch(Exception e) {
    		 System.out.println("exception handled");
    		 System.out.println(e.getMessage());
    		 System.out.println(e);
    	 }
     }
	public static void main(String[] args) {
		ExceptionThrowsKey etk=new ExceptionThrowsKey();
		etk.method3();

	}

}
