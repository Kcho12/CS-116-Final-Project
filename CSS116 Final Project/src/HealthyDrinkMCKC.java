public class HealthyDrinkMCKC extends DrinkMCKC {//Child of DrinkMCKC. This class is for Healthy Drinks.
	 public String gmocont;//Tells user if drink has Gmo or not
	 SellByDateMCKC date;//This is another class that has month, day, year

	    public HealthyDrinkMCKC(){
	        super();
	        gmocont = "someGmoContent";
	    }

	    public HealthyDrinkMCKC(String nam, String com, String cst, String ssize, String samt, String cal, String gmo, SellByDateMCKC date){
	        super(nam, com, cst, ssize, samt, cal);
	        this.gmocont = gmo;
	        this.date = date;

	    }

	    public String getNatcont() {
	        return gmocont;
	    }

	    public String getExpiration() {
	        return date.month + date.day + date.year;
	    }
	    
	    public void setExpiration(SellByDateMCKC date) {
	    	this.date = date;
	    }

		public void setNatcont(String nat){
	        gmocont = nat;
	    }

	    public String toString(){
	        return super.toString() + " GMO-free status: " + gmocont + " ; " + date + "\n";
	    }
}
