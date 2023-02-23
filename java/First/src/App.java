import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("What is your name?");
        // String name = scanner.nextLine();
        // System.out.println("How old are you?");
        // int age = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println("What is your favorite food?");
        // String food = scanner.nextLine();

        // System.out.println("Hello " + name);
        // System.out.println("You are " + age);
        // System.out.println("And you like eating " + food);
        
        // String name = JOptionPane.showInputDialog("What is your name? ");
        // JOptionPane.showMessageDialog(null, "Hello " + name);

        // int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        // JOptionPane.showMessageDialog(null, "You are " + age + " years of age.");

        // Double gpa = Double.parseDouble(JOptionPane.showInputDialog("GPA: "));
        // JOptionPane.showMessageDialog(null, "Your GPA is: " + gpa);

        // double x ;
        // double y ;
        // double t ;

        // System.out.println("First number: ");
        // double firstNum = scanner.nextInt();
        // System.out.println("Second number: ");
        // double secondNum = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println("Your name: ");
        // String name = scanner.nextLine();

        // double hypo = Math.sqrt((firstNum * firstNum)+(secondNum * secondNum));

        // System.out.println(hypo + "and u are " + name);


        // Random random = new Random();
        // int x = random.nextInt(6) + 1;
        // double y = random.nextDouble();
        // boolean z = random.nextBoolean();
        // System.out.println(z);

        // int age = 14;

        // if(age >= 75){
        //     System.out.println("damn, you old");
        // } else if(age >= 50){
        //     System.out.println("you aight");
        // }else if(age >= 30){
        //     System.out.println("Youre at working age, well past that but still.");
        // }else if(age >= 15){
        //     System.out.println("play a lot of videogames youll lose the chance to when you grow up");
        // }else {
        //     System.out.println("damn you a fetus");
        // }

        // String day = "xd";

        // switch(day){
        //     case "Saturday":System.out.println("its saturday yo.");
        //     break;
        //     case "Sunday":System.out.println("class tomorrow fuck this");
        //     break;
        //     case "Monday":System.out.println("ahh, death.");
        //     break;
        //     case "Tuesday":System.out.println("hope is no more.");
        //     break;
        //     case "Wednesday":System.out.println("stop, dont give me hope.");
        //     break;
        //     case "Thursday":System.out.println("perhaps?");
        //     break;
        //     case "Friday":System.out.println("i cant fucking believe it, god has not forsaken me.");
        //     break;
        //     default: System.out.println("ahh youre dumb af yo");
        // }

        // int x = 19;
        // if (x < 10 && x > 5){
        //     System.out.println("x is less than 10 and is greater than 5.");
        // } else if (x > 10 && x < 20){
        //     System.out.println("x is greater than 10 but less than 20");
        // }

        // System.out.println("Quit game? ");
        // String decision = scanner.nextLine();

        // if (decision.equals("Q") || decision.equals("q")) {
        //     System.exit(0);
        // }else {
        //     System.out.println("in progress. . . ");
        // }

        // String name = "";

        // while(name.isBlank()){
        //     System.out.println("Enter your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Welcome " + name);


        // for (int i=1; i<11; i++){
        //     System.out.println(i);
        // }

        // int rows;
        // int cols; 
        // String symbol ="";

        // System.out.println("Enter # of rows: ");
        // rows = scanner.nextInt();
        // System.out.println("Enter # of columns: ");
        // cols = scanner.nextInt();

        // System.out.println("Input the symbol: ");
        // symbol = scanner.next();

        // for (int i = 1; i <= rows; i++){
        //     System.out.println();
        //     for (int j = 1; j <= cols; j++){
        //         System.out.print(symbol + " ");
        //     }
        // }

        // int a = 10;
        // int b = 20;
        // int c = 0;

        // c = a;
        // a = b;
        // b = c;

        // System.out.println(a);
        // System.out.println(b);

        // String[] cars = {"Camaro", "Corvette", "Tesla"};

        // for(int i = 0; i < cars.length; i++){
        //     System.out.println(cars[i]);
        // }

            // String[][] cars = { {"Camaro", "Corvette", "Silverado"},
            //                     {"Mustang", "Ranger", "F-150"},
            //                     {"Ferrari", "Lambo", "Tesla"}};

            // for (int i = 0; i<cars.length; i++){
            //     System.out.println();
            //     for(int j = 0; j<cars[i].length; j++){
            //         System.out.print(cars[i][j] + " ");
            //     }
            // }

            // String name = "Nito";

            // boolean result = name.equals("Nito");
            // int result = name.length();
            // char result = name.charAt(2);
            // int result = name.indexOf("t");
            // boolean result = name.isEmpty();
            // String result = name.toLowerCase();
            // String result = name.toUpperCase();
            // String result = name.replace('i', 'a');

            // System.out.println(result);

            // Boolean a = true;
            // Character b = '@';
            // Integer c = 123;
            // Double d = 3.14;
            // String e = "Nito";

            // ArrayList<String> food = new ArrayList<String>();
            // food.add("pizza");
            // food.add("hamburger");
            // food.add("hotdog");

            // food.set(0, "sushi");
            // food.remove(2);

            // food.clear();

            // for(int i=0; i<food.size(); i++){
            //     System.out.println(food.get(i));
            // }

            // try{
            //     ArrayList<ArrayList<String>> groceryList = new ArrayList();

            //         ArrayList<String> bakeryList = new ArrayList();
            //         bakeryList.add("pasta");
            //         bakeryList.add("garlic bread");
            //         bakeryList.add("donuts");

            //         ArrayList<String> produceList = new ArrayList();
            //         produceList.add("tomatoes");
            //         produceList.add("zucchini");
            //         produceList.add("peppers");

            //         ArrayList<String> drinksList = new ArrayList();
            //         drinksList.add("Soda");
            //         drinksList.add("coffee");

            //         groceryList.add(bakeryList);
            //         groceryList.add(produceList);
            //         groceryList.add(drinksList);
            //         System.out.println(groceryList.get(2).get(4));
            // }catch(Exception e){
            //     System.out.println("invalid");
            // }

        
        // String[] animals = {"cat", "dog", "rat", "bird"};
        // // ArrayList<String> animals = new ArrayList<String>();

        // // animals.add("cat");
        // // animals.add("dog");
        // // animals.add("rat");
        // // animals.add("bird");
        // for (int i=0; i<animals.length; i++){
        //     System.out.println(animals[i]);
        // }

        // for(String i: animals){
        //     System.out.println(i);
        // }
        
    //     String name = "nito";
    //     int age = 22;
    //     hello(name, age);

    // }

    // static void hello(String name, int age){
    //     System.out.println("Hello " + name + ". You are " + age + " years of age.");
    // }

        // int x = 3;
        // int y= 4;

        // int z = sum(x, y);
        // System.out.println(z);

        int x = add(1, 2, 5, 10);
        System.out.println(x);
        double y = add(1, 5, 7);
        System.out.println(y);

    }

    // static int sum(int x, int y){
    //     int z = x + y;
    //     return z;
    // }

    static int add(int a, int b){
        System.out.println("overloaded method 1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("overloaded method 2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("overloaded method 3");
        return a + b + c + d;
    }

    static double add(double a, double b){
        System.out.println("overloaded method 4");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("overloaded method 5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("overloaded method 6");
        return a + b + c + d;
    }


}
