package infomine.ProjectISO2;
<<<<<<< HEAD
=======

import Iteration6.Interface_Payment;
>>>>>>> refs/remotes/origin/Features
import it1.UI_manager;
import it1.UI_orders;

public interface UI_General extends UI_manager, UI_orders,Interface_Payment {
	public void reserve();

	public void cancel_reserve();

	public void modifiy_date();
	
	public void place_order();
	
	public void generateBill();
	
	public void cancelBill();
}
