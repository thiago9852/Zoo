package POO.Casting.Zoologico;

public class Cachorro extends Mamifero {
    private float altura;

    @Override
    public float correr(){
        if (peso <= 4) {
            return velocidade * (peso / altura);
        }else{
            return velocidade * (peso / altura + 20);
        }
    }
    
    public Cachorro(String nome, float peso, int idade, int velocidade, float altura) {
        super(nome, peso, 2, idade, velocidade);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
}
