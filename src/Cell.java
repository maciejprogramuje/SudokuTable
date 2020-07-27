public class Cell {
    private int value;
    private int columnNumber;
    private int rowNumber;
    private int squareNumber;
    private boolean isConfirmed;
    private int index;

    public Cell(int value, int index) {
        this.value = value;
        this.rowNumber = index / 9 + 1;
        this.columnNumber = index % 9 + 1;
        this.squareNumber = setSquareNumber();
        this.isConfirmed = value > 0;
    }

    private int setSquareNumber() {
        int squareColumn = columnNumber / 3 + 1;
        int squareRow = rowNumber / 3 + 1;

        if (squareColumn == 1) {
            if (squareRow == 1) return 1;
            else if (squareRow == 2) return 4;
            else if (squareRow == 3) return 7;
        } else if (squareColumn == 2) {
            if (squareRow == 1) return 2;
            else if (squareRow == 2) return 5;
            else if (squareRow == 3) return 8;
        } else if (squareColumn == 3) {
            if (squareRow == 1) return 3;
            else if (squareRow == 2) return 6;
            else if (squareRow == 3) return 9;
        }

        return 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSquareNumber() {
        return squareNumber;
    }

    public void setSquareNumber(int squareNumber) {
        this.squareNumber = squareNumber;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
