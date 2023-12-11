class Animal1{  
void eat(){
	System.out.println("Animal is eating...");
	}  
}  
class Dog1 extends Animal1{  
void bark(){
	System.out.println("Dog is barking...");
	}  
}  
class BabyDog extends Dog1{  
void weep(){
	System.out.println("BabyDog is weeping...");
	}  
}  
public class MultilevelInheritanceExample {  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}
}  

