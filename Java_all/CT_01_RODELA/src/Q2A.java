public class Q2A {
    public static void main(String[] args) {
        //2A//
        int[][] arr = new int[4][0];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[2];
        arr[3] = new int[1];

        int num=10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=num--;
            }
        }

        //2B//
        for (int j = 0; j < arr[2].length; j++) {

            System.out.print(arr[2][j]+" ");

        }
    }

}