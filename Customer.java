package module6;

public class Customer {

	private int custId;
	private String name;
	private int mobNo;
	private String address;

	public Customer() {
		custId = 0;
		name = null;
		mobNo = 0;
		address = null;
	}

	public Customer(int custId, String name, int mobNo, String address) {
		super();
		this.custId = custId;
		this.name = name;
		this.mobNo = mobNo;
		this.address = address;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", mobNo=" + mobNo + ", address=" + address + "]";
	}

}
