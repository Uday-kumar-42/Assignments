public class Counter {
    private int count;

    public Counter(int count){
        this.count = count;
    }

    public Counter(){
        this(0);
    }

    public int getCount(){
        return this.count;
    }

    public void increment(){
        this.count++;
    }

    public void decrement(){
        this.count--;
    }
}
