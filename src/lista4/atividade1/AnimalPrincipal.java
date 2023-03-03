package lista4.atividade1;

public class AnimalPrincipal {
    public static void main(String[] args) {
        Animal animal = new Animal("Garfield", 4, 4,"Laranja", "Casa", 8 );
        Peixe peixe = new Peixe("Nemo", 1, 0,"Laranja", "Mar", 2 );
        System.out.println(animal.toString()+"\n");
        System.out.println(peixe.toString());
    }
}
