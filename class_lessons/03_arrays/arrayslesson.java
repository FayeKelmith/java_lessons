import java.util.*;
// import java.util.Arrays;

class ArraysLesson{
    public static void main(String[] args){

        Scanner input  = new Scanner(System.in);

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        double average;
        int[] numbers2 = new int[numbers.length];

        System.arraycopy(numbers,0,numbers2,0,numbers.length);

        System.out.println(Arrays.toString(numbers2));

        // System.out.println(Arrays.toString(numbers));
        for(int num: numbers)
            sum += num;

        System.out.println("Sum = " + sum);

        average = (double)sum/numbers.length;

        System.out.println("Average = " + average);
        

        input.close();

    }
}