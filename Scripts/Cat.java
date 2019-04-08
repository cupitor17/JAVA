public class Cat {
	int weight;
	int age;
	int strength;
	String name;

	public Cat(String name) {
		this.weight	= this.randomInt();
		this.age = this.randomInt();
		this.strength = this.randomInt();
		this.name = name;
	}

	private int randomInt() {
		return (int) (Math.random() * 10);
	}

	public boolean fight(Cat anotherCat) {
		return this.getPower() > anotherCat.getPower();
	}

	public int getPower() {
		return this.weight + this.age + this.strength;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			Cat habib = new Cat("Хабиб");
			Cat conor = new Cat("Конор");
			System.out.println("Бой " + i + ": " + habib.name + " vs " + conor.name);
			System.out.println("Общая сила " + habib.name + ": " + habib.getPower());
			System.out.println("Общая сила " + conor.name + ": " + conor.getPower());
			if (habib.fight(conor)) System.out.println("Побеждает: " + habib.name);
			else System.out.println("Проигрывает: " + habib.name);

			if (conor.fight(habib)) System.out.println("Побеждает: " + conor.name);
			else System.out.println("Проигрывает: " + conor.name);
			System.out.println();
		}
	}
}
