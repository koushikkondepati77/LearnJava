package javaStrings;

import java.util.Scanner;

public class SimpleLoginSystem {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "Admin@123";

        Scanner scanObj = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanObj.nextLine();
        System.out.println();
        System.out.print("Enter Password: A");
        String inputPassword = scanObj.nextLine();

        if(username.equals(inputUsername) && password.equals(inputPassword)){
            System.out.println("Login Successfull");
        }else{
            System.out.println("Invalid Login Credentials");
        }

    }
}
