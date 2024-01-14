import java.util.Scanner;

class Controll{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // String lang = input.next();
        String lang = "Java";

        for(int i=0; i<5;++i)
            System.out.println("Java is fun "+ i);

        if(lang.equals("Java")){
            System.out.println("Hello Java");
        }
        else if(lang.equals("C")){
            System.out.println("Hello C");
        }
        else{
            System.out.println("Hello World");
        }

        switch (lang) {
            case "Java":
                System.out.println("I was watching too: Java");
                break;
            case "C":
                System.out.println("I was watching too: C");
                break;
        
            default:
                System.out.println("We ain't got that here!");
                break;
        }

        // int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        String[] numbers = {"one","two","three","four","five","six","seven","eight","nine","ten"};
        for(String num: numbers){
            System.out.println("Number " + num);
        }

        first:
        for(int i=0; i<5;++i){
            second:
            for(int j=0; j<5;++j){
                if(i==3)
                    continue first;
                if(j==3)
                    continue second;
                System.out.println("i: " + i + " j: " + j);
            }
        }



        input.close();
    }
}