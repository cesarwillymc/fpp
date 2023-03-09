package prog1;

public class Main {

	public static void main(String[] args) {
		Address add1A = new Address("10 Adams", "Chicago", "IL", "60290");
		Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
		Address add2A = new Address("322 Harrison", "Chicago", "IL", "60290");
		Address add2B = new Address("2210 Burlington", "Fairfield", "IA", "52556");
		
		Customer e1 = new Customer("Joe", "Smith", "332-22-4444");
		e1.setBillingAddress(add1A);
		e1.setShippingAddress(add1B);
		
		Customer e2 = new Customer("Bill", "Jones", "325-58-9643");
		e2.setBillingAddress(add2B);
		e2.setShippingAddress(add2A);

		Customer[] customers = new Customer[]{e1,e2};

		for (Customer customer: customers){
			if(customer.getBillingAddress().getCity().equals("Chicago")){
				System.out.println(customer);
			}
		}
	}

}
