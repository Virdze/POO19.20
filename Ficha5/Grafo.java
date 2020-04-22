
/**
 * Write a description of class Grafo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;

public class Grafo
{
    private Map<Integer,Set<Integer>> adj;
    
    public Grafo(){
        this.adj = new HashMap<>();
    }
    
    public void addArco(Integer vOrig,Integer vDest){
        this.adj.putIfAbsent(vOrig.new HashSet<>()); //garantem se o vOrig/vDest existem ou nao.
        this.adj.putIfAbsent(vDest.new HashSet<>()); // ________________________________________
        this.adj.get(vOrig).add(vDest);
    }
    
    public boolean isSynk (Integer v){
        return this.adj.get(v).isEmpty();
    }
    
    public boolean isSource (Integer v){
        boolean source = this.adj.containsKey(v);
        Iterator<Set<Integer>> it = this.adj.values().iterator();
        while (it.hasNext() && source)
            source = !it.next().contains(v);
        return source;
    }
    
    public boolean haCaminho(Integer vOrig,Integer vDest){
        return haCaminho(vOrig,vDest,new HashSet<>());
    }
    
    public boolean haCaminho (Integer vOrig,Integer vDest,Set<Integer> visitados){
       if (vOrig == vDest) return true;
       if (!this.adj.containsKey(vOrig) || visitados.contains(vOrig)) return false;
       Iterator<Integer> it = this.adj.get(vOrig).iterator();
       boolean hac = false;
       visitados.add(vOrig);
       while(it.hasNext() && !hac) 
            hac = haCaminho(it.next(),vDest,visitados);
       return hac;
    }
}