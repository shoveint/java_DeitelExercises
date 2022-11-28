package Chapter8;

public class Time1 {
    private int hour;
    private int minute;
    private int seconds;
    public void setTime(int hour, int minute, int seconds) throws IllegalAccessException {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || seconds < 0 || seconds >= 60){
            throw new IllegalAccessException("hour, minute and/or second was out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
    // todo create method
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, seconds);
    }
    public String toString(){
        return String.format("%d:02d:%02d %s", ((hour==0 || hour == 12)? 12 : hour % 12), minute, seconds,
                (hour < 12 ? "AM" : "PM"));
    }
}
