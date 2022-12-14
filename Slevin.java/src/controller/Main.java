package controller;

import model.SuperUtente;

public class Main {

	public static void main(String[] args) {
		
		SuperUtente admin=new SuperUtente();
		
		admin.setNome("luigi");
		admin.setCognome("tremante");
		System.out.println(admin.toString());
		
	}

}
