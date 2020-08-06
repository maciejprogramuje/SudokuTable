import java.util.ArrayList;

public class SudokuTable {
    private final ArrayList<Cell> sudokuCells;

    public SudokuTable() {
        sudokuCells = new ArrayList<>();
        for (int i = 0; i < 81; i++) {
            sudokuCells.add(new Cell(0, i));
        }
    }

    public void putKnownValues(ArrayList<Cell> knownValues) {
        for (Cell c : knownValues) {
            sudokuCells.set(c.getIndex(), new Cell(c.getValue(), c.getIndex()));
        }
    }

    public void printSudoku() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("|-------|-------|-------|");
        int i = 0;
        do {
            if (i > 0 && i % 27 == 0) {
                stringBuilder.append("\n|-------|-------|-------|");
            }
            if (i % 9 == 0) {
                stringBuilder.append("\n| ");
            }
            if (i % 3 == 0 && i % 9 != 0) {
                stringBuilder.append("| ");
            }
            stringBuilder.append(sudokuCells.get(i).getValue()).append(" ");

            if ((i + 1) % 9 == 0) {
                stringBuilder.append("|");
            }
            i++;
        } while (i < 81);
        stringBuilder.append("\n|-------|-------|-------|");
        System.out.println(stringBuilder);
    }

    public Boolean isSolved() {
        int i = 0;
        do {
            System.out.println("i = " + i);
            if (sudokuCells.get(i).isKnownValue()) {
                i++;
            } else {
                do {
                    sudokuCells.get(i).setValue(sudokuCells.get(i).getValue() + 1);
                } while (!isValuePossible(sudokuCells.get(i)));

                if (sudokuCells.get(i).getValue() < 10) {
                    i++;
                } else {
                    sudokuCells.get(i).setValue(0);
                    i--;
                    while (sudokuCells.get(i).isKnownValue()) {
                        i--;
                    }
                    if (i < 0) {
                        return false;
                    }
                }
            }
        } while (i < 81);

        return true;
    }

    private Boolean isValuePossible(Cell c) {
        ArrayList<Cell> cells = new ArrayList<>();
        for (Cell tempC : sudokuCells) {
            if (tempC.getRowNumber() == c.getRowNumber()
                    || tempC.getColumnNumber() == c.getColumnNumber()
                    || tempC.getSquareNumber() == c.getSquareNumber()) {
                cells.add(tempC);
            }
        }
        cells.remove(c);

        for (Cell tempCs : cells) {
            if (tempCs.getValue() == c.getValue()) {
                return false;
            }
        }
        return true;
    }
}
