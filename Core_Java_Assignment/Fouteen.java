public class Fouteen {
    public static void main(String[] args) {
        Counter counterObj = new Counter(5);
        counterObj.increment();
        counterObj.increment();
        counterObj.increment();
        System.out.println(counterObj.getCount());
        counterObj.decrement();
        counterObj.decrement();
        System.out.println(counterObj.getCount());
    }
}