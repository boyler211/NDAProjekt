package CTRLLayer;
import java.sql.*;

import ModelLayer.*;
import DBLayer.*;

public class OrderCTRL {
	public static void main(String[] args) {
		createOrder(dbConnection.getInstance().getDBcon());
	}
	public static void createOrder(Connection con){
		Statement stmt;
		try{
			stmt = con.createStatement();
			stmt.executeQuery("INSERT INTO Order(amount, totalPrice) VALUES('4', '123')");
			stmt.close();
			con.close();
		}
		catch(Exception e){
            e.printStackTrace();
		}
	}
	public static Statement updateOrder(Connection con) throws SQLException{
		Statement stmt;
		stmt = con.createStatement();
		stmt.executeUpdate("UPDATE Order SET amount = '999', totalPrice = '0' WHERE id = 1");
		stmt.close();
		con.close();
		return stmt;
	}
	public static Statement deleteOrder(Connection con) throws SQLException{
		Statement stmt;
		stmt = con.createStatement();
		stmt.executeUpdate("DELETE Order WHERE id = 1");
		stmt.close();
		con.close();
		return stmt;
	}
	public static Statement addPartOrder(Connection con, Order o, PartOrder po) throws SQLException{
		Statement stmt;
		stmt = con.createStatement();
	//	stmt.executeUpdate("Insert/UPDATE Order where id = "+ o.getID());
		stmt.close();
		con.close();
		return stmt;
	}
}
