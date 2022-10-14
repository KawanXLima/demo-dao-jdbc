package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDAO sd = DaoFactory.createSellerDao();
		
		Seller seller = sd.findById(3);
		
		System.out.println(seller);
		
		System.out.println("============================================");

		
		Department department = new Department(2, null);
		
		List<Seller> list = sd.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("============================================");
		list = sd.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}
}
