
/**
 * Write a description of class LinhaEncomenda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.String;

public class LinhaEncomenda
{
    private String ref;
    private String desc;
    private double preco;
    private double qtd;
    private double taxa;
    private double desconto;
    
    public LinhaEncomenda(){
        this.ref = " ";
        this.desc = new String();
        this.preco = 0.0;
        this.qtd = 0.0;
        this.taxa = 0.0;
        this.desconto = 0.0;
    }
    
    public LinhaEncomenda(String ref, String d, double p, double q, double t, double desconto){
        this.ref = ref;
        this.desc = d;
        this.preco = p;
        this.qtd = q;
        this.taxa = t;
        this.desconto = desconto;
    }
    
    public LinhaEncomenda(LinhaEncomenda le){
        this.ref = le.getRef();
        this.desc = le.getDesc();
        this.preco = le.getPreco();
        this.qtd = le.getQtd();
        this.taxa = le.getTaxa();
        this.desconto = le.getDesconto();
    }
    
    public String getRef(){
        return this.ref;
    }
    public String getDesc(){
        return this.desc;
    }
    public double getPreco(){
        return this.preco;
    }
    public double getQtd(){
        return this.qtd;
    }
    public double getTaxa(){
        return this.taxa;
    }
    public double getDesconto(){
        return this.desconto;
    }
    
    public void setRef(String r){
        this.ref = r;
    }
    public void setDesc(String r){
        this.desc = r;
    }
    public void setPreco(double r){
        this.preco = r;
    }
    public void setQtd(double r){
        this.qtd = r;
    }
    public void setTaxa(double r){
        this.taxa = r;
    }
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    
    public LinhaEncomenda clone(){
        return new LinhaEncomenda(this);
    }
    
    public double calculaValorLinhaEnc(){
        return ((this.preco * this.qtd) * (100 - this.desconto)/100 * (100 + this.taxa)/100);
    }
}
