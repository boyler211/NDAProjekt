package DBLayer;
import ModelLayer.*;

import java.sql.*;

public class CustomerDB {

	private Connection con;
	
	public CustomerDB(){
		con = dbConnection.getInstance().getDBcon();
	}
	
	
	
	
	private Customer buildCustomer(ResultSet results)
    {   Customer CustomerObj = new Customer();
        try{ // the columns from the table Customer are used
        	
        	CustomerObj.setFirstName(results.getString("firstName"));
        	CustomerObj.setLastName(results.getString("lastName"));
        	CustomerObj.setPhone(results.getString("phone"));
        	CustomerObj.setEmail(results.getString("email"));
        	CustomerObj.setCountry(results.getString("country"));
        	CustomerObj.setCity(results.getString("city"));
        	CustomerObj.setZipCode(results.getString("zipCode"));
        	CustomerObj.setAddress(results.getString("address"));
        	CustomerObj.setPrevDogs(results.getString("previousDogs"));
        	CustomerObj.setRef(results.getString("ref"));
        	CustomerObj.setEanNumber(results.getString("eanNumber"));
        	CustomerObj.setGardenDescr(results.getString("gardenDescription"));
        	CustomerObj.setKids(results.getString("kids"));
        	CustomerObj.setAnimals(results.getString("animals"));
        	CustomerObj.setAccommodation(results.getString("accommodation"));
              
        }
       catch(Exception e)
       {
           System.out.println("error in building the customer object");
       }
       return CustomerObj;
    }
	
//	@Override
	public int updateCustomer(Customer cus)
	{
		Customer cusObj  = cus;
		int rc=-1;

		String query="UPDATE Customer SET "+
		 	  "firstName ='"+ cusObj.getFirstName()+"', "+
		 	  "lastName ='"+ cusObj.getLastName() + "', " +
              "phone ='"+ cusObj.getPhone() + "', " +
		 	  "country ="+ cusObj.getCountry() + "', " +
              "city ='"+ cusObj.getCity() + "' " +
		 	  "zipCode ="+ cusObj.getZipCode() + "', " +
              "address ="+ cusObj.getAddress() + "', " +
		 	  "previousDogs ="+ cusObj.getPrevDogs() + "', " +
              "ref ="+ cusObj.getRef() + "', " +
		 	  "eanNumber ="+ cusObj.getEanNumber() + "', " +
              "gardenDescription ="+ cusObj.getGardenDescr() + "', " +
		 	  "kids ="+ cusObj.getKids() + "', " +
              "animals ="+ cusObj.getAnimals() + "', " +
		 	  "accommodation ="+ cusObj.getAccommodation() + "', ";
	     //     " WHERE ssn = '"+ cusObj.getSsn() + "'";
                System.out.println("Update query:" + query);
  		try{ // update employee
	 		Statement stmt = con.createStatement();
	 		stmt.setQueryTimeout(5);
	 	 	rc = stmt.executeUpdate(query);

	 	 	stmt.close();
		}//slut try
	 	catch(Exception ex){
	 	 	System.out.println("Update exception in employee db: "+ex);
	  	}
		return(rc);
	}
	
	
}
