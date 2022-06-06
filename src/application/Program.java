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
		System.out.println(seller);
		
		List<Seller> list = sellerDao.findByDepartment(new Department(2,null));
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}

}
