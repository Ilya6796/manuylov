package examples;

/**
 * Created by User on 20.10.2015.
 */
public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };
        for(int i=0;i<3;i++){//column's cycle
            for(int j=0;j<4;j++){//line's cycle

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }}
}
