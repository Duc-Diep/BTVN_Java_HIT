package Bai4;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PhoneBook phonebook = new PhoneBook();

	public static void main(String[] args) {
		phonebook.AddCustomerPhone(new CustomerPhone("Doan", 20, "01274629523"));
		phonebook.AddCustomerPhone(new CustomerPhone("Khánh", 19, "01274729523"));
		phonebook.AddCustomerPhone(new CustomerPhone("Linh", 20, "01486739523"));
		phonebook.AddCustomerPhone(new CustomerPhone("Điệp", 20, "01228609523"));
		int choice;
		
		do {
			System.out.println("--------------Phonebook Menu-------------");
			System.out.println("0.Exit");
			System.out.println("1.AddCustomerPhone");
			System.out.println("2.SearchByName");
			System.out.println("3.SearchByAge");
			System.out.println("4.ShowAll");
			System.out.println("Your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				AddCustomerPhone();
				break;
			case 2:
				SearchByName();
				break;
			case 3:
				SearchByAge();
				break;
			case 4:
				phonebook.ShowAllPhoneBook();
			}
		} while (choice!=0);
	}

	public static void AddCustomerPhone() {
		sc.nextLine();
		System.out.println("Nhập tên: ");
		String inname = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		int inage = sc.nextInt();
		System.out.println("Nhập phone: ");
		sc.nextLine();
		String inphone = sc.nextLine();
		phonebook.AddCustomerPhone(new CustomerPhone(inname, inage, inphone));
	}

	public static void SearchByName() {
		System.out.println("Nhập tên cần tìm: ");
		sc.nextLine();
		String inname = sc.nextLine();
		phonebook.ShowCustomerPhoneBookByName(inname);
	}

	public static void SearchByAge() {
		System.out.println("Nhập tuổi min: ");
		int age1 = sc.nextInt();
		System.out.println("Nhập tuổi max: ");
		int age2 = sc.nextInt();
		phonebook.SearchByAge(age1, age2);
		phonebook.ShowCustomerPhoneBookByAge();
	}
}
