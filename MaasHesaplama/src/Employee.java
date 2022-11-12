
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public int bonus() {
		if (workHours > 40) {
			int bonus = (workHours - 40) * 30;
			return bonus;
		}
		return 0;
	}

	public double tax() {
		if (this.salary < 1000) {
			return salary;
		} else {
			double tax = salary * 0.03;
			return tax;
		}
	}

	public double raiseSalary() {
		if (hireYear <= 0 || hireYear > 2021) {
			System.out.println("Geçersiz Yýl. Tekrar bir çalýþma yili giriniz. ");
		} else {
			int farkYil = 2021 - hireYear;
			double zam;
			if (farkYil > 0 && farkYil < 10) {
				zam = salary * 0.5;
				return zam;
			} else if (farkYil > 9 && farkYil < 20) {
				zam = salary * 0.1;
				return zam;
			} else if (farkYil > 19) {
				zam = salary * 0.15;
				return zam;
			} else if (farkYil == 0) {
				return 0;
			}

		}
		return 0;
	}

	public String toString() {
		double total = salary - tax() + bonus() + raiseSalary();
		double tot = salary + bonus() - tax();
		System.out.println("Adý : " + name);
		System.out.println("Maaþý : " + salary);
		System.out.println("Çalýþma Saati : " + workHours);
		System.out.println("Baþlangýç Yýlý : " + hireYear);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maaþ artýþý : " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaþ : " + tot);
		System.out.println("Toplam Maaþ : " + total);

		return null;
	}

}
