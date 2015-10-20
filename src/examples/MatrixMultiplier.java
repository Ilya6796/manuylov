/**
 * Created by User on 20.10.2015.
 */
public class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };

        int [] third=new int[3];//add result here


        for (int inner = 0; inner < first.length; inner++) {//first array
            third[inner]=0;

            for (int j = 0; j < second.length; j++) {//second array
                third[inner] += first[inner][j]*second[j][inner];//multiply arrays

            }
            System.out.println(third[inner]);
        }

    }
}
