package Turtle;

import Pen.Pen;

import static Turtle.Direction.*;

public class Turtle {
    private int yCoordinate;
    private int xCoordinate;
    private Pen pen = new Pen();
    private Direction currentDirection;

    public Turtle() {
        pen.penUp();
        currentDirection = EAST;
    }

    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void penUP() {
        pen.penUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case SOUTH -> face(WEST);
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
//        if (currentDirection==SOUTH)currentDirection = WEST;
//        if (currentDirection==EAST)currentDirection = SOUTH;
    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        switch (currentDirection) {
            case SOUTH -> face(WEST);
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }

    }

    public void move(int numberOfSteps) {
    }

    public Position getCurrentPosition() {

        return new Position(0,5);
    }
}