package POO.Casting.Zoologico;

public class Cavalo extends Mamifero{
    private String raca;

    public Cavalo(String nome, float peso, int idade, int velocidade, String raca) {
        super(nome, peso, 3, idade, velocidade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
