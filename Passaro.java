package POO.Casting.Zoologico;

public class Passaro extends Animal {
    private boolean voa;
    private int envergadura;
    
    public float alturaDoVoo(){
        if (!voa) {
            return 0.0f;
        }
        return (this.envergadura * 100) / this.peso;
    }
    public Passaro(String nome, float peso, boolean voa, int envergadura) {
        super(nome, peso, 1);
        this.voa = voa;
        this.envergadura = envergadura;
    }

    public boolean getVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }

    
}
