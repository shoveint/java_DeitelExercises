package tdd;

import Chapter2.Height;

public class HealthRecord {
    private String fistName;
    private final String lastName;
    private String gender;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private String weight;

    public HealthRecord(String lastName) {
        this.lastName = lastName;
    }

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
        this.weight = String.valueOf(weight);
        return weight;
    }
    public Height getHeight(){
        Height height = new Height();

        return height;
    }
    public int setWeight(int weight){
        this.weight = String.valueOf(weight);
        return weight;
    }


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLastName() {
        return lastName;
    }
}
