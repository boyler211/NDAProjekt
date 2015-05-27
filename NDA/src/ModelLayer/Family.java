package ModelLayer;

public class Family {
	private String kids, animals, accomodation, gardenDescription;
	private boolean hasGarden;
	
	public String getKids(){
		return kids;
	}
	
	public String getAnimals(){
		return animals;
	}
	
	public String getAccomodation(){
		return accomodation;
	}
	
	public String getGardenDescription(){
		return gardenDescription;
	}
	
	public boolean getHasGarden(){
		return hasGarden;
	}
	
	public void setKids(String kids){
		kids = this.kids;
	}
	
	public void setAnimals(String animals){
		animals = this.animals;
	}
	
	public void setAccomodation(String accomodation){
		accomodation = this.accomodation;
	}
	
	public void setGardenDescription(String gardenDescription){
		gardenDescription = this.gardenDescription;
	}
	
	public void setHasGarden(boolean hasGarden){
		hasGarden = this.hasGarden;
	}
}
