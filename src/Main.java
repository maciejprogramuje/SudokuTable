public class Main {
    public static void main(String[] args) {
        SudokuTable sudokuTable = new SudokuTable();
        sudokuTable.putKnownValues();

        sudokuTable.printSudoku();
        System.out.println("-- Start --");

        if (sudokuTable.isSolved()) {
            System.out.println("-- Rozwiazane --");
        } else {
            System.out.println("-- Brak rozwiazania --");
        }
        sudokuTable.printSudoku();
    }
}
