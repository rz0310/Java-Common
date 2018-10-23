package www.Oracle.com;

public class Address {
	//定义私有的成员属性
	private String address;
	private String zipCode;
	//无参构造方法
	public Address() {
		super();
	}
	//带参构造方法
	public Address(String ad,String zC) {
		address = ad;
		zipCode = zC;
	}
	//私有属性的get()和set()方法
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
