public class Recursion {
    
    public static void main(String[] args) {

        // SayHi(5);
        countBackwards(14);
        
    }

    // public static void SayHi(int n) {

    //     if(n == 0){
    //         System.out.println("Done!");
    //     }else{

    //         System.out.println("Hi");
    //         n--;
    //         SayHi(n);

    //     }

    // }

    public static void countBackwards(int n) {

        if (n == 0){
            System.out.println("Done!");
        }else{
            System.out.println(n);
            n--;
            countBackwards(n);
        }
        
    }

}
