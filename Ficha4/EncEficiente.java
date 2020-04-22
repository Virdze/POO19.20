import java.util.ArrayList;
import java.time.LocalDate;
/**
 * Write a description of class EncEficiente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class EncEficiente
{
    private ArrayList<String> nome;
    private ArrayList<String> num_f;
    private ArrayList<String> morada;
    private int num_E;
    private LocalDate data;
    private ArrayList<LinhaEncomenda> linhas_;
    private int nlinhasUsadas;
    
    public EncEficiente(){
        this.nome = new ArrayList<String>();
        this.num_f = new ArrayList<String>();
        this.morada = new ArrayList<String>();
        this.num_E = 0;
        this.data = LocalDate.now();
        this.linhas_ = new ArrayList<LinhaEncomenda>();
        this.nlinhasUsadas = 0;
    }
    
    public EncEficiente(ArrayList<String> nome, ArrayList<String> num_f, ArrayList<String> morada,
    int num_e, ArrayList<LinhaEncomenda> linhas, int linhasU){
        this.nome = nome;
        this.num_f = num_f;
        this.morada = morada;
        this.num_E = num_e;
        this.data = LocalDate.now();
        this.linhas_ = linhas;
        this.nlinhasUsadas = linhasU;
    }
    
    public EncEficiente(EncEficiente e){
        this.nome = e.getNome();
        this.num_f = e.getNum_f();
        this.morada = e.getMorada();
        this.num_E = e.getNum_E();
        this.data = e.getData();
        this.linhas_ = e.getLinhas_();
        this.nlinhasUsadas = e.getNlinhasUsadas();
    }
    
    public ArrayList<String> getNome(){
        return this.nome;
    }
    
    public ArrayList<String> getNum_f(){
        return this.num_f;
    }
    
    public ArrayList<String> getMorada(){
        return this.morada;
    }
    
    public int getNum_E(){
        return this.num_E;
    }
    
    public LocalDate getData(){
        return LocalDate.now();
    }
    
    private ArrayList<LinhaEncomenda> getLinhas_(){
        return this.linhas_;
    }
    
    public int getNlinhasUsadas(){
        return this.nlinhasUsadas;
    }
    
    public void setNlinhasUsadas(int a){
        this.nlinhasUsadas = a;
    }
        
    public double calculaValorTotal(){
        double valor = 0;
        int i = 0;
        while(i < this.getNlinhasUsadas()){
            valor += (this.linhas_.get(i).calculaValorLinhaEnc());
            i++;
        }
        return valor;
    }
    
    public double calculaValorDesconto(){
        double desconto = 0;
        int i = 0;
        while(i<this.getNlinhasUsadas()){
            desconto += (this.linhas_.get(i).calculaValorDesconto());
            i++;
        }
        return desconto;
    }
    
    public int numeroTotalProdutos(){
        int contador = 0;
        int i = 0;
        while(i < this.getNlinhasUsadas()){
            contador += (this.linhas_.get(i).getQuantidade());
            i++;
        }
        return contador;
    }
    
    public boolean existeProdutoEncomenda(String refProduto){
        boolean vry = false;
        int i= 0;
        while(i < this.getNlinhasUsadas() && vry != true){
            if (this.linhas_.contains(this.nome))
            vry = true;
        }
        return vry;
    }
    
    public void adicionaLinha(LinhaEncomenda linha){
        int i;
        for(i = 0; i < this.getNlinhasUsadas(); i++);
        this.linhas_.add(linha);
        setNlinhasUsadas(i);
    }
    
    public void removeProduto(String codProd){
        int i;
        for(i = 0; i < getNlinhasUsadas();i++){
            if(this.linhas_.equals(codProd)){
                this.nome.remove(codProd);
                this.num_f.remove(codProd);
                this.morada.remove(codProd);
            }
        }
    }
}
