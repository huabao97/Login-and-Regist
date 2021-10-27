package model;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database_Connection {
	private String url="jdbc:mysql://127.0.0.1:3306/jdbcdata?characterEncoding=UTF-8";
	private String username="root";
	private String password="";
	

	/**
	 * 连接数据库
	 * @return
	 * @throws Exception
	 */
	public Connection get_con() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("数据库驱动加载成功 ！");
		Connection c=DriverManager.getConnection(url,username,password);
		return c;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Database_Connection db_con=new Database_Connection();
		try {
			db_con.get_con();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
