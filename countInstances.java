public class countInstances {
    
    private static int instanceCounter = 0;

    public countInstances() {
            instanceCounter++;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    public static void main(String[] args) {
        
        countInstances obj1 = new countInstances();
        countInstances obj2 = new countInstances();
        countInstances obj3 = new countInstances();
        System.out.println("Number of instances: " + countInstances.getInstanceCounter()); 

        countInstances obj4 = new countInstances();
        countInstances obj5 = new countInstances();
        System.out.println("Number of instances: " + countInstances.getInstanceCounter()); 
    }
}