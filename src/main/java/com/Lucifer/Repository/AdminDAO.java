package com.Lucifer.Repository;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Lucifer.Project.Entity.Admin;
import com.Lucifer.Project.util.ConnectionUtil;

public class AdminDAO {

	public void saveAdmin(Admin admin) {
		Connection connection=ConnectionUtil.getConnection();
		String sql ="INSERT INTO admin(name,password) VALUES (?,?)";
		try {
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1,admin.getName());
		ps.setString(2, admin.getPassword());
		int res =ps.executeUpdate();
		System.out.println(res);
		ps.close();
		
	
	
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setName("tharak");
		admin.setPassword("123");
		AdminDAO dao = new AdminDAO();
		dao.saveAdmin(admin);
	}

}
