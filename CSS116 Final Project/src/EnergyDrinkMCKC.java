public class EnergyDrinkMCKC extends DrinkMCKC {//Child of DrinkMCKC. This class is for Energy Drinks.
    public String caffeine;

    public EnergyDrinkMCKC(){
        super();
        caffeine = "someCaffeine";
    }

    public EnergyDrinkMCKC(String nam, String com, String cst, String ssize, String samt, String cal, String caff){
        super(nam, com, cst, ssize, samt, cal);
        this.caffeine = caff;
    }

    public String getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(String caff){
        caffeine = caff;
    }

    public String toString(){
        return super.toString() + " Caffeine: " + caffeine+ " mg \n" ;
    }
    
    public String dailyIntake() {//This overridden method will additionally calculate caffeine intake.
    	double percentCaf; // in milligrams
    	percentCaf =Math.round((Double.valueOf(this.caffeine)/400) * 100);
    	return super.dailyIntake() + "Also one serving contains " + percentCaf + "% of your daily caffeine intake." + "\n";
    	
    }
}

