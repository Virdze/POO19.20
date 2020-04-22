
/**
 * Write a description of class TesteTurma here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesteTurma
{
    public static void main(String [] opts){
        Aluno a1 = new Aluno("1","Ze");
        Aluno a2 = new Aluno("2","Ana");
        Aluno a3 = new Aluno("3","To");
        
        Turma t = new Turma();
        
        t.insereAluno(a1);
        t.insereAluno(a2);
        t.insereAluno(a3);
        
        System.out.println("Turma:");
        
        System.out.println(t.toString());
        
        
        System.out.println("Alfabetica:");
        
        System.out.println(t.alunosOrdemAlfabetica());
       
        
        
        System.out.println("NUmerica:");
        
        System.out.println(t.alunosOrdemDecrescenteNumero());
    }
         
}
