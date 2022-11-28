package tdd;

    public class AirConditioner {
        public boolean isOn;
        public static int temp;
        public AirConditioner() {
            this.isOn = false;
            temp = 0;
        }

        public boolean turnOn(){
            this.isOn = true;
            return false;
        }


        public void turnOff() {
            this.isOn = false;

        }

        public void setTemp() {
            this.temp = temp;

        }
    }