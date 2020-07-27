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
        for(Cell c : knownValues) {
            sudokuCells.set(c.getIndex(), new Cell(c.getValue(), c.getIndex()));
        }
    }

    /*public void printSudoku() {
        System.out.println("|-----------------------------------------|-----------------------------------------|-----------------------------------------|");
        System.out.println("| " + sudokuCells.get(0).getValue() + ", c:" + sudokuCells.get(0).getColumnNumber() + ", r:" + sudokuCells.get(0).getRowNumber() + " | " + sudokuCells.get(1).getValue() + ", c:" + sudokuCells.get(1).getColumnNumber() + ", r:" + sudokuCells.get(1).getRowNumber() + " | " + sudokuCells.get(2).getValue() + ", c:" + sudokuCells.get(2).getColumnNumber() + ", r:" + sudokuCells.get(2).getRowNumber() + " | " + sudokuCells.get(3).getValue() + ", c:" + sudokuCells.get(3).getColumnNumber() + ", r:" + sudokuCells.get(3).getRowNumber() + " | " + sudokuCells.get(4).getValue() + ", c:" + sudokuCells.get(4).getColumnNumber() + ", r:" + sudokuCells.get(4).getRowNumber() + " | " + sudokuCells.get(5).getValue() + ", c:" + sudokuCells.get(5).getColumnNumber() + ", r:" + sudokuCells.get(5).getRowNumber() + " | " + sudokuCells.get(6).getValue() + ", c:" + sudokuCells.get(6).getColumnNumber() + ", r:" + sudokuCells.get(6).getRowNumber() + " | " + sudokuCells.get(7).getValue() + ", c:" + sudokuCells.get(7).getColumnNumber() + ", r:" + sudokuCells.get(7).getRowNumber() + " | " + sudokuCells.get(8).getValue() + ", c:" + sudokuCells.get(8).getColumnNumber() + ", r:" + sudokuCells.get(8).getRowNumber() + " |");
        System.out.println("| " + sudokuCells.get(9).getValue() + ", c:" + sudokuCells.get(9).getColumnNumber() + ", r:" + sudokuCells.get(9).getRowNumber() + " | " + sudokuCells.get(10).getValue() + ", c:" + sudokuCells.get(10).getColumnNumber() + ", r:" + sudokuCells.get(10).getRowNumber() + " | " + sudokuCells.get(11).getValue() + ", c:" + sudokuCells.get(11).getColumnNumber() + ", r:" + sudokuCells.get(11).getRowNumber() + " | " + sudokuCells.get(12).getValue() + ", c:" + sudokuCells.get(12).getColumnNumber() + ", r:" + sudokuCells.get(12).getRowNumber() + " | " + sudokuCells.get(13).getValue() + ", c:" + sudokuCells.get(13).getColumnNumber() + ", r:" + sudokuCells.get(13).getRowNumber() + " | " + sudokuCells.get(14).getValue() + ", c:" + sudokuCells.get(14).getColumnNumber() + ", r:" + sudokuCells.get(14).getRowNumber() + " | " + sudokuCells.get(15).getValue() + ", c:" + sudokuCells.get(15).getColumnNumber() + ", r:" + sudokuCells.get(15).getRowNumber() + " | " + sudokuCells.get(16).getValue() + ", c:" + sudokuCells.get(16).getColumnNumber() + ", r:" + sudokuCells.get(16).getRowNumber() + " | " + sudokuCells.get(17).getValue() + ", c:" + sudokuCells.get(17).getColumnNumber() + ", r:" + sudokuCells.get(17).getRowNumber() + " |");
        System.out.println("| " + sudokuCells.get(18).getValue() + ", c:" + sudokuCells.get(18).getColumnNumber() + ", r:" + sudokuCells.get(18).getRowNumber() + " | " + sudokuCells.get(19).getValue() + ", c:" + sudokuCells.get(19).getColumnNumber() + ", r:" + sudokuCells.get(19).getRowNumber() + " | " + sudokuCells.get(20).getValue() + ", c:" + sudokuCells.get(20).getColumnNumber() + ", r:" + sudokuCells.get(20).getRowNumber() + " | " + sudokuCells.get(21).getValue() + ", c:" + sudokuCells.get(21).getColumnNumber() + ", r:" + sudokuCells.get(21).getRowNumber() + " | " + sudokuCells.get(22).getValue() + ", c:" + sudokuCells.get(22).getColumnNumber() + ", r:" + sudokuCells.get(22).getRowNumber() + " | " + sudokuCells.get(23).getValue() + ", c:" + sudokuCells.get(23).getColumnNumber() + ", r:" + sudokuCells.get(23).getRowNumber() + " | " + sudokuCells.get(24).getValue() + ", c:" + sudokuCells.get(24).getColumnNumber() + ", r:" + sudokuCells.get(24).getRowNumber() + " | " + sudokuCells.get(25).getValue() + ", c:" + sudokuCells.get(25).getColumnNumber() + ", r:" + sudokuCells.get(25).getRowNumber() + " | " + sudokuCells.get(26).getValue() + ", c:" + sudokuCells.get(26).getColumnNumber() + ", r:" + sudokuCells.get(26).getRowNumber() + " |");
        System.out.println("|-----------------------------------------|-----------------------------------------|-----------------------------------------|");
        System.out.println("| " + sudokuCells.get(27).getValue() + ", c:" + sudokuCells.get(27).getColumnNumber() + ", r:" + sudokuCells.get(27).getRowNumber() + " | " + sudokuCells.get(28).getValue() + ", c:" + sudokuCells.get(28).getColumnNumber() + ", r:" + sudokuCells.get(28).getRowNumber() + " | " + sudokuCells.get(29).getValue() + ", c:" + sudokuCells.get(29).getColumnNumber() + ", r:" + sudokuCells.get(29).getRowNumber() + " | " + sudokuCells.get(30).getValue() + ", c:" + sudokuCells.get(30).getColumnNumber() + ", r:" + sudokuCells.get(30).getRowNumber() + " | " + sudokuCells.get(31).getValue() + ", c:" + sudokuCells.get(31).getColumnNumber() + ", r:" + sudokuCells.get(31).getRowNumber() + " | " + sudokuCells.get(32).getValue() + ", c:" + sudokuCells.get(32).getColumnNumber() + ", r:" + sudokuCells.get(32).getRowNumber() + " | " + sudokuCells.get(33).getValue() + ", c:" + sudokuCells.get(33).getColumnNumber() + ", r:" + sudokuCells.get(33).getRowNumber() + " | " + sudokuCells.get(34).getValue() + ", c:" + sudokuCells.get(34).getColumnNumber() + ", r:" + sudokuCells.get(34).getRowNumber() + " | " + sudokuCells.get(35).getValue() + ", c:" + sudokuCells.get(35).getColumnNumber() + ", r:" + sudokuCells.get(35).getRowNumber() + " |");
        System.out.println("| " + sudokuCells.get(36).getValue() + ", c:" + sudokuCells.get(36).getColumnNumber() + ", r:" + sudokuCells.get(36).getRowNumber() + " | " + sudokuCells.get(37).getValue() + ", c:" + sudokuCells.get(37).getColumnNumber() + ", r:" + sudokuCells.get(37).getRowNumber() + " | " + sudokuCells.get(38).getValue() + ", c:" + sudokuCells.get(38).getColumnNumber() + ", r:" + sudokuCells.get(38).getRowNumber() + " | " + sudokuCells.get(39).getValue() + ", c:" + sudokuCells.get(39).getColumnNumber() + ", r:" + sudokuCells.get(39).getRowNumber() + " | " + sudokuCells.get(40).getValue() + ", c:" + sudokuCells.get(40).getColumnNumber() + ", r:" + sudokuCells.get(40).getRowNumber() + " | " + sudokuCells.get(41).getValue() + ", c:" + sudokuCells.get(41).getColumnNumber() + ", r:" + sudokuCells.get(41).getRowNumber() + " | " + sudokuCells.get(42).getValue() + ", c:" + sudokuCells.get(42).getColumnNumber() + ", r:" + sudokuCells.get(42).getRowNumber() + " | " + sudokuCells.get(43).getValue() + ", c:" + sudokuCells.get(43).getColumnNumber() + ", r:" + sudokuCells.get(43).getRowNumber() + " | " + sudokuCells.get(44).getValue() + ", c:" + sudokuCells.get(44).getColumnNumber() + ", r:" + sudokuCells.get(44).getRowNumber() + " |");
        System.out.println("| " + sudokuCells.get(45).getValue() + ", c:" + sudokuCells.get(45).getColumnNumber() + ", r:" + sudokuCells.get(45).getRowNumber() + " | " + sudokuCells.get(46).getValue() + ", c:" + sudokuCells.get(46).getColumnNumber() + ", r:" + sudokuCells.get(46).getRowNumber() + " | " + sudokuCells.get(47).getValue() + ", c:" + sudokuCells.get(47).getColumnNumber() + ", r:" + sudokuCells.get(47).getRowNumber() + " | " + sudokuCells.get(48).getValue() + ", c:" + sudokuCells.get(48).getColumnNumber() + ", r:" + sudokuCells.get(48).getRowNumber() + " | " + sudokuCells.get(49).getValue() + ", c:" + sudokuCells.get(49).getColumnNumber() + ", r:" + sudokuCells.get(49).getRowNumber() + " | " + sudokuCells.get(50).getValue() + ", c:" + sudokuCells.get(50).getColumnNumber() + ", r:" + sudokuCells.get(50).getRowNumber() + " | " + sudokuCells.get(51).getValue() + ", c:" + sudokuCells.get(51).getColumnNumber() + ", r:" + sudokuCells.get(51).getRowNumber() + " | " + sudokuCells.get(52).getValue() + ", c:" + sudokuCells.get(52).getColumnNumber() + ", r:" + sudokuCells.get(52).getRowNumber() + " | " + sudokuCells.get(53).getValue() + ", c:" + sudokuCells.get(53).getColumnNumber() + ", r:" + sudokuCells.get(53).getRowNumber() + " |");
        System.out.println("|-----------------------------------------|-----------------------------------------|-----------------------------------------|");
        System.out.println("| " + sudokuCells.get(54).getValue() + ", c:" + sudokuCells.get(54).getColumnNumber() + ", r:" + sudokuCells.get(54).getRowNumber() + " | " + sudokuCells.get(55).getValue() + ", c:" + sudokuCells.get(55).getColumnNumber() + ", r:" + sudokuCells.get(55).getRowNumber() + " | " + sudokuCells.get(56).getValue() + ", c:" + sudokuCells.get(56).getColumnNumber() + ", r:" + sudokuCells.get(56).getRowNumber() + " | " + sudokuCells.get(57).getValue() + ", c:" + sudokuCells.get(57).getColumnNumber() + ", r:" + sudokuCells.get(57).getRowNumber() + " | " + sudokuCells.get(58).getValue() + ", c:" + sudokuCells.get(58).getColumnNumber() + ", r:" + sudokuCells.get(58).getRowNumber() + " | " + sudokuCells.get(59).getValue() + ", c:" + sudokuCells.get(59).getColumnNumber() + ", r:" + sudokuCells.get(59).getRowNumber() + " | " + sudokuCells.get(60).getValue() + ", c:" + sudokuCells.get(60).getColumnNumber() + ", r:" + sudokuCells.get(60).getRowNumber() + " | " + sudokuCells.get(61).getValue() + ", c:" + sudokuCells.get(61).getColumnNumber() + ", r:" + sudokuCells.get(61).getRowNumber() + " | " + sudokuCells.get(62).getValue() + ", c:" + sudokuCells.get(62).getColumnNumber() + ", r:" + sudokuCells.get(62).getRowNumber() + " |");
        System.out.println("| " + sudokuCells.get(63).getValue() + ", c:" + sudokuCells.get(63).getColumnNumber() + ", r:" + sudokuCells.get(63).getRowNumber() + " | " + sudokuCells.get(64).getValue() + ", c:" + sudokuCells.get(64).getColumnNumber() + ", r:" + sudokuCells.get(64).getRowNumber() + " | " + sudokuCells.get(65).getValue() + ", c:" + sudokuCells.get(65).getColumnNumber() + ", r:" + sudokuCells.get(65).getRowNumber() + " | " + sudokuCells.get(66).getValue() + ", c:" + sudokuCells.get(66).getColumnNumber() + ", r:" + sudokuCells.get(66).getRowNumber() + " | " + sudokuCells.get(67).getValue() + ", c:" + sudokuCells.get(67).getColumnNumber() + ", r:" + sudokuCells.get(67).getRowNumber() + " | " + sudokuCells.get(68).getValue() + ", c:" + sudokuCells.get(68).getColumnNumber() + ", r:" + sudokuCells.get(68).getRowNumber() + " | " + sudokuCells.get(69).getValue() + ", c:" + sudokuCells.get(69).getColumnNumber() + ", r:" + sudokuCells.get(69).getRowNumber() + " | " + sudokuCells.get(70).getValue() + ", c:" + sudokuCells.get(70).getColumnNumber() + ", r:" + sudokuCells.get(70).getRowNumber() + " | " + sudokuCells.get(71).getValue() + ", c:" + sudokuCells.get(71).getColumnNumber() + ", r:" + sudokuCells.get(71).getRowNumber() + " |");
        System.out.println("| " + sudokuCells.get(72).getValue() + ", c:" + sudokuCells.get(72).getColumnNumber() + ", r:" + sudokuCells.get(72).getRowNumber() + " | " + sudokuCells.get(73).getValue() + ", c:" + sudokuCells.get(73).getColumnNumber() + ", r:" + sudokuCells.get(73).getRowNumber() + " | " + sudokuCells.get(74).getValue() + ", c:" + sudokuCells.get(74).getColumnNumber() + ", r:" + sudokuCells.get(74).getRowNumber() + " | " + sudokuCells.get(75).getValue() + ", c:" + sudokuCells.get(75).getColumnNumber() + ", r:" + sudokuCells.get(75).getRowNumber() + " | " + sudokuCells.get(76).getValue() + ", c:" + sudokuCells.get(76).getColumnNumber() + ", r:" + sudokuCells.get(76).getRowNumber() + " | " + sudokuCells.get(77).getValue() + ", c:" + sudokuCells.get(77).getColumnNumber() + ", r:" + sudokuCells.get(77).getRowNumber() + " | " + sudokuCells.get(78).getValue() + ", c:" + sudokuCells.get(78).getColumnNumber() + ", r:" + sudokuCells.get(78).getRowNumber() + " | " + sudokuCells.get(79).getValue() + ", c:" + sudokuCells.get(79).getColumnNumber() + ", r:" + sudokuCells.get(79).getRowNumber() + " | " + sudokuCells.get(80).getValue() + ", c:" + sudokuCells.get(80).getColumnNumber() + ", r:" + sudokuCells.get(80).getRowNumber() + " |");
        System.out.println("|-----------------------------------------|-----------------------------------------|-----------------------------------------|");
    }*/

    public void printSudoku() {
        System.out.println("|-------|-------|-------|");
        System.out.println("| " + sudokuCells.get(0).getValue() + " " + sudokuCells.get(1).getValue() + " " + sudokuCells.get(2).getValue() + " | " + sudokuCells.get(3).getValue() + " " + sudokuCells.get(4).getValue() + " " + sudokuCells.get(5).getValue() + " | " + sudokuCells.get(6).getValue() + " " + sudokuCells.get(7).getValue() + " " + sudokuCells.get(8).getValue() + " |");
        System.out.println("| " + sudokuCells.get(9).getValue() + " " + sudokuCells.get(10).getValue() + " " + sudokuCells.get(11).getValue() + " | " + sudokuCells.get(12).getValue() + " " + sudokuCells.get(13).getValue() + " " + sudokuCells.get(14).getValue() + " | " + sudokuCells.get(15).getValue() + " " + sudokuCells.get(16).getValue() + " " + sudokuCells.get(17).getValue() + " |");
        System.out.println("| " + sudokuCells.get(18).getValue() + " " + sudokuCells.get(19).getValue() + " " + sudokuCells.get(20).getValue() + " | " + sudokuCells.get(21).getValue() + " " + sudokuCells.get(22).getValue() + " " + sudokuCells.get(23).getValue() + " | " + sudokuCells.get(24).getValue() + " " + sudokuCells.get(25).getValue() + " " + sudokuCells.get(26).getValue() + " |");
        System.out.println("|-------|-------|-------|");
        System.out.println("| " + sudokuCells.get(27).getValue() + " " + sudokuCells.get(28).getValue() + " " + sudokuCells.get(29).getValue() + " | " + sudokuCells.get(30).getValue() + " " + sudokuCells.get(31).getValue() + " " + sudokuCells.get(32).getValue() + " | " + sudokuCells.get(33).getValue() + " " + sudokuCells.get(34).getValue() + " " + sudokuCells.get(35).getValue() + " |");
        System.out.println("| " + sudokuCells.get(36).getValue() + " " + sudokuCells.get(37).getValue() + " " + sudokuCells.get(38).getValue() + " | " + sudokuCells.get(39).getValue() + " " + sudokuCells.get(40).getValue() + " " + sudokuCells.get(41).getValue() + " | " + sudokuCells.get(42).getValue() + " " + sudokuCells.get(43).getValue() + " " + sudokuCells.get(44).getValue() + " |");
        System.out.println("| " + sudokuCells.get(45).getValue() + " " + sudokuCells.get(46).getValue() + " " + sudokuCells.get(47).getValue() + " | " + sudokuCells.get(48).getValue() + " " + sudokuCells.get(49).getValue() + " " + sudokuCells.get(50).getValue() + " | " + sudokuCells.get(51).getValue() + " " + sudokuCells.get(52).getValue() + " " + sudokuCells.get(53).getValue() + " |");
        System.out.println("|-------|-------|-------|");
        System.out.println("| " + sudokuCells.get(54).getValue() + " " + sudokuCells.get(55).getValue() + " " + sudokuCells.get(56).getValue() + " | " + sudokuCells.get(57).getValue() + " " + sudokuCells.get(58).getValue() + " " + sudokuCells.get(59).getValue() + " | " + sudokuCells.get(60).getValue() + " " + sudokuCells.get(61).getValue() + " " + sudokuCells.get(62).getValue() + " |");
        System.out.println("| " + sudokuCells.get(63).getValue() + " " + sudokuCells.get(64).getValue() + " " + sudokuCells.get(65).getValue() + " | " + sudokuCells.get(66).getValue() + " " + sudokuCells.get(67).getValue() + " " + sudokuCells.get(68).getValue() + " | " + sudokuCells.get(69).getValue() + " " + sudokuCells.get(70).getValue() + " " + sudokuCells.get(71).getValue() + " |");
        System.out.println("| " + sudokuCells.get(72).getValue() + " " + sudokuCells.get(73).getValue() + " " + sudokuCells.get(74).getValue() + " | " + sudokuCells.get(75).getValue() + " " + sudokuCells.get(76).getValue() + " " + sudokuCells.get(77).getValue() + " | " + sudokuCells.get(78).getValue() + " " + sudokuCells.get(79).getValue() + " " + sudokuCells.get(80).getValue() + " |");
        System.out.println("|-------|-------|-------|");
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
