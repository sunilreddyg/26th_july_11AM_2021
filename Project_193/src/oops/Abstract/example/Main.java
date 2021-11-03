package oops.Abstract.example;

public class Main 
{

	public static void main(String[] args) {
		


		Dog dog=new Dog();
		dog.makesourd();
		dog.sleep();
		
		
		Cat cat=new Cat();
		cat.makesourd();
		cat.sleep();
		
		//Abstract class allow static methods to call directly...
		System.out.println(Animal.life);
		

	}

}
