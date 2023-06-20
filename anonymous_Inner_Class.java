package Java_Basics_Revision;

import java.util.Scanner;

abstract class lock {
    public abstract boolean isUnlocked(String key);
}

    class door1{
        private lock lock = new lock() {
            @Override
            public boolean isUnlocked(String key) {
                return key.equals("qwerty");
            }
        };

        public lock getLock() {
            return lock;
        }
    }


public class anonymous_Inner_Class {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the key");
        String key = sc.nextLine();

        door1 d = new door1();

        if (d.getLock().isUnlocked(key)) {
            System.out.println("Door is unlocked");
        }
        else{
            System.out.println("Key entered is incorrect");
        }
    }
}
