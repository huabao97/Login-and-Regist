package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	
	
/**
 * 登录验证
 * @param con
 * @param user
 * @return
 * @throws Exception
 */
	public User login(Connection con,User user) throws Exception {
		User resultuser=null;
		String sql="select * from users where username= ? and password= ? ";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,user.getuser() );
		pst.setString(2,user.getpass() );
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			resultuser=new User();
			resultuser.setuser(rs.getString("username"));
			resultuser.setpass(rs.getString("password"));
			
		}
		return resultuser;
	}
	/**
	 * 注册功能
	 * @param con
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean regist(Connection con ,User user)throws Exception {
		boolean flag=false;
		String sql="insert into users(username,password)values(?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, user.getuser());
		pst.setString(2, user.getpass());
		if(pst.executeUpdate()==1) {
			flag=true;
		}		
		return flag;
	}
}
