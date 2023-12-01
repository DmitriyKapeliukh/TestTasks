package test;

public class PiramidTask {

    public static void buildBigXInTheDoubleArray() {
        int size = 30; // You can change the size of the square array

        char[][] array = buildBigXArray(size);

        // Print the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] buildBigXArray(int size) {
        char[][] array = new char[size][size];

        // Fill the array with 'o' initially
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = 'o';
            }
        }

        // Draw the 'x' symbol in the center
        for (int i = 0; i < size; i++) {
            array[i][i] = 'x';         // Diagonal from top-left to bottom-right
            array[i][size - 1 - i] = 'x'; // Diagonal from top-right to bottom-left
        }

        return array;
    }
}
