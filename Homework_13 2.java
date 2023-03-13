// Sevastian Venegas
// Algorithms
// Homework #13
// 11/15/2022

public class Homework_13 {
    public static void main(String[] args) {
        int n = args.length;
        for(int i = 0; i < args.length; i++){
            int ran = (int)(Math.random()*n) + i;
            String temp = args[i];
            args[i] = args[ran];
            args[ran] = temp;
            System.out.println(args[i]);
            n--;
        }
    }
}
