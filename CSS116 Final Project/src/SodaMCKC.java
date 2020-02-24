public class SodaMCKC extends DrinkMCKC {//Child of DrinkMCKC. This class is for Carbonated Drinks or Soda.
    public String sugar; //in grams
    public String caffeine; // in milligrams

    public SodaMCKC(){
        super();
        sugar = "someSugar";
        caffeine = "someCaffeine";
    }

    public SodaMCKC(String nam, String com, String cst, String ssize, String samt, String cal, String suga, String caff){
        super(nam, com, cst, ssize, samt, cal);
        this.sugar = suga;
        this.caffeine = caff;
    }

    public String getSugar() {
        return sugar;
    }

    public String getCaffeine() {
        return caffeine;
    }

    public void setSugar(String suga){
        sugar = suga;
    }

    public void setCaffeine(String caff){
        caffeine = caff;
    }

    public String toString(){
        return super.toString() + "Sugar content:" + sugar + "grams ; Caffeine:" + caffeine+ "mg \n";
    }
    
    public String dailyIntake() {//This overridden method will additionally calculate sugar and caffeine intake.
    	double percentSug; 
    	double percentCaf; 
    	percentSug = Math.round((Double.valueOf(this.sugar)/36.0)*100.0);
    	percentCaf =Math.round((Double.valueOf(this.caffeine)/400.0)*100.0);
    	return super.dailyIntake() + "Also one serving contains " + percentSug + "% of your daily sugar intake along with " +
    			percentCaf + "% of your daily caffeine intake.";
    	
    }
}
