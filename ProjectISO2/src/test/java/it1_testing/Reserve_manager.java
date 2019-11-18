package it1_testing;

import org.testng.annotations.Test;

public class Reserve_manager {
	@Test
	public void reserve() {
		System.out.println("Reservar");
	}
	@Test
	public void cancel_reserve() {
		System.out.println("Cancelar reserva");
	}
	@Test
	public void modifiy_date() {
		System.out.println("Modificar reserva");
	}

}