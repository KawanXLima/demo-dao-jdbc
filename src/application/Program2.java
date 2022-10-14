package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDAO depart = DaoFactory.createDepartmentDao();

		List<Department> list = depart.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		System.out.println("========================================================");

		Department department = depart.findById(6);
		System.out.println(department);

		System.out.println("========================================================");
		
		System.out.println("Digite o id para a delecao: ");
		int id = sc.nextInt();
		depart.deleteById(id);
		System.out.println("Delete completed");

		System.out.println("========================================================");

		department = depart.findById(5);
		department.setName("Books");
		depart.update(department);
		System.out.println("Update completed");

		System.out.println("========================================================");

		Department department2 = new Department(null, "Books");
		depart.insert(department2);
		System.out.println("Insert. new id = " + department2.getId());
	}
}
