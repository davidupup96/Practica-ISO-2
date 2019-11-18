package it1;

public class Order_manager implements UI_orders{
//places orders and calls dbbroker
	
	public void place_order() {
		DBBroker a = new DBBroker(); ;
		a.update_DB();
	}
}
