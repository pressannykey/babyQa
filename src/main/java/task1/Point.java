package task1;

import task1.interfaces.Movable;

public class Point implements Movable {
    private int xCoordinate;
    private int yCoordinate;

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public void moveUp() {
        this.yCoordinate = this.yCoordinate + 1;
    }

    @Override
    public void moveDown() {
        this.yCoordinate = this.yCoordinate - 1;
    }

    @Override
    public void moveRight() {
        this.xCoordinate = this.xCoordinate + 1;
    }

    @Override
    public void moveLeft() {
        this.xCoordinate = this.xCoordinate - 1;
    }
}
