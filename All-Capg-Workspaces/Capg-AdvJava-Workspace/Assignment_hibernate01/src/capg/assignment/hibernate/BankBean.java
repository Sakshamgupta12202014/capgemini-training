package capg.assignment.hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MyEmployee")
public class BankBean {
	@Id
	@GeneratedValue
	@Column(name = "account_no")
	private int account_no;
	
	@Column(name = "customer_name")
	private String customer_name;
	
	@Column(name = "account_balance")
	private double account_balance;
	
	@Column(name = "mobile_number")
	private long mobile_number;
	
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	
	
}
