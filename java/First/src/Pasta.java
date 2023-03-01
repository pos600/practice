// constructor try

public class Pasta {
    
    String pasta;
    int packs;
    double price;

        Pasta(String pasta, int packs, double price){

            this.pasta = pasta;
            this.packs = packs;
            this.price = price;

        }

        void thePasta(){
            System.out.println(this.pasta + " is the pasta.");
        }
        void thePacks(){
            System.out.println(this.price + " are the number.");
        }
        void thePrice(){
            System.out.println(this.price + " is the price.");
        }

}
