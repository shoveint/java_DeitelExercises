package Chapter7;

public class SchoolAdmin {
    private int[][] scores = {{98, 79, 56, 78, 50}, {56, 90, 98, 89, 78}};

    private SchoolAdmin() {

    }

    private int[][] nativeScores = new int[2][5];
    private int averageScores;

    public  SchoolAdmin(int[][] scores){
        nativeScores = scores;

    }

    public int[][] getNativeScores() {
        return nativeScores;
    }

    public void setNativeScores(int[][] nativeScores) {
        this.nativeScores = nativeScores;
    }
    public void calculateAverageScores(){
        for (int i = 0; i < nativeScores.length; i++) {
            int totalScore = 0;
            for (int j = 0; j < nativeScores.length; j++) {
                totalScore = nativeScores[i][j];

            }
            averageScores = totalScore / nativeScores.length;

        }
    }

}

