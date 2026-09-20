package practice;

class Animal {
	public void sleep() {
		System.out.println("Animals Sleep");
	}
	public void move() {
		System.out.println("Animals Move");
	}
}

class Carnivorous extends Animal {
	public void hunt() {
		System.out.println("Farm to Eat");
	}
}

class Herbivorous extends Animal {
	public void farm() {
		System.out.println("Hunt to Eat");
	}
}

class Omnivorous extends Animal {
	public void buy() {
		System.out.println("Buy to Eat");
	}
}

class Tiger extends Carnivorous {
	
}

class Cow extends Herbivorous {
	
}

class Dog extends Omnivorous {
	
}

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t = new Tiger();
		System.out.println("TIger");
		t.sleep();
		t.move();
		t.hunt();
		System.out.println("---------------------------------------");
		Cow c = new Cow();
		System.out.println("Cow");
		c.sleep();
		c.move();
		c.farm();
		System.out.println("---------------------------------------");
		Dog d = new Dog();
		System.out.println("Dog");
		d.sleep();
		d.move();
		d.buy();
		System.out.println("---------------------------------------");
	}

}
