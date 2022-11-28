package Chapter5;

public class DisplayArrayTable {
    public static void main(String[] args) {
        int[][] bracket = new int[5][5];

        bracket[0][0] = 1;
        bracket[1][0] = 0;
        bracket[3][1] = 1;
        bracket[4][4] = 0;
        bracket[2][2] = 1;

        System.out.println(onScreen(bracket));
    }
    private static String onScreen(int[][] bracket){
        String result = "";
        for (int[] row : bracket){
            for (int cell : row){
                result += cell == 0? " - " : " * ";
            }
            result += "\n";
        }
        return result;
    }
}
