public class empresa {
    public static void main(String[] args){

String[] nomes = {"João", "Fernando","Jhonson"};
String[] cargo = {"Repositor", "Coordenador", "Gerente"};
double[] salario = {1800, 2550.30, 3500.10};

for(int i = 0; i < nomes.length; i++){
    
    System.out.println("nome: " + nomes[i] + ", " + "Cargo: " + cargo[i] + ", " + "Salario: " + salario[i]);
    
}

double soma = 0;
for(int i = 0; i < salario.length; i++){
    soma += salario[i];
}

double media = soma / salario.length;
System.out.println();
System.out.println("A media de salarios dos funcionarios é: R$ " + media);


    }
}
