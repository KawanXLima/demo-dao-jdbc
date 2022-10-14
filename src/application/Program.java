package application;

import java.util.Date;
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
		
		System.out.println("============================================");
		
		Seller seller2 = new Seller(null, "greg","greg@gmail.com", new Date(), 4000.00, department);
		sd.insert(seller2);
		System.out.println("Insert. new id = "+ seller2.getId());
		
	}
}
