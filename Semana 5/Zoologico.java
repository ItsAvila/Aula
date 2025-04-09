public class Zoologico {
    public static void main(String[] args) {
        
        // Array armazenando objetos diferentes de subclasses
        Animal[] animais = new Animal[3];
        animais[0] = new Leao("Simba", 5);
        animais[1] = new Elefante("Dumbo", 10);
        animais[2] = new Pinguim("Skipper", 3);

        System.out.println("----- BEM VINDO AO ZOO DO 32 -----");
        
        // Polimorfismo se comportando diferente para cada animal
        for (Animal animal : animais) {
            animal.exibirInfo();
            animal.emitirSom(); 
        }
        
        System.out.println("----- VOLTE SEMPRE -----");
    }
}
