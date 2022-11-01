package my_package01;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("My first hello world,let's do something interest");
        int[][] a;
        a = new int[4][4];
        for(int i = 0; i < 4; i++){
            a[i][i] = i;
            //System.out.println(a[i][i]);
        }
//        for(int i = 0; i < 4; i++){
//            for(int j = 0; j < 4; j++){
//                System.out.print(a[i][j] + ' ');
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
