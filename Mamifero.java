package POO.Casting.Zoologico;

public class Mamifero extends Animal {
    protected int idade;
    protected int velocidade;

    public float correr(){
        return this.velocidade * (100 - this.idade) / 100 ;
    }

    public Mamifero(String nome, float peso, int tipo, int idade, int velocidade) {
        super(nome, peso, tipo);
        this.idade = idade;
        this.velocidade = velocidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    
}
