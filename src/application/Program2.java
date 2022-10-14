package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		DepartmentDAO depart = DaoFactory.createDepartmentDao();
		
		List<Department> list = depart.findAll();
		for(Department d : list) {
			System.out.println(d);
		}		
		
		System.out.println("========================================================");
		
		
	}
}
