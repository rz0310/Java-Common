package www.Oracle.com;

public class Address {
	//����˽�еĳ�Ա����
	private String address;
	private String zipCode;
	//�޲ι��췽��
	public Address() {
		super();
	}
	//���ι��췽��
	public Address(String ad,String zC) {
		address = ad;
		zipCode = zC;
	}
	//˽�����Ե�get()��set()����
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
