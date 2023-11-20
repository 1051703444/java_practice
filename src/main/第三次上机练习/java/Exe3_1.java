import java.time.LocalDateTime;

class Datetime{
    private int year,month,day;
    private int hour,minute,second;

    public Datetime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String getDay() {
        return year+"/"+month+"/"+day;
    }
    public void setDay(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public String getTime() {
        return hour+":"+minute+":"+second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return year+"/"+month+"/"+day+" "+hour+":"+minute+":"+second;
    }
}


public class Exe3_1 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        Datetime datetime = new Datetime(time.getYear(), time.getMonthValue(), time.getDayOfMonth(), time.getHour(), time.getMinute(), time.getSecond());
        System.out.println(datetime);
        System.out.println(datetime.getDay());
        System.out.println(datetime.getTime());
    }
}
