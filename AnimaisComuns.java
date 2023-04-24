abstract class AnimaisComuns{
    private String animal;

    public AnimaisComuns(String animal){
        this.animal = animal;
    }

    public void Andar(){
        System.out.println(animal + " está andando");
    }
    public void Dormir(){
        System.out.println(animal + " está dormindo");
    }

    public abstract void emitirSom();
}
class cachorro extends AnimaisComuns{
    public cachorro(){
        super("Cachorro");
    }
    public void emitirSom(){
        System.out.println("Auauauau!");
    }
}
class gato extends AnimaisComuns{
    public gato(){
        super("Gato");
    }
    public void emitirSom(){
        System.out.println("Miauuuuu!");
    }
}
class vaca extends AnimaisComuns{
    public vaca(){
        super("vaca");
    }
    public void emitirSom(){
        System.out.println("Muuuuuuuu!");
    }
}
public class FunçãoAnimal{
    public static void main(String[] args){

cachorro dog = new cachorro();
gato cat = new gato();
vaca cow = new vaca();

dog.Andar();
dog.emitirSom();
dog.Dormir();

System.err.println();

cat.Andar();
cat.emitirSom();
cat.Dormir();

System.err.println();

cow.Andar();
cow.emitirSom();
cow.Dormir();

    }
}
