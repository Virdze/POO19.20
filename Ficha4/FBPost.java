import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class FBPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FBPost
{
    private int identificador;
    private String nome;
    private LocalDateTime data;
    private String conteudo;
    private int likes;
    private ArrayList<String> comentarios;
    
    public FBPost(){
        this.identificador = 0;
        this.nome = new String();
        this.data = LocalDateTime.now();
        this.conteudo = new String();
        this.likes = 0;
        this.comentarios = new ArrayList<>();
    }
    
    public FBPost(int id, String n, String cont, int l, ArrayList<String> com){
        this.identificador = id;
        this.nome = n;
        this.data = LocalDateTime.now();
        this.conteudo = cont;
        this.likes = l;
        setComentarios(com);
    }
    
    public FBPost (FBPost fbp){
        this.identificador = fbp.getIdentificador();
        this.nome = fbp.getNome();
        this.data = fbp.getData();
        this.conteudo = fbp.getConteudo();
        this.likes = getLikes();
        setComentarios(getComentarios());
    }
    
    public int getIdentificador(){
        return this.identificador;
    }
    public String getNome(){
        return this.nome;
    }
    public LocalDateTime getData(){
        return LocalDateTime.now();
    }
    public String getConteudo(){
        return this.conteudo;
    }
    public int getLikes(){
        return this.likes;
    }
    public ArrayList<String> getComentarios(){
        ArrayList <String> aux = new ArrayList <>();
        for( String l : this.comentarios)
            aux.add(l);
        return aux;
    }
    
    public FBPost clone(){
        return new FBPost(this);
    }
    
    public void setComentarios(ArrayList<String> comentarios){
        this.comentarios = new ArrayList<>();
        for(String c: comentarios)
            this.comentarios.add(c);
    }
    
    public void addLike(){
        this.likes++;
    }
    
    
        
}
