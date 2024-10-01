package module6;

public class CustomerTest {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
//			System.out.println("Enter customer id, name,mobile no and address");
		//
//			int custId = sc.nextInt();
//			String name = sc.next();
//			int mobNo = sc.nextInt();
//			String address = sc.next();

		Customer customer = new Customer();
		System.out.println(customer);
//			System.out.println("customer id is: " + customer.getCustId());
//			System.out.println("Customer name is: " + customer.getName());
//			System.out.println("customer mob no is: " + customer.getMobNo());
//			System.out.println("customer address is: " + customer.getAddress());

		System.out.println("---------------------------------");
		Customer customer1 = new Customer(1, "Ank", 9838888, "Pune");
		System.out.println(customer1);
//			System.out.println("customer id is: " + customer1.getCustId());
//			System.out.println("Customer name is: " + customer1.getName());
//			System.out.println("customer mob no is: " + customer1.getMobNo());
//			System.out.println("customer address is: " + customer1.getAddress());

	}

}
