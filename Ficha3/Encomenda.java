
/**
 * Write a description of class Encomenda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.time.LocalDate;

public class Encomenda
{
    // instance variables - replace the example below with your own
    private String nome;
    private String ref;
    private String morada;
    private int num;
    private LocalDate data;
    private LinhaEncomenda[] linhas;
    private int nlinhasUsadas;
    
    public Encomenda (){
        this.nome = new String();
        this.ref = new String();
        this.morada = new String();
        this.num = 0;
        this.data = LocalDate.now();
        this.linhas = new LinhaEncomenda[0];
        this.nlinhasUsadas = 0;
    }
    
    public Encomenda (String n, String ref, String m, int num, LinhaEncomenda[] l, int nMaxLE){
        this.nome = n;
        this.ref = ref;
        this.morada = m;
        this.num = num;
        this.data = LocalDate.now();
        int i;
        this.linhas = new LinhaEncomenda[nMaxLE];
        for(i = 0; i < l.length;i++)
            this.linhas[i] = l[i];
        this.nlinhasUsadas = i;
    }
    
    
}
