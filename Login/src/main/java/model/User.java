package model;
/**
 * ”√ªß¿‡
 * @author ASUS
 *
 */
public class User {
	private static String username;
	private String password;
	public User() {
		
	}
	public User(String username,String password) {
	this.password=password;
	this.username=username;
	}
	public String getuser() {
		return this.username;
	}
	public void setuser(String username) {
		this.username=username;
	}
	public String getpass() {
		return this.password;
	}
	public void setpass(String password) {
		this.password=password;
	}
	
}
