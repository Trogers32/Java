public class Basic13 {
    public static void main(String[] args) {
        pr();
        prSum();
    }
    // Write a method that prints all the numbers from 1 to 255.
    public static void pr(){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }
    // Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far.
    public static void prSum(){
        int sum = 0;
        for(int i = 0; i < 256; i++){
            System.out.printf("New number: %s Sum: %d%n", i, sum+=i);
        }
    }
}