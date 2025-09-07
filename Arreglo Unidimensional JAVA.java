public class Main {
    public static void main(String[] args) {
        int r = 3, c = 3;
        int[][] TwoDArr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[] arr = new int[r * c];
        int k = 0;

        // Convertir de 2D a 1D
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[k++] = TwoDArr[i][j];
            }
        }

        System.out.println("Los elementos del array bidimensional son:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(TwoDArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nLos elementos del array unidimensional son:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

