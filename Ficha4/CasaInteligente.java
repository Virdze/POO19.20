
/**
 * Write a description of class CasaInteligente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class CasaInteligente
{
    private String nome;
    private List<Lampada> lampadas; //Deixa de se espcificar como um arraylist mas sim apenas como list,
    // assim recebe qualquer tipo de list. Array Atribute, etc ...  
    
    public CasaInteligente(){
        this.nome = new String();
        this.lampadas = new ArrayList<>(); //Aqui e preciso especificar o tipo de List!!
    }
    
    public CasaInteligente(String  nome, List<Lampada> lps){
        this.nome = nome;
        setLampadas(lps); //Nao queremos que quem de fora possa aceder diretamente as lampadas.
    }
    
    public void setLampadas(List<Lampada> lps){
        this.lampadas = new ArrayList<>();
        for(Lampada l : lps)
            this.lampadas.add(l.clone()); // O set lampadas criar uma copia da lista de lampadas, mas este lps 
        }
        
    public CasaInteligente(CasaInteligente ci){
        this.nome = ci.getNome();
        setLampadas(ci.getLampadas());
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public List<Lampada> getLampadas(){
        List<Lampada> aux = new ArrayList<>();
        for(Lampada l : this.lampadas)
            aux.add(l.clone());
        return aux;
    }
    
    public CasaInteligente clone(){
        return new CasaInteligente(this);
    }
    
    public boolean equals(Object o){
        if (o == this) return true;
        if (o ==  null || o.getClass() != this.getClass()) return false;
        CasaInteligente ci = (CasaInteligente) o;
        return this.nome.equals(ci.getNome()) &&
               this.lampadas.equals(ci.getLampadas());
               
    }
    
    public void addLampada(Lampada l){
        this.lampadas.add(l.clone());
    }
    
    public void ligaLampadaNormal(int index){
        this.lampadas.get(index).lampON();
    }
    
    
    //3 formas de fazer
    //for ich
    public int qtEmECO(){
        int c = 0;
        for(Lampada l : this.lampadas)
            if (l.getModo() == 2)
               c++;
        return c;
    }
    
    //iterador externo
    
    public int qtEmEcoIT(){
        int c = 0;
        Iterator<Lampada> it = this.lampadas.iterator();
        while(it.hasNext()){
            Lampada l = it.next();
            if (l.getModo() == 2)
                c++;
            }
        return c;
    }
    
    //iterador interno
    
    public int qtEmEcoStreams(){
        return (int) this.lampadas.stream() // converte a estrutura de dados num stream
                     .filter(l -> l.getModo() == 2)
                     .count();
    }
    
    public void ligaTdasEco(){
        this.lampadas.stream()
                     .forEach(l -> l.lampECO());
    }
    
    public double consumoTotal(){
        return (double) this.lampadas.stream()
                                     .mapToLong(Lampada :: getTotal)
                                     .sum();
    }
   
    public void reset(){
        for(Lampada l : this.lampadas)
            l.setTotal(0);
    }

    //Lampada com maior consumo
    //as lampadas vao estar ordenadas pelo seu consumo 
    
    public Lampada lampadaMaisgasto(){
        TreeSet<Lampada> ts = new TreeSet<>();
            // usa ordem natural dado pelo compareTo (da lampada)
        for (Lampada l : this.lampadas)
          ts.add(l);
        return ts.first().clone());
    }
}

    
    
