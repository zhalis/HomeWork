package towerOfHanoi;

import towerOfHanoi.api.ITowerOfHanoi;

import java.util.concurrent.ThreadLocalRandom;

public class TowerOfHanoiSillyAuto implements ITowerOfHanoi {

    private int[][] playingField;
    private int counter = 0;
    private ThreadLocalRandom random = ThreadLocalRandom.current();
    private int numberOfColumns;

    public TowerOfHanoiSillyAuto(int numberOfRings, int numberOfColumns) {
        int ringSize = 1;
        int[][] field = new int[numberOfRings][numberOfColumns];
        for (int i = 0; i < numberOfRings; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (j == 0) {
                    field[i][j] = ringSize;
                    ringSize++;
                } else {
                    field[i][j] = 0;
                }
            }
        }
        this.numberOfColumns = numberOfColumns;
        this.playingField = field;
    }

    public void executeMove () {
        transferRing(random.nextInt(0, this.numberOfColumns), random.nextInt(0, this.numberOfColumns));
    }

    @Override
    public void printField() {
        for (int[] row : this.playingField) {
            for (int rowElement : row) {
                if (rowElement == 0) {
                    System.out.print("*  ");
                } else {
                    System.out.print(rowElement + "  ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public boolean isMoveAvailable(int columnNumberFrom, int columnNumberTo) {

        for (int[] rowFrom : this.playingField) {
            if (rowFrom(columnNumberFrom) != -1) {
                if (rowTo(columnNumberFrom, columnNumberTo) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void transferRing(int columnNumberFrom, int columnNumberTo) {

        if (isMoveAvailable(columnNumberFrom, columnNumberTo)) {
            this.playingField[rowTo(columnNumberFrom, columnNumberTo)][columnNumberTo] = this.playingField[rowFrom(columnNumberFrom)][columnNumberFrom];
            this.playingField[rowFrom(columnNumberFrom)][columnNumberFrom] = 0;
            this.counter++;
        }
    }

    @Override
    public int rowFrom(int columnNumberFrom) {

        if (columnNumberFrom > this.playingField[0].length) {
            return -1;
        }
        if (this.playingField[this.playingField.length - 1][columnNumberFrom] == 0) {
            return -1;
        }
        for (int i = 0; i < this.playingField.length; i++) {
            if (this.playingField[i][columnNumberFrom] > 0) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int rowTo(int columnNumberFrom, int columnNumberTo) {

        if (this.playingField[this.playingField.length - 1][columnNumberTo] == 0) {
            return this.playingField.length - 1;
        }
        for (int i = this.playingField.length - 1; i >= 0; i--) {
            if (this.playingField[i][columnNumberTo] == 0
                    && this.playingField[rowFrom(columnNumberFrom)][columnNumberFrom] < this.playingField[i + 1][columnNumberTo]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isTheEnd() {
        boolean theEnd = true;
        int count = 1;

        for (int i = 1; i < this.playingField[0].length; i++) {
            theEnd = true;
            for (int[] row : this.playingField) {
                if (row[i] != count) {
                    theEnd = false;
                    break;
                }
                count++;
            }
            if (theEnd) {
                return true;
            }
        }
        return theEnd;
    }

    @Override
    public void printEndMessage() {
        System.out.println("Поздравляем!!!" + "\nЧисло ходов: " + this.counter);
    }
}
