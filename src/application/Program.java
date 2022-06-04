package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Seller seller = new Seller(1,"Kairuus","kingkairuus@gmail.com",new Date(),2000.0,new Department(1,"Books"));
		
		System.out.println(seller);
	}

}
