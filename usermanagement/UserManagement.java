/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.io.IOException;
import java.util.Scanner;

/**
 * Stephen Zoyac 
 * 12/5/20 
 * Hashmap Project.
 *
 * Demonstrates the use of a map to manage a set of objects.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class UserManagement {

    /**
     * Creates and populates a group of users. Then prompts for interactive
     * searches, and finally prints all users.
     */
    public static void main(String[] args) throws IOException {
        Users users = new Users();

        //base set of users
        users.addUser(new User("fziffle", "Fred", "Ziffle"));
        users.addUser(new User("geoman57", "Marco", "Kane"));
        users.addUser(new User("rover322", "Kathy", "Shear"));
        users.addUser(new User("appleseed", "Sam", "Geary"));
        users.addUser(new User("mon2016", "Monica", "Blankenship"));

        Scanner scan = new Scanner(System.in);
        String uid, uname, ulast;
        User user;
        int menu = 0;

        do {
            System.out.print("Stack Menu Selections |1. Add User"
                    + " |2. Find User "
                    + " |3. List Users |4. Remove User |5. Exit: ");
            menu = Integer.parseInt(scan.next());
            switch (menu) {
                case 1:
                    //enters Id, with first and last name
                    System.out.print("Enter new userID to add: ");
                    uid = scan.next();
                    System.out.print("Enter First name: ");
                    uname = scan.next();
                    System.out.print("Enter Last name: ");
                    ulast = scan.next();
                    users.addUser(new User(uid, uname, ulast));
                    break;

                case 2:
                    //finds user
                    System.out.print("Enter User ID: ");
                    uid = scan.next();
                    user = users.getUser(uid);
                    if (user == null) {
                        System.out.println("User not found.");
                    } else {
                        System.out.println(user);
                    }
                    break;

                case 3:
                    // print all users
                    System.out.println("\nAll Users:\n");
                    for (String userId : users.getUserIds()) {
                        System.out.println(users.getUser(userId));
                    }
                    break;

                case 4:
                    //gets rid of a user
                    System.out.print("Enter userID to remove: ");
                    uid = scan.next();
                    user = users.getUser(uid);
                    if (user == null) {
                        System.out.println("User not found.");
                    } else {
                        users.removeUser(uid);
                    }
                    break;
                case 5:
                    //ends
                    System.exit(0);
                    break;
            }
            System.out.println();

        } while (menu <= 5);

    }

}
