class Animal2{  
void eat()
{
	System.out.println("Animal is eating...");
	}  
}  
class Dog2 extends Animal2{  
void bark()
{
	System.out.println("Dog is barking...");
	}  
}  
class Cat extends Animal2{  
void meow()
{
	System.out.println("Cat is meowing...");
	}  
}  
public class HeirarchicalInheritanceExample{  
public static void main(String args[]){  
Dog2 d=new Dog2();  
Cat c = new Cat();
d.eat();  
d.bark();
c.meow(); 
}
}  

