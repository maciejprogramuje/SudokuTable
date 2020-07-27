public class Cell {
    private int value;
    private int columnNumber;
    private int rowNumber;
    private int squareNumber;
    private boolean isKnownValue;

    public Cell(int value, int index) {
        this.value = value;
        this.rowNumber = index / 9 + 1;
        this.columnNumber = index % 9 + 1;
        this.squareNumber = setSquareNumber();
        this.isKnownValue = value > 0;
    }

    private int setSquareNumber() {
        if (columnNumber <= 3) {
            if (rowNumber <= 3) {
                return 1;
            } else if (rowNumber <= 6) {
                return 4;
            } else {
                return 7;
            }
        } else if (columnNumber <= 6) {
            if (rowNumber <= 3) {
                return 2;
            } else if (rowNumber <= 6) {
                return 5;
            } else {
                return 8;
            }
        } else {
            if (rowNumber <= 3) {
                return 3;
            } else if (rowNumber <= 6) {
                return 6;
            } else {
                return 9;
            }
        }
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

    public boolean isKnownValue() {
        return isKnownValue;
    }

    public void setKnownValue(boolean knownValue) {
        isKnownValue = knownValue;
    }
}
