class shopDoor{
    private lock lock;

    public shopDoor() {
        lock = new lock(true);
    }

    public void shopStatus(){
        if (lock.isLock()){
            System.out.println("Shop is closed please visit later");
        }
        else{
            System.out.println("Shop is open, Welcome");
        }
    }

    public lock getLock() {
        return lock;
    }

    class lock{
        private boolean lock;

        public lock(boolean lock) {
            this.lock = lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }
}
public class Inner_Class {

    public static void main(String[] args) {

        shopDoor door = new shopDoor();
        door.shopStatus();
        door.getLock().setLock(false);
        door.shopStatus();
    }
}