package ExTele;

public class Resolucao {
    private int x;
    private int y;

    public Resolucao(){
        this.x = 0;
        this.y = 0;
    }
    public Resolucao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Resolucao(Resolucao r){
        this.x = r.getX();
        this.y = r.getY();
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
