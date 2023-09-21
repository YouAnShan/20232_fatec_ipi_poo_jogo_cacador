import java.util.EnumSet;

public class Personagem 
{
    //atributos ou propriedades
    String nome;
    int energia;
    int fome;
    int sono;
    //comportamento (métodos)
    void cacar()
    {
        if(energia >= 2)
        {
            System.out.println(nome + " caçando...");
            energia -= 2; //energia = energia - 2;
        }
        else
        {
            System.out.println(nome + " sem energia para caçar...");  
        }
        fome = Math.min(fome + 1,10);
        sono = Math.min(fome + 1,10);
    }
    void comer()
    {
        System.out.println(nome + " comendo...");
    }
    void dormir()
    {
        System.out.println(nome + " dormindo...");
    }
}
