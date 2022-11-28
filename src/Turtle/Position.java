package Turtle;

public class Position {
    int row;
    private int column;

    public Position(int row, int column) {
        this.column = column;
        this.row = row;


    }

    @Override
    public String toString() {
        String toBeReturned = "";
        toBeReturned += "row= " + row + "\n";
        toBeReturned += "";
        return toBeReturned;
    }

    public void move(int numberOfSteps) {

    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        Position compared = (Position) toBeCompared;
        if (compared.row == this.row && compared.column == this.column) {
            return true;

        }

        return false;
    }
}
