package Bai4;

import java.util.ArrayList;

public class PhoneBook extends CustomerPhone {

	private ArrayList<CustomerPhone> phonelist = new ArrayList<CustomerPhone>();
	private ArrayList<CustomerPhone> searchlist = new ArrayList<CustomerPhone>();

	public int IndexOfName(ArrayList<CustomerPhone> phonelist, String name) {
		for (int i = 0; i < phonelist.size(); i++) {
			if (phonelist.get(i).getName().compareToIgnoreCase(name) == 0)
				return i;
		}
		return -1;
	}

	public void AddCustomerPhone(CustomerPhone A) {
		if (IndexOfName(phonelist, A.getName()) != -1) {
			System.out.println("Người này đã có tên trong danh sách");
		} else {
			phonelist.add(A);
			System.out.println("Thêm thành công!");
		}
	}

	CustomerPhone SearchByName(String name) {
		return phonelist.get(IndexOfName(phonelist, name));
	}

	public void ShowCustomerPhoneBookByName(String name) {
		if(IndexOfName(phonelist, name)==-1) {
			System.out.println("Không có tên này trong danh sách!");
		}
		else {
			System.out.println("Thông tin của người bạn cần tìm: ");
			SearchByName(name).ShowInfo();
		}
		
	}

	public void SearchByAge(int age1, int age2) {
		for (int i = 0; i < phonelist.size(); i++) {
			if (phonelist.get(i).getAge() >= age1 && phonelist.get(i).getAge() <= age2) {
				searchlist.add(phonelist.get(i));
			}
		}
	}

	public void ShowCustomerPhoneBookByAge() {
		if (searchlist.size() == 0) {
			System.out.println("Không có ai trong khoảng tuổi trên!");
		} else {
			System.out.println("Thông tin của người bạn cần tìm: ");
			for (CustomerPhone x : searchlist) {
				x.ShowInfo();
			}
			searchlist.clear();
		}
	}

	public void ShowAllPhoneBook() {
		for (CustomerPhone x : phonelist) {
			x.ShowInfo();
		}
	}
//	public CustomerPhone Search(int age1,int age2) {
//		
//		
//	}
}
