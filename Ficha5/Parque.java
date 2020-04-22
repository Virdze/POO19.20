
import java.util.Map;
import java.util.HashMap;
import java.uitl.Set;

public class Parque{
    private String nome_parque;
    private Map<String,Lugar> lugares;

    public Parque(){
        this.nome_parque = new String();
        this.lugares = new HashMap<>();
    }

    public Parque(String np,Map<String,Lugar> lugs){
        this.nome_parque = np;
        setLugares(lugs);
    }

    public Parque(Parque p){
        this.nome_parque = p.getNome_parque();
        setLugares(p.getLugares());
    }

    public void setLugares(Map<String,Lugar> lugs) {
        this.lugares = new HashMap<>();
        lugs.entrySet().forEach(e -> this.lugares.put(e.getKey(), e.getValue().clone()));
    }

    public Map<String,Lugar> getLugares(){
        Map<String,Lugar> aux = new HashMap<>();
        for(Map.Entry<String,Lugar> e : this.lugares.entrySet())
            aux.put(e.getKey(), e.getValue().clone());
        return aux;
    }
    
    public String getNome_parque(){
        return this.nome_parque;
    }

    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Parque p = (Parque) o;
        return this.nome_parque.equals(p.getNome_parque()) &&
                this.lugares.equals(p.getLugares());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Parque: ").append("\n")
                .append(this.nome_parque).append("\n")
                .append(this.lugares).append("\n");
        return sb.toString();
    }

    public Parque clone(){
        return new Parque(this);
    }
    
    public Set<String> todasAsMatri(){
        return this.lugares.keySet();
    }
    
    
}
