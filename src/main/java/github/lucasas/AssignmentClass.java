package github.lucasas;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentClass {
    Scanner scanner = new Scanner(System.in);
    String[] menuItems = {"Create Post", "Delete Post", "Jump off a bridge", "Display Posts", "Exit"};
    String[] posts = new String[10];
    int postCounter = 0;
    int userMenuChoice;
    boolean exitProgram = true;

    void main() {
        while (exitProgram) {
            displayMenu();
            getUserInput();
            System.out.println("===== " + menuItems[userMenuChoice] + " =====");

            switch (userMenuChoice) {
                case 0 -> createPost();
                case 1 -> {
                    System.out.println("Skriv hvilken post du ville fjerne:");
                    int input = scanner.nextInt();
                    deletePost(input);
                }
                case 2 -> bridgeJump();
                case 3 -> displayPosts();
                case 4 -> exitProgram();
            }
            System.out.println("=========");
        }
    }

    private void displayPosts() {
        for (String post : posts) {
            if (post == null|| post.isEmpty()) {
                continue;
            }
            System.out.println(post);
        }
    }

    private void exitProgram() {
        exitProgram = false;
        System.out.println("Slutter programet!");
    }

    private void bridgeJump() {
        System.out.println("Hopper ud fra en bro.");
        System.out.println("Pas på benene!");
    }

    private void deletePost(int input) {
        posts[input] = "";
        System.out.println("Sletter en post..");
    }

    private void createPost() {
        System.out.println("Tast din post:");
        String post = scanner.next();
        System.out.println("Laver din post..");
        posts[postCounter] = post;
        postCounter++;
    }

    private void displayMenu() {
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(i + 1 + ". " + menuItems[i]);
        }
    }

    private void getUserInput() {
        System.out.println("Tast et tal fra 1 til " + menuItems.length + ":");
        int input = scanner.nextInt();
        if (input >= 1 && input <= menuItems.length) {
            userMenuChoice = input - 1;
        } else {
            userMenuChoice = 0;
        }
    }

}
