public class TwoDMatrixRoration {

    public static void main(String[] args) {

        int[][] actualArray = {{1, 2, 3},
                               {4, 5, 6},
                               {7, 8, 9}};
        System.out.println(getMatrix(actualArray));
    }

    public static int[][] getMatrix(int[][] array) {
        int temp[][] = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            int l = 0;
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print("" + array[j][i] + "\t");
                for (int k = 0; k < array.length; k++) {
                    temp[i][l]=array[j][i];
                    break;
                }
                l++;
            }
            System.out.println("");
        }

        return array;
    }

}
