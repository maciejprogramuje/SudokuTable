public class Main {
    public static void main(String[] args) {
        SudokuTable sudokuTable = new SudokuTable();
        sudokuTable.printSudoku();
        System.out.println("-- Start --");
        if (sudokuTable.tryInsertValues()) {
            System.out.println("-- Rozwiazane --");
        } else {
            System.out.println("-- Brak rozwiazania --");
        }
        System.out.println();
        sudokuTable.printSudoku();
    }
}
