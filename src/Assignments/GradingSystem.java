package Assignments;

public class GradingSystem {
    private String position;
    private String schoolName;
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public void setPosition(int grade){
        if (grade >= 80 && grade <=100){
            this.position= "A";
        }
        else if (grade >= 60 && grade <= 79){
            this.position = "B";
        }
        else if (grade >= 50 && grade <= 59) {
            this.position = "c";
        }
        else if (grade >= 40 && grade <= 49) {
            this.position = "E";
        }
        else {
            this.position = "F";

        }

    }

    public String getPosition() {
        return position;
    }
}
