package models;

import java.util.ArrayList;

public class BancoDeDados {
	private final static ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
	private final static ArrayList<Remedio> remedios = new ArrayList<Remedio>();
	private final static ArrayList<Animal> animais = new ArrayList<Animal>();
	private final static ArrayList<Tutor> tutores = new ArrayList<Tutor>();
	
	public static ArrayList<Vacina> getVacinas() {
		return vacinas;
	}
	
	public static ArrayList<Remedio> getRemedios() {
		return remedios;
	}
	
	public static ArrayList<Animal> getAnimais() {
		return animais;
	}
	
	public static ArrayList<Tutor> getTutores() {
		return tutores;
	}
}