import org.example.InvalidAgeException;

import java.util.Scanner;

public class VotingCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check eligibility for the voting");
        int age = sc.nextInt();
        try {
            EnterAge(age);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }

    public static void EnterAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are under age so you can't vote");
        } else {
            System.out.println("You are allowed to vote");
        }
    }
}