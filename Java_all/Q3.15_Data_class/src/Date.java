public class Date {
        private int month;
        private int day;
        private  int year;

        public Date(){
            this.month=month;
            this.day=day;
            this.year=year;

        }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public void displayDate(){
            System.out.println(month+"/"+day+"/"+year);
    }

}
