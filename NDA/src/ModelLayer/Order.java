package ModelLayer;

public class Order {
	private String amount, totalPrice;
	
		public String getAmount(){
				return amount;
		}
	
		public String getTotalPrice(){
			return totalPrice;
		}
		
		public void setAmount(String amount){
			amount = this.amount;
		}
		
		public void setTotalPrice(String totalPrice){
			totalPrice = this.totalPrice;
		}
}
