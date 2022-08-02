import java.util.Scanner;


public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,col;

        System.out.println("Enter matrix sizes : ");
        row = sc.nextInt();
        col = sc.nextInt();

        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int[][] add = new int[row][col];
        int[][] sub = new int[row][col];
        int[][] mutl = new int[row][col];


        System.out.println("Enter matrix 1 elements : ");
        for(int i = 0 ; i < row ; i++){
            for (int j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter matrix 2 elements : ");
        for(int i = 0 ; i < row ; i++){
            for (int j = 0; j < col; j++) {
                mat2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //adding
        for(int i = 0 ; i < row ; i++){
            for (int j = 0; j < col; j++){
                add[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Addition : ");
        for(int i = 0 ; i < row ; i++){
            for (int j = 0; j < col; j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }

        //subtraction
        for(int i = 0 ; i < row ; i++){
            for (int j = 0; j < col; j++){
                sub[i][j] = mat1[i][j] - mat2[i][j];
            }
        }

        System.out.println("Substraction : ");
        for(int i = 0 ; i < row ; i++){
            for (int j = 0; j < col; j++){
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }

        //Multiplication
        for(int i = 0 ; i < row ; i++){
            for (int j = 0; j < col; j++){
                mutl[i][j] = mat1[i][j] * mat2[i][j];
            }
        }

        System.out.println("Multiplication : ");
        for(int i = 0 ; i < row ; i++){
            for (int j = 0; j < col; j++){
                System.out.print(mutl[i][j]+" ");
            }
            System.out.println();
        }
    }
}
