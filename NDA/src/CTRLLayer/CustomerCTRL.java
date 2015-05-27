package CTRLLayer;
import java.sql.*;
import ModelLayer.*;
import DBLayer.*;

public class CustomerCTRL {
	
	public static void main(String[] args) throws SQLException {
		//createCustomer(dbConnection.getInstance().getDBcon());
		updateCustomer(dbConnection.getInstance().getDBcon());
		//deleteCustomer(dbConnection.getInstance().getDBcon());
		
	}
	
	
		public static void createCustomer(Connection con)
	    {
	        Statement stmt;
	        try
	        {
	            stmt = con.createStatement();
	            stmt.executeQuery("INSERT INTO Customer(firstName, lastName, phone, email, country, city, zipCode, address, previousDogs, ref, eanNumber, gardenDescription, kids, animals, accommodation) "
	            		+ "VALUES('hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest')");
	            
	            stmt.close();
	            con.close();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
		
    	}
		
		
		public static Statement updateCustomer(Connection con) throws SQLException{
			Statement stmt;
				stmt = con.createStatement();
				//stmt.executeUpdate("UPDATE Customer(firstName, lastName, phone, email, country, city, zipCode, address, previousDogs, ref, eanNumber, gardenDescription, kids, animals, accommodation)" + "VALUES('test, 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest')");
				stmt.executeUpdate("UPDATE Customer set firstName = 'lort', lastName = 'asdas' where id = 2");
				stmt.close();
				con.close();
				return stmt;
		}
		
		public static Statement deleteCustomer(Connection con) throws SQLException{
			Statement stmt;
			stmt = con.createStatement();
			stmt.executeUpdate("DELETE Customer where id = 1");
			stmt.close();
			con.close();
			return stmt;
		}
		
		public static Statement findCustomer(Connection con, Customer c) throws SQLException{
			Statement stmt;
			stmt = con.createStatement();
			stmt.executeQuery("SELECT * FROM Customer WHERE phone ='" + c.getPhone() + "'");
			stmt.close();
			con.close();
			return stmt;
		}
		
		
		//public int updateCustomer(String firstName, String lastName, String phone, String country, String city, String zipCode, String address, String previousDogs, String ref, String eanNumber, String gardenDescription, String kids, String animals, String accommodation){

			
		
		
}
