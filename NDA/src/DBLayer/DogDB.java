package DBLayer;
import ModelLayer.*;

import java.sql.*;

public class DogDB {
	private Connection con;
	
	public DogDB(){
		con = dbConnection.getInstance().getDBcon();
	}
	
	private Dog buildDog(ResultSet results){
		Dog DogObj = new Dog();
		try{
			DogObj.setName(results.getString("name"));
			DogObj.setAge(results.getString("age"));
			DogObj.setGender(results.getString("gender"));
			DogObj.setRace(results.getString("race"));
			DogObj.setVet(results.getString("vet"));
			DogObj.setInjuries(results.getString("injuries"));
			DogObj.setIllness(results.getString("illness"));
			DogObj.setMaturity(results.getString("maturity"));
			DogObj.setHeat(results.getString("heat"));
			DogObj.setPseudopregnancy(results.getString("pseudopregnancy"));
			DogObj.setCastrated(results.getString("castrated"));
			DogObj.setRelatives(results.getString("relatives"));
			DogObj.setArrival(results.getString("arrival"));
			DogObj.setPreviousHomes(results.getString("previousHomes"));
		}
	       catch(Exception e)
	       {
	           System.out.println("error in building the Dog object");
	       }
	       return DogObj;
	}
	
	public int updateDog(Dog d){
		Dog dogObj = d;
		int rc=-1;

		String query="UPDATE Dog SET "+
		 	  "name ='"+ dogObj.getName()+"', "+
		 	  "age ='"+ dogObj.getAge() + "', " +
              "gender ='"+ dogObj.getGender() + "', " +
		 	  "race ="+ dogObj.getRace() + "', " +
              "vet ='"+ dogObj.getVet() + "' " +
		 	  "injuries ="+ dogObj.getInjuries()+ "', " +
              "illness ="+ dogObj.getIllness() + "', " +
		 	  "maturity ="+ dogObj.getMaturity() + "', " +
              "heat ="+ dogObj.getHeat()+ "', " +
		 	  "pseudopregnancy ="+ dogObj.getPseudopregnancy() + "', " +
              "castrated ="+ dogObj.getCastrated() + "', " +
		 	  "relatives ="+ dogObj.getRelatives() + "', " +
              "arrival ="+ dogObj.getArrival() + "', " +
		 	  "previousHomes ="+ dogObj.getPreviousHomes() + "', ";
		
        System.out.println("Update query:" + query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return(rc);
	}
	
}
