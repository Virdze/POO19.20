import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Iterator;
/**
 * Write a description of class FBFeed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FBFeed
{
    private List<FBPost> timeline;
    private int n_posts;
    
    public FBFeed(){
        this.n_posts = 0;
        this.timeline = new ArrayList<>();
    }
    
    public FBFeed(ArrayList<FBPost> p, int n){
        this.n_posts = n;
        setPosts(p);
    }
    
    public void setPosts(ArrayList<FBPost> post){
        this.timeline = new ArrayList<>();
        for(FBPost p : post)
            this.timeline.add(p.clone());
    }
    
    public FBFeed(FBFeed fbf){
        this.n_posts = fbf.getNPosts();
        setPosts(fbf.getTimeline());
    }
    
    public int getNPosts(){
        return this.n_posts;
    }
    
    public ArrayList<FBPost> getTimeline(){
        ArrayList<FBPost> aux = new ArrayList<FBPost>();
        for(FBPost p : this.timeline)
            aux.add(p.clone());
        return aux;
    }
    
    public FBFeed clone(){
        return new FBFeed(this);
    }
    
    public ArrayList<String> addComentario(String comentario){
        ArrayList<String> aux = new ArrayList<>();
        aux.add(comentario);
        return aux;
    }
    
    public int nrPosts(String user){
        int c = 0;
        for(FBPost p : this.timeline)
            if(p.getNome() == user) c++;
        return c;
    }
    
    public List<FBPost> postsOf(String user){
        ArrayList<FBPost> aux = new ArrayList<>();
        for(FBPost p : this.timeline)
            if(p.getNome() == user)
                aux.add(p.clone());
        return aux;
    }
    
    public List<FBPost> postsInBetween(String user, LocalDateTime inicio, LocalDateTime fim){
        ArrayList<FBPost> aux = new ArrayList<>();
        for(FBPost p : this.timeline)
            if (p.getNome() == user && p.getData().isAfter(inicio) && p.getData().isBefore(fim)) 
                aux.add(p.clone());
        return aux;
    }
    
    public FBPost getPost(int id){
        FBPost x = new FBPost();
        for(FBPost p : this.timeline)
            if (p.getIdentificador() == id) 
                x = p;
        return x;
    }
            
    public void comment(FBPost post, String comentario){
        for(FBPost p : this.timeline)
            if (p == post)
                p.setComentarios(addComentario(comentario));
    }
    
    public void comment(int postid,String comentario){
        for(FBPost p : this.timeline)
            if (p.getIdentificador() == postid)
                p.setComentarios(addComentario(comentario));
    }
    
    public void like(FBPost post){
        for(FBPost p : this.timeline)
            if (p == post)
            p.addLike();
    }
    
    public void like(int postid){
        for(FBPost p: this.timeline)
            if (p.getIdentificador() == postid)
                p.addLike();
    } 
   
    /* public List<Integer> top5CommentsIT(){
        List<Integer> aux = new List<>();
        Iterator<FBPost> fbp = new this.timeline.iterator();
        while(fbp.hasnext()){
            FBPost f = fbp.next();
            if(          
            */      
            
        

    
}
