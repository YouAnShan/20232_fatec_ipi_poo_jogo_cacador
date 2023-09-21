public class TestePersonagem 
{
    public static void main(String[] args) 
    {
        //java 10(compilador): inferência de tipos
        Personagem p = new Personagem();
        p.nome = "José";
        p.cacar();
        p.comer();
        p.dormir();
    }
}
