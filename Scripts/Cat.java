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
			Cat habib = new Cat("�����");
			Cat conor = new Cat("�����");
			System.out.println("��� " + i + ": " + habib.name + " vs " + conor.name);
			System.out.println("����� ���� " + habib.name + ": " + habib.getPower());
			System.out.println("����� ���� " + conor.name + ": " + conor.getPower());
			if (habib.fight(conor)) System.out.println("���������: " + habib.name);
			else System.out.println("�����������: " + habib.name);

			if (conor.fight(habib)) System.out.println("���������: " + conor.name);
			else System.out.println("�����������: " + conor.name);
			System.out.println();
		}
	}
}
