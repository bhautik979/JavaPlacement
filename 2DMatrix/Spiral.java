
public class Spiral {

    static void printSpiral(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top print karavo
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }

            // right print karavo
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // bottom print karo
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startCol == endCol) {                                                    //No one element get Repeted
                    break;                                                                   //up ma je print thay te again bottom ma na thavi joie
                }
                System.out.print(arr[endRow][i] + " ");
            }

            // left print karo
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startRow == endRow) {                                                   //No one element get Repeated
                    break;                                                                  //rigth ma print thai hoy te left ma na thavi joie
                }
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printSpiral(arr);
    }
}
