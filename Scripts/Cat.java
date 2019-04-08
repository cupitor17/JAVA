public class Cat {
	int weight;
	int age;
	int strength;
	String name;

	/**
	Конструктор класса, принимает один параметр - имя кота
	@param name: Имя котана
	*/
	public Cat(String name) {
		// this указывает на создаваемый образец класса
		// можно писать и без него, но так понятнее откуда что берется
		this.weight	= this.randomInt();
		this.age = this.randomInt();
		this.strength = this.randomInt();
		this.name = name;
	}

	/**
	Генерирует случайное целое число от 0 до 10
	*/
	private int randomInt() {
		return (int) (Math.random() * 10);
	}

	/**
	Определяет какой кот сильнее. Если текущий кот (this)
	сильнее возвращает true иначе false
	*/
	public boolean fight(Cat anotherCat) {
		return this.getPower() > anotherCat.getPower();
	}

	/**
	Возвращает силу котана равную сумме его веса, силы и возраста
	*/
	public int getPower() {
		return this.weight + this.age + this.strength;
	}

	/**
	Создает 5 раз два экземпляра класса Cat и проверяет кто победит
	*/
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
