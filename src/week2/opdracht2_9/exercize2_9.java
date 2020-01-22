package week2.opdracht2_9;

import java.util.ArrayList;


public class exercize2_9 {
    public static void main (String [] args) {
        int sizeOfMatrix = 4;
        ArrayList<ArrayList> matrix = matrixBuilder(sizeOfMatrix);
        for (ArrayList<Integer> row: matrix) {
            System.out.println(row);
        }
        System.out.println("");

        ArrayList<ArrayList> matrixSwapped = matrixSwapper(matrix);
        for (ArrayList<Integer> swappedRow: matrixSwapped){
            System.out.println(swappedRow);
        }
    }

    public static ArrayList<ArrayList> matrixBuilder(int matrixSize) {
        ArrayList<ArrayList> wholeMatrix = new ArrayList<>();
        for (int outerCounter = 0; outerCounter < matrixSize; outerCounter++) {
            ArrayList<Integer> matrixHorizontal = new ArrayList();
            for (int innerCounter = 0; innerCounter < matrixSize; innerCounter++) {
                matrixHorizontal.add((int)(Math.random()* 9 + 1));
            }
            wholeMatrix.add(matrixHorizontal);
        }
        return wholeMatrix;
    }

    public static ArrayList<ArrayList> matrixSwapper(ArrayList<ArrayList> matrix){
        ArrayList<ArrayList> swappedMatrix = new ArrayList<>();
        int outerIndex = 0;
        for (ArrayList<Object> rows : matrix) {
            ArrayList<Object> swappedMatrixRow = new ArrayList<>();
            int innerIndex = 0;
            for (Object swappedRow : rows){
                swappedMatrixRow.add(matrix.get(innerIndex).get(outerIndex));
                innerIndex++;
            }
            outerIndex++;
            swappedMatrix.add(swappedMatrixRow);
        }
        return swappedMatrix;
    }
}