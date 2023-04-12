// No Java, a palavra-chave "static" é usada para declarar uma variável, método ou bloco de código que pertence 
// à classe em vez de pertencer a uma instância específica dessa classe. 
// Isso significa que a variável ou método pode ser acessado diretamente pela classe sem precisar criar um objeto dessa classe.

// Por exemplo, uma variável estática pode ser usada para contar quantas instâncias de uma classe foram criadas:

public class MyClass {
    static int instanceCounter = 0;
    
    public MyClass() {
        instanceCounter++;
    }
}
