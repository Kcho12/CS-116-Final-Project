public class SellByDateMCKC {
	public String month;
    public String day;
    public String year;
    
    public SellByDateMCKC(){
        month = "someMonth";
        day = "someDay";
        year = "someYear";
    }

    public SellByDateMCKC(String month, String day, String year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public void setMonth(String mn){
        month = mn;
    }

    public void setDay(String dy){
        day = dy;
    }

    public void setYear(String yr){
        year = yr;
    }

    public String toString(){
        return  "Expires on: " + month + " " + day + ", " + year;
    }
}

