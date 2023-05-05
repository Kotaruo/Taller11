public class Animal {
    public void hacerSonido() {
        System.out.println("Haciendo ruido...");
    }
}

public class Perro extends Animal {
	 @Override
    public void hacerSonido() {
        System.out.println("Ladrando...");
    }
}

public class Gato extends Animal {
	 @Override
    public void hacerSonido() {
        System.out.println("Maullando...");
    }
}

public class Ejemplo {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        miAnimal.hacerSonido(); 
        
        miAnimal = new Perro();
        miAnimal.hacerSonido(); 
        
        miAnimal = new Gato();
        miAnimal.hacerSonido();
    }
}


