import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SudokuTable sudokuTable = new SudokuTable();
        sudokuTable.putKnownValues(setKnownValues());

        sudokuTable.printSudoku();
        System.out.println("--------- Start ---------");

        if (sudokuTable.isSolved()) {
            System.out.println("|-----------------------|");
            System.out.println("|----- Rozwiazanie -----|");
        } else {
            System.out.println("|-- Brak rozwiazania! --|");
        }
        System.out.println("|-----------------------|");

        sudokuTable.printSudoku();
    }

    public static ArrayList<Cell> setKnownValues() {
        ArrayList<Cell> knownValues = new ArrayList<>();

        knownValues.add(new Cell(5, 0));
        knownValues.add(new Cell(3, 1));
        knownValues.add(new Cell(7, 4));

        knownValues.add(new Cell(6, 9));
        knownValues.add(new Cell(1, 12));
        knownValues.add(new Cell(9, 13));
        knownValues.add(new Cell(5, 14));

        knownValues.add(new Cell(9, 19));
        knownValues.add(new Cell(8, 20));
        knownValues.add(new Cell(6, 25));

        knownValues.add(new Cell(8, 27));
        knownValues.add(new Cell(6, 31));
        knownValues.add(new Cell(3, 35));

        knownValues.add(new Cell(4, 36));
        knownValues.add(new Cell(8, 39));
        knownValues.add(new Cell(3, 41));
        knownValues.add(new Cell(1, 44));

        knownValues.add(new Cell(7, 45));
        knownValues.add(new Cell(2, 49));
        knownValues.add(new Cell(6, 53));

        knownValues.add(new Cell(6, 55));
        knownValues.add(new Cell(2, 60));
        knownValues.add(new Cell(8, 61));

        knownValues.add(new Cell(4, 66));
        knownValues.add(new Cell(1, 67));
        knownValues.add(new Cell(9, 68));
        knownValues.add(new Cell(5, 71));

        knownValues.add(new Cell(8, 76));
        knownValues.add(new Cell(7, 79));
        knownValues.add(new Cell(9, 80));

        return knownValues;
    }
}
