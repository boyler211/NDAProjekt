package DBLayer;
import ModelLayer.*;

import java.sql.*;

public class OrderDB {
	
	private Connection con;
	public OrderDB(){
		con = dbConnection.getInstance().getDBcon();
	}
	private Order buildOrder(ResultSet results){
		Order OrderObj = new Order();
		try{
			OrderObj.setAmount(results.getString("amount"));
			OrderObj.setTotalPrice(results.getString("totalPrice"));
		}
	       catch(Exception e)
	       {
	           System.out.println("error in building the Order object");
	       }
	       return OrderObj;
	}
	public int updateOrder(Order o){
		Order orderObj = o;
		int rc=-1;
		String query="UPDATE Order SET "+"amount ='"+ orderObj.getAmount()+"', "+"totalPrice ="+ orderObj.getTotalPrice() + "', ";
        System.out.println("Update query:" + query);
  		try{
	 		Statement stmt = con.createStatement();
	 		stmt.setQueryTimeout(5);
	 	 	rc = stmt.executeUpdate(query);

	 	 	stmt.close();
		}
	 	catch(Exception e){
	 	 	System.out.println("Update exception in Orderdb: "+e);
	  	}
		return(rc);
	}
}
