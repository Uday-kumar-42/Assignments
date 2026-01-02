import java.util.*;

public class FourtyOne {
    public static void main(String[] args) {
        Set<Circle> set=new HashSet<>();
        set.add(new Circle(0,0,5));
        set.add(new Circle(1,1,10));
        set.add(new Circle(0,0,5));

        System.out.println(set.size());
    }
}

class Circle implements Comparable<Circle> {
    int x,y,r;

    Circle(int x,int y,int r){
        this.x=x; this.y=y; this.r=r;
    }

    public int compareTo(Circle c){
        return r - c.r;
    }

    public boolean equals(Object o){
        Circle c=(Circle)o;
        return x==c.x && y==c.y && r==c.r;
    }

    public int hashCode(){
        return Objects.hash(x,y,r);
    }
}

