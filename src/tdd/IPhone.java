package tdd;

public class IPhone {
    private static String colour;
    private static int price;

    public static void setColour(String colour){

        IPhone.colour = colour;
    }
    public static String getColour(){
        return colour;
    }
    public static void setPrice(int price){
        IPhone.price = price;
    }
    public int getPrice(){
        return price;
    }

}
