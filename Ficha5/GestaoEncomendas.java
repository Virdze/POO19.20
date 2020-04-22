
/**
 * Write a description of class GestaoEncomendas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeSet;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

public class GestaoEncomendas
{
    private Map<String,EncEficiente> encomendas;
    private String cod_encomenda; 
    
    
    public GestaoEncomendas(){
        this.encomendas = new HashMap<>();
        this.cod_encomenda = new String();
    }
    
    public GestaoEncomendas(Map<String,EncEficiente> ecds, String ce){
        setEncomenda(ecds);
        this.cod_encomenda = ce;
    }
    
    public GestaoEncomendas(GestaoEncomendas ge){
        setEncomenda(ge.getEncomenda());
        this.cod_encomenda = ge.getCod_encomenda();
    }
    
    public String getCod_encomenda(){
        return this.cod_encomenda;
    }
    
    public Map<String,EncEficiente> getEncomenda(){
        Map<String,EncEficiente> aux = new HashMap<>();
        for(Map.Entry<String,EncEficiente> e : this.encomendas.entrySet())
            aux.put(e.getKey() , e.getValue().clone());
        return aux;
    }
    
    public void setEncomenda(Map<String,EncEficiente> ecds){
        this.encomendas = new HashMap<>();
        ecds.entrySet().forEach(e -> this.encomendas.put(e.getKey() , e.getValue().clone()));
    }   
        
    public GestaoEncomendas clone(){
        return new GestaoEncomendas(this);
    }
    

    public Set<String> todosCodigosEnc(){
        return this.encomendas.keySet();
    }
    
    public void addEncomenda(EncEficiente enc){
        this.encomendas.put(enc.getNum_E() , enc.clone());
    }
    
    public EncEficiente getEncomenda(String codEnc){
        return this.encomendas.get(codEnc).clone();
    }
    
    public void removeEncomenda(String codEnc){
        this.encomendas.remove(codEnc);
    }
    
    public String encomendaComMaisProdutos(){
        int q = 0;
        String s = new String();
        for(Map.Entry<String,EncEficiente> e : this.encomendas.entrySet()){
            if (e.getValue().numeroTotalProdutos() > q){
                q = e.getValue().numeroTotalProdutos();
                s = e.getKey();
            }
        }
        return s;
    }
    
    public Set<String> encomendasComProduto(String codProd){
        Set<String> s = new HashSet<>();
        for(Map.Entry<String,EncEficiente> e : this.encomendas.entrySet())
            if(e.getValue().getNum_E().equals(codProd)){
                s.add(e.getKey());
            }
        return s;
    }
 
    
    public Set<String> encomendasAposData(LocalDate d){
        Set<String> s = new HashSet<>();
        for(Map.Entry<String,EncEficiente> e : this.encomendas.entrySet()){
            if (e.getValue().getData().isAfter(d))
            s.add(e.getKey());
        }
        return s;
    }
    
    public Set<EncEficiente> encomendasValorDescrescente(){
        Set<EncEficiente> s = new TreeSet<>(new ComparatorValorEnc());
        for(EncEficiente e : this.encomendas.values())
        s.add(e.clone());
        return s;
    }
    
    public Map<String,List<String>> encomendasDeProduto(){
        Map<String,List<String>> aux = HashMap<>();
        for(EncEficiente e : this.encomendas.values()){
            String cod = e.getNum_E();
            aux.put(e.getKey() , .... );
            
        
}
