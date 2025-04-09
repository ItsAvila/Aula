public class Pinguim extends Animal {
    
    public Pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Pru pru!");
    }
}