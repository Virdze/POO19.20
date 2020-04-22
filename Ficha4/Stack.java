
/**
 * Write a description of class Stack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stack
{
    /** public arraylist-string> getNomes() **/
    
    pubic boolean empty(){
        return this.nomes.isEmpty();
    }
    
    public int length(){
        return this.nome.size()
    }
    
    public void push(String s){
        this.nomes.add(s);
    }
    
    public String top(){
        return this.nomes.get(this.nomes.size()-1);
    }
    
    public void pop(){
        this.nomes.remove(this.nomes.size()-1);
    }
    
    
}
