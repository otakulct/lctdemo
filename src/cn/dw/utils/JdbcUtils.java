package cn.dw.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

//工具类，用来连接数据库
public class JdbcUtils {

	public static void main(String[] args) {
		System.out.println(JdbcUtils.getconnection());
	}
	//不同数据库不同驱动程序，就是数据库使用说明书，驱动建议加载一次
	static {
		//静态块，此快在类加载JVM的时候会执行，且执行一次
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
	public static Connection getconnection(){
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
}
