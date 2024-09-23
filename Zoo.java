package POO.Casting.Zoologico;
public class Zoo {
    private Animal[] animais = new Animal[5];

    public Zoo(Animal[] animais) {
        this.animais = animais;
    }

    public float calcula(Animal animal){
        if (animal instanceof Cachorro) {
            Mamifero mamifero = (Mamifero) animal;
            return mamifero.correr();
        }

        if (animal instanceof Cavalo) {
            Mamifero mamifero = (Mamifero) animal;
            return mamifero.correr();
        }else{
            Passaro passaro = (Passaro) animal;
            return passaro.alturaDoVoo();
        }
    }

   /* public float calcula(Animal animal) {
        boolean isCavalo = animal instanceof Cavalo ;
        boolean isCachorro = animal instanceof Cachorro ;
        boolean isPassaro = animal instanceof Passaro ;

        if (isCavalo || isCachorro) {
            Mamifero mamifero = (Mamifero) animal ;
            return mamifero.correr();
        } else if (isPassaro) {
            Passaro passaro = (Passaro) animal ;
            return passaro.alturaDoVoo();
        }

        return 0.0f ;
    }*/

    public Animal buscaAnimal(String nome){
        for (int i = 0; i < animais.length; i++) {
            if (animais[i].getNome().equals(nome)) {
                return animais[i];
            }
        }
        return null;
    }

    public boolean excluirAnimal(Animal animal){
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] == null) continue;               
            if (animais[i].getNome().equals(animal.getNome())) {
                animais[i] = null;
                return true;
            }
        }
    // Reordenar o vetor depois que excluir um animal
        for (int i = 0; i < animais.length; i++) { //O loop interno percorre o vetor procurando por elementos `null`.
            if (animais[i] == null) {
                for (int j = 0; j < animais.length; j++) { //O loop interno interno percorre o vetor procurando por um elemento não `null`.
                    if (animais[j] != null ) { 
                        animais[i] = animais[j]; // troca os dois elementos de lugar. Atribui o elemento não `null` à posição do elemento `null`.
                        animais[j] = null; // atribui `null` à posição do elemento não `null`.
                        break;
                    }
                }
            }
        }
        return false;
    }

    public boolean adicionarAnimal(Passaro passaro){
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] == null) {
                animais[i] = passaro;
                return true;
            }
        }
        return false;
    }

    public boolean adicionarAnimal(Cachorro cachorro){
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] == null) {
                animais[i] = cachorro;
                return true;
            }
        }
        return false;
    }

    public boolean adicionarAnimal(Cavalo cavalo){
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] == null) {
                animais[i] = cavalo;
                return true;
            }
        }
        return false;
    }

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    
}
