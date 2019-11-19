package it1_testing;

import org.testng.annotations.Test;

import it1.DBBroker;

public class Order_Manager{

		@Test
		public void place_order() {
			DBBroker a = new DBBroker(); ;
			a.update_DB();
		}
	}
