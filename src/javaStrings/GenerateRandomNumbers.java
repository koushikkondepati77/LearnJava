package javaStrings;

import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i<5;i++){
            System.out.println(random.nextInt(100)); //prints random numbers between 0-99
        }
    }
}
