import java.util.Arrays;
import java.util.Scanner;
public class LearningJava {
    public static void main(String[] args){
       
        int[] numbers = {2, 6, 8, 3, 4, 5, 10, 15, 20, 1, 11};
        System.out.println(Arrays.toString(numbers));
        System.out.println("What are the indices of the values in the array would you wish swapped positions? ");
        System.out.println("Enter the first one? ");
        Scanner indexFinder = new Scanner(System.in);
        int index1ToSwap = indexFinder.nextInt();
        System.out.println("Enter the second one? ");
        int index2ToSwap = indexFinder.nextInt();
        int container;
        container = numbers[index1ToSwap];
        numbers[index1ToSwap] = numbers[index2ToSwap];
        numbers[index2ToSwap] = container;

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }

        //Ascending order
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length - 1; j++){
                int orderContainer;
                if (numbers[j] > numbers[j +1]){
                    orderContainer = numbers[j];
                    numbers[j] = numbers[j +1];
                    numbers[j +1] = orderContainer;
                }
            }
        }
        System.out.println("Your array in ascending order: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //Binary search
        System.out.println("Which value in the array do you wish to find its position? ");
        int locateValue = indexFinder.nextInt();
        System.out.println(Arrays.binarySearch(numbers,locateValue));
        // I could not figure out how to binary search manually so I
        // did some research but could not understand it yet. I thought
        // it would be irrational to implement code I can't understand so
        // I used an in-built function I found.


        //Descending order
        for(int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length - 1; j++){
                int orderContainer;
                if (numbers[j] < numbers[j +1]) {
                    orderContainer = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = orderContainer;
                }
            }
        }
        System.out.println("Your array in descending order: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //Linear search
        System.out.println("Which value in the array do you wish to find its position? ");
        int searchValue = indexFinder.nextInt();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == searchValue){
                System.out.println("Your value is at index "+ i);
            }
        }
    }
}
