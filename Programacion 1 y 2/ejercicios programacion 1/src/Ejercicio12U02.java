public class Ejercicio12U02 {
    public static void main(String[] args) {
        // int[][] marco = {
        //     {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        //     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        //     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        //     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        //     {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        // };
        int[][] marco = new int[5][15];
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0 || i == 4 || j == 0 || j== 14) {
                    marco[i][j] = 1;
                }else{
                    marco[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j]);
            }
            System.out.println();
        }
    }
}
