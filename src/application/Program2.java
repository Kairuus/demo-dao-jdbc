package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = departmentDao.findById(4);
		System.out.println("findById test:");
		System.out.println(dep);
		
		
		List<Department>list = departmentDao.findAll();
		System.out.println("findAll test:");
		for(Department obj : list) {
			System.out.println(obj);
		}

		Department newDepartment = new Department(5,"Games");
		System.out.println("insert test: ");
		departmentDao.insert(newDepartment);
		System.out.println(newDepartment);
		
		
		dep = departmentDao.findById(3);
		dep.setName("Movies");
		departmentDao.update(dep);
		System.out.println("update test: ");
		System.out.println(dep);
		
		System.out.println("delete test: ");
		departmentDao.deleteById(1);
		
	}

}