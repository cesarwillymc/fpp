package prog7;

import prog2.RandomNumbers;

public class Prog7 {
    public static void main(String[] args) {
        int columns = 1;
        int rows = 7;
        firstSolution(columns, rows);

        secondSolution();
    }

    /**
     * Its used for create the shape
     *
     * 51
     * +3
     * --
     *
     * using the columns and params
     * @param columns
     * @param rows
     */
    static void firstSolution(int columns, int rows) {
        StringBuilder output = new StringBuilder();

        for (int a = 0; a < columns; a++) {
            for (int b = 0; b < rows; b++) {
                output.append(String.format("%12d", RandomNumbers.getRandomInt(1, 99)));
            }
            output.append(String.format("%n%n"));
            for (int b = 0; b < rows; b++) {
                output.append(String.format("%9s %2d", "+", RandomNumbers.getRandomInt(1, 99)));
            }
            output.append(String.format("%n"));
            for (int b = 0; b < rows; b++) {
                output.append(String.format("%12s", "____"));
            }
            System.out.print(output);
            output = new StringBuilder();
            System.out.println("\n \n");
        }
    }

    static void secondSolution() {
        String output = "";
        for (int a = 0; a < 2; a++) {
            output = String.format("%16d %12d %12d %12d %n %n", RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99));
            output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n", "+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99));
            output += String.format("%16s %12s %12s %12s", "____", "____", "____", "____");
            System.out.print(output);
            output = "";
            System.out.println("\n \n");
        }
    }
}
