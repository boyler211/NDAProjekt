package CTRLLayer;
import java.sql.*;
import DBLayer.*;


public class DogCTRL {
	
	public static void main(String[] args) throws SQLException {
		createDog(dbConnection.getInstance().getDBcon());
	}

	public static void createDog(Connection con){
		Statement stmt;
		try{
			stmt = con.createStatement();
			stmt.executeQuery("INSERT INTO Dog(name, age, gender, race, vet, injuries, illness, maturity, heat, pseudopregnancy, castrated, relatives, arrival, previousHomes)" 
					+ "VALUES('hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund')");
			stmt.close();
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Statement updateDog(Connection con) throws SQLException{
		Statement stmt;
		stmt = con.createStatement();
		stmt.executeUpdate("UPDATE Dog set name = 'Hundelort', age = '11' where id = 1");
		stmt.close();
		con.close();
		return stmt;
	}
	
	public static Statement deleteCustomer(Connection con) throws SQLException{
		Statement stmt;
		stmt = con.createStatement();
		stmt.executeUpdate("DELETE Dog where id = 1");
		stmt.close();
		con.close();
		return stmt;
	}
}
