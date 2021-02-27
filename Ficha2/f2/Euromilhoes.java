package f2;

import java.util.Random;

public class Euromilhoes {
    private int n1,n2,n3,n4,n5,
            e1,e2;

    public Euromilhoes(){
        this.n1 = new Random().nextInt();
        this.n2 = new Random().nextInt();
        this.n3 = new Random().nextInt();
        this.n4 = new Random().nextInt();
        this.n5 = new Random().nextInt();
        this.e1 = new Random().nextInt();
        this.e2 = new Random().nextInt();
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public int getN5() {
        return n5;
    }

    public void setN5(int n5) {
        this.n5 = n5;
    }

    public int getE1() {
        return e1;
    }

    public void setE1(int e1) {
        this.e1 = e1;
    }

    public int getE2() {
        return e2;
    }

    public void setE2(int e2) {
        this.e2 = e2;
    }
}
