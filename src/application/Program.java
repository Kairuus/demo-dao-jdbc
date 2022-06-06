package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(4);
		System.out.println("findById test:");
		System.out.println(seller);
		
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		System.out.println("findByDepartment test:");
		for(Seller obj : list) {
			System.out.println(obj);
		}
		list = sellerDao.findAll();
		System.out.println("findAll test:");
		for(Seller obj : list) {
			System.out.println(obj);
		}

		Seller newseller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0,department);
		System.out.println("insert test: ");
		sellerDao.insert(newseller);
		System.out.println(newseller);
		
		
		seller = sellerDao.findById(1);
		seller.setName("Bruce Wayne");
		sellerDao.update(seller);
		System.out.println("update test: ");
		System.out.println(seller);
	}

}
