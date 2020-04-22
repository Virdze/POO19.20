
import java.lang.Object;

public class Lugar
{
    private String matricula;
    private String nome;
    private int minutos;
    private boolean permanente;

    public Lugar() {
        this.matricula = new String();
        this.nome = new String();
        this.minutos = 0;
        this.permanente = false;
    }

    public Lugar(String m, String n, int min, boolean p){
        this.matricula = m;
        this.nome = n;
        this.minutos = 0;
        this.permanente = p;
    }

    public Lugar(Lugar l){
        this.matricula = l.getMatricula();
        this.nome = l.getNome();
        this.minutos = l.getMinutos();
        this.permanente = l.getPermanente();
    }

    // GETS
    public String getMatricula() {
        return this.matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public boolean getPermanente() {
        return this.permanente;
    }

    //Sets

    public void setMatricula(String m) {
        this.matricula = m;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setMinutos(int min){
        this.minutos = min;
    }
    public void setPermanente(boolean p){
        this.permanente = p;
    }

    public Lugar clone(){
        return new Lugar(this);
    }

    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Lugar l = (Lugar) o;
        return this.matricula.equals(l.getMatricula()) &&
                this.nome.equals(l.getMatricula()) &&
                this.minutos == (l.getMinutos()) &&
                this.permanente == (l.getPermanente());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Lugar: ").append(this.matricula).append("\n")
                .append(this.nome).append("\n")
                .append(this.minutos).append("\n")
                .append(this.permanente).append("\n");
        return sb.toString();
    }



}

