public class DrinkMCKC {//This is the parent class of all drinks
    private String name;
    private String company;
    private String cost;
    private String servingsize; //Serving size is in fluid ounces
    private String servingamt; //Amount per serving
    private String calorie;

    public DrinkMCKC(){
        name = "someName";
        company = "someCompany";
        cost = "someCost";
        servingsize = "someServingSize";
        servingamt = "someServingAmt";
        calorie = "someCalorie";
    }

    public DrinkMCKC(String nam, String com, String cst, String ssize, String samt, String cal){
        this.name = nam;
        this.company = com;
        this.cost = cst;
        this.servingsize = ssize;
        this.servingamt = samt;
        this.calorie = cal;
    }

    public String getName(){
        return name;
    }

    public String getCompany(){
        return company;
    }

    public String getCost(){
        return cost;
    }

    public String getServingsize(){
        return servingsize;
    }

    public String getServingamt(){
        return servingamt;
    }

    public String getCalorie(){
        return calorie;
    }

    public void setName(String nam){
        name = nam;
    }

    public void setCompany(String com){
        company = com;
    }

    public void setCost(String cst){
        cost = cst;
    }

    public void setServingsize(String ssize){
        servingsize = ssize;
    }

    public void setServingamt(String samt){
        servingamt = samt;
    }

    public void setCalorie(String cal){
        calorie = cal;
    }
    

    public String toString(){
        return "\n"+ "Drink: " + name + " ; Company: " + company + " ; Cost: $" + cost + " ; Serving size: " + servingsize + " ; Serving amount: " + servingamt + "oz ; Calories: " + calorie+ "\n";
    }
    
    public boolean equals(DrinkMCKC obj) {
		if(name.equals(obj.getName())){
			return true;
			}
		else {
			return false;
			}
		}
    
    public int compareTo(DrinkMCKC obj) {//compare is based on name
		return obj.getName().compareToIgnoreCase(this.name);
    }
    
    public String dailyIntake() {//This is the overridden method that is unique to our program. It calculates basic nutritional numbers for each drink.
    	double percentCal;
    	percentCal = Math.round(Double.valueOf(this.calorie)/2000 * 100);//This will round the value to a whole percent
    	return "One serving of this drink is " + percentCal  +  "% of a 2000 calorie diet. ";
    	
    }



}