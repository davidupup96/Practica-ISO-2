package it1;

import infomine.ProjectISO2.Interfaz_manager;

public class Reserve_manager implements Interfaz_manager{
	public void reserve() {
		System.out.println("Reservar");
	}

	public void cancel_reserve() {
		System.out.println("Cancelar reserva");
	}

	public void modifiy_date() {
		System.out.println("Modificar reserva");
	}

}
