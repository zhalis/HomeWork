package towerOfHanoi;

import towerOfHanoi.api.ITowerOfHanoi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardOpenOption.CREATE;

public class TowerOfHanoiManual implements ITowerOfHanoi {

    private static final Path SAVE_END_GAME_PATH = Path.of("HomeWork", "src", "towerOfHanoi", "save", "SaveEndGame.txt");
    private int[][] playingField;
    private int counter = 0;

    public TowerOfHanoiManual(int numberOfRings, int numberOfColumns) {
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
        this.playingField = field;
    }

    public TowerOfHanoiManual() throws IOException {
        List<String> contentsOfSavedFile = Files.readAllLines(SAVE_END_GAME_PATH, UTF_8);

        this.counter = Integer.parseInt(contentsOfSavedFile.get(0));
        List<String> playingFieldString = contentsOfSavedFile.subList(1, contentsOfSavedFile.size());
        int numberOfColumns = playingFieldString.get(0).split(", ").length;
        this.playingField = new int[playingFieldString.size()][numberOfColumns];

        for (int i = 0; i < playingFieldString.size(); i++) {
            String rowString = playingFieldString.get(i);
            String[] rowElementsString = rowString.split(", ");
            for (int j = 0; j < rowElementsString.length; j++) {
                String rowElement = rowElementsString[j];
                this.playingField[i][j] = Integer.parseInt(rowElement);
            }
        }
    }

    public TowerOfHanoiManual(String loadName) throws IOException {
        Path saveEndGame = Path.of("HomeWork", "src", "towerOfHanoi", "save", loadName);
        List<String> contentsOfSavedFile = Files.readAllLines(saveEndGame, UTF_8);

        this.counter = Integer.parseInt(contentsOfSavedFile.get(0));
        List<String> playingFieldString = contentsOfSavedFile.subList(1, contentsOfSavedFile.size());
        int numberOfColumns = playingFieldString.get(0).split(", ").length;
        this.playingField = new int[playingFieldString.size()][numberOfColumns];

        for (int i = 0; i < playingFieldString.size(); i++) {
            String rowString = playingFieldString.get(i);
            String[] rowElementsString = rowString.split(", ");
            for (int j = 0; j < rowElementsString.length; j++) {
                String rowElement = rowElementsString[j];
                this.playingField[i][j] = Integer.parseInt(rowElement);
            }
        }
    }

    public static String[] showListOfSavedGames() {
        Path path = Path.of("HomeWork", "src", "towerOfHanoi", "save");
        return path.toFile().list();
    }

    @Override
    public void printField() {

        for (int[] row : this.playingField) {
            for (int rowElement : row) {
                if (rowElement == 0) {
                    System.out.print("*     ");
                } else {
                    System.out.print(rowElement + "     ");
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
        columnNumberFrom--;
        columnNumberTo--;

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

    public void saveProgress(String saveName) throws IOException {
        Path saveGamePath = Path.of("HomeWork", "src", "towerOfHanoi", "save", saveName);
        save(saveGamePath);
    }

    public void saveEndGame() throws IOException {
        save(SAVE_END_GAME_PATH);
    }

    private void save(Path path) throws IOException {
        List<String> contentOfFile = new ArrayList<>();
        contentOfFile.add(String.valueOf(counter));

        for (int[] row : this.playingField) {
            contentOfFile.add(Arrays.toString(row).replace("[", "").replace("]", ""));
        }
        Files.write(path, contentOfFile, UTF_8, CREATE);
    }
}
