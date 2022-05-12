package towerOfHanoi.api;

public interface ITowerOfHanoi {
    void printField();
    boolean isMoveAvailable(int columnNumberFrom, int columnNumberTo);
    void transferRing(int columnNumberFrom, int columnNumberTo);
    int rowFrom(int columnNumberFrom);
    int rowTo(int columnNumberFrom, int columnNumberTo);
    boolean isTheEnd();
    void printEndMessage();
}
