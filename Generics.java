import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Generics<T> {
    
    private List<T> elementos = new ArrayList<>();
    
    public void empilhar(T elemento) {
        elementos.add(elemento);
    }
    
    public T desempilhar() {
        if (elementos.isEmpty()) {
            throw new NoSuchElementException("Pilha vazia!");
        }
        return elementos.remove(elementos.size() - 1);
    }
    
}

// Generics é um recurso do Java que permite escrever classes e métodos que possam
// trabalhar com tipos (classes ou interfaces) genéricos, ou seja, tipos que serão definidos em tempo de execução.


// A principal vantagem do uso de Generics é a possibilidade de criar classes e métodos que possam 
// trabalhar com diferentes tipos de objetos sem a necessidade de criar uma classe ou método específico para cada tipo.
