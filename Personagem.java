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
        System.out.println(nome + " caçando...");
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
