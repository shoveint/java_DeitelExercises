package tdd;

import Chapter2.Height;

public class HealthRecord {
    private String fistName;
    private String lastName;
    private String gender;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private Height height;
    private int weight;

    public void setFistName(String fistName){
        this.fistName = fistName;
    }
    public String getFirstName(){
        return fistName;
    }
    public String setGender(String gender){
           this.gender = gender;
        return gender;
    }
    public String getGender(){
           return gender;
    }
    public int setMonthOfBirth(int monthOfBirth){
        this.monthOfBirth = monthOfBirth;
        return monthOfBirth;
    }
    public int getMonthOfBirth(){
        return monthOfBirth;
    }
    public int setDayOfBirth(int dayOfBirth){
        this.dayOfBirth = dayOfBirth;
        return dayOfBirth;
    }
    public int getDayOfBirth(){
        return dayOfBirth;
    }
    public int setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
        return yearOfBirth;
    }
    public int getYearOfBirth(){return yearOfBirth; }
    public int setHeight(int weight){
        this.weight = weight;
        return weight;
    }
    public Height getHeight(){
        height = new Height();

        return height;
    }
    public int setWeight(int weight){
        this.weight = weight;
        return weight;
    }


}
