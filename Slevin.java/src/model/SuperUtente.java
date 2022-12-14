package model;

public class SuperUtente extends Utente{

	public SuperUtente(String nome, String cognome, String email, String password) {
		super(nome, cognome, email, password);

	}

	public SuperUtente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPermesso() {
		return 1;
	}

}
