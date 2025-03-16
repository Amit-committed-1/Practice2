package com.psa1;

import java.util.Random;
import java.util.Scanner;

public class LoginOtp {
    // Method to generate a random OTP of 6 digits
    public static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); // Generates a 6-digit OTP
        return String.valueOf(otp);
    }

    // Method to simulate sending OTP (e.g., via email)
    public static void sendOTP(String otp, String userEmail) {
        // In a real-world scenario, you would use an email service (like JavaMail) or SMS API here
        System.out.println("OTP sent to " + userEmail + ": " + otp); // Simulating OTP being sent
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for username and password (for simplicity, we use hardcoded values)
        String correctUsername = "user123";
        String correctPassword = "password123";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Step 2: Check if username and password are correct
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Credentials verified. Proceeding to OTP verification.");

            // Step 3: Generate OTP
            String otp = generateOTP();

            // Simulate sending OTP (here we're just printing it, but you'd normally send via email/SMS)
            sendOTP(otp, "user@example.com");

            // Step 4: Ask user to input the OTP
            System.out.print("Enter the OTP sent to your email: ");
            String enteredOTP = scanner.nextLine();

            // Step 5: Verify OTP
            if (enteredOTP.equals(otp)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid OTP. Login failed.");
            }
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }

        scanner.close();
    }
}
