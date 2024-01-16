import java.util.Scanner;
class Hello{
    public static void main(String args[]){

        

        Scanner input = new Scanner(System.in);
        //just prints the string in quotes to terminal
        System.out.print("Java is not that bad!");
        //does not move to next line before printing. Just prints and then moves to next line
        System.out.println("\nWe could get something going!");
        //Just like C. Moves to the next line, prints, then stays on that line
        System.out.printf("Let's see where this goes!\n");

        //Float vs Double
        float f = 1.2345678901234567890f;
        double d = 1.2345678901234567890;
        double anotherDouble = 1.223e-5;

        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Another Double: " + anotherDouble);
        
        //we need to add the f to the end of the float to make it a float
        //otherwise it will be a double
        //we can use e to make exponents
        System.out.println("Your name please: ");
        String name = input.nextLine();
        System.out.println("You entered: " + name);
    
        System.out.println("\nCan I get a number: ");
        int number = input.nextInt();
        System.out.println("You entered: " + number);

        input.close();
    }
}
