package homework_nr_7;

public class Date {

    private int date;
    private int month;
    private int year;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if (date >= 1 && date <=31 ){
        this.date = date;
        } else {
            System.out.println("Date number is out of range");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >=1 && month <=12) {
            this.month = month;
        } else {
            System.out.println("Month is out of Range");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Year is out of Range");
        }
    }


    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void displayDate (){
        System.out.println(date + " " + month + " " + year);
    }

    public static void main(String[] args) {

        Date dateObject = new Date(12,8,1990);
        dateObject.displayDate();

    }


}
