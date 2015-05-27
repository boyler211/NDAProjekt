package ModelLayer;

public class Problem {
	private boolean isPlaying, isGrowling, isAfraid, hasBitten;
	private String when, who, situation;
	
	public boolean getIsPlaying(){
		return isPlaying;
	}
	
	public boolean getIsGrowling(){
		return isGrowling;
	}
	
	public boolean getIsAfraid(){
		return isAfraid;
	}
	
	public boolean getHasBitten(){
		return hasBitten;
	}
	
	public String getWhen(){
		return when;
	}
	
	public String getWho(){
		return who;
	}
	
	public String getSituation(){
		return situation;
	}
	
	public void setIsPlaying(boolean isPlaying){
		isPlaying = this.isPlaying;
	}
	
	public void setIsGrowling(boolean isGrowling){
		isGrowling = this.isGrowling;
	}
	
	public void setIsAfraid(boolean isAfraid){
		isAfraid = this.isAfraid;
	}
	
	public void setHasBitten(boolean hasBitten){
		hasBitten = this.hasBitten;
	}
	
	public void setWhen(String when){
		when = this.when;
	}
	
	public void setWho(String who){
		who = this.who;
	}
	
	public void setSituation(String situation){
		situation = this.situation;
	}
	
}
