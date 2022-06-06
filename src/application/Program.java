package application;

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
		
		List<Seller> list = sellerDao.findByDepartment(new Department(2,null));
		System.out.println("findByDepartment test:");
		for(Seller obj : list) {
			System.out.println(obj);
		}
		list = sellerDao.findAll();
		System.out.println("findAll test:");
		for(Seller obj : list) {
			System.out.println(obj);
		}

	}

}
