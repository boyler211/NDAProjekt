package ModelLayer;

public class PartOrder {

	private String serviceName, type, servicePrice;
	private double hours;
	
	public String getServiceName(){
		return serviceName;
	}
	
	public String getType(){
		return type;
	}
	
	public String getServicePrice(){
		return servicePrice;
	}
	
	public double getHours(){
		return hours;
	}
	
	public void setServiceName(String serviceName){
		serviceName = this.serviceName;
	}
	
	public void setType(String type){
		type = this.type;
	}
	
	public void setServicePrice(String servicePrice){
		servicePrice = this.servicePrice;
	}
	
	public void setHours(double hours){
		hours = this.hours;
	}
	
}
