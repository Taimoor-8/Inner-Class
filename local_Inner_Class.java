import java.util.Scanner;

class door{

    public boolean isLocked(String key){
        class lock{
            public boolean isLocked(){
                if (key.equals("qwerty")){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return new lock().isLocked();
    }
}

public class local_Inner_Class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        door d = new door();

        System.out.println("Enter the key");
        String key = sc.nextLine();

        if (d.isLocked(key)){
            System.out.println("Key entered is incorrect");
        }
        else{
            System.out.println("Door is unlocked");
        }
    }
}
