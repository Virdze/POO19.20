package ExercicosFiguras;

public class Circulo {
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private double raio;

    public Circulo() {
        this.x = 0.0;
        this.y = 0.0;
        this.raio = 0.0;
    }

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo c) {
        this.x = c.getX();
        this.y = c.getY();
        this.raio = c.getRaio();
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void alteraCentro(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculaArea(){
        return Math.PI * Math.pow(raio,2.0);
    }

    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }
}
