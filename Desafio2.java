import java.util.ArrayList;
import java.util.Collections;

public class Grupos {
    public static void main(String[] args) {
        // Criando os arrays com os nomes
        String[] lideres = {"Líder1", "Líder2", "Líder3", "Líder4", "Líder5", "Líder6", "Líder7", "Líder8", "Líder9", "Líder10"};
        String[] conhecimentoMedio = {"Medio1", "Medio2", "Medio3", "Medio4", "Medio5", "Medio6", "Medio7", "Medio8", "Medio9", "Medio10"};
        String[] conhecimentoBasico = {"Basico1", "Basico2", "Basico3", "Basico4", "Basico5", "Basico6", "Basico7", "Basico8", "Basico9", "Basico10"};

        // Criando um ArrayList com todos os nomes
        ArrayList<String> nomes = new ArrayList<String>();
        Collections.addAll(nomes, lideres);
        Collections.addAll(nomes, conhecimentoMedio);
        Collections.addAll(nomes, conhecimentoBasico);

        // Embaralhando a lista de nomes para que a distribuição seja aleatória
        Collections.shuffle(nomes);

        // Criando os grupos de cada líder
        int tamanhoGrupo = (conhecimentoMedio.length + conhecimentoBasico.length) / lideres.length; // Tamanho de cada grupo
        ArrayList<ArrayList<String>> grupos = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < lideres.length; i++) {
            // Criando um grupo vazio para cada líder
            ArrayList<String> grupo = new ArrayList<String>();

            // Adicionando pessoas com conhecimento médio
            for (int j = 0; j < conhecimentoMedio.length && grupo.size() < tamanhoGrupo; j++) {
                if (!grupo.contains(conhecimentoMedio[j]) && !grupo.contains(lideres[i])) { // Verificando se a pessoa já está no grupo
                    grupo.add(conhecimentoMedio[j]);
                }
            }

            // Adicionando pessoas com conhecimento básico
            for (int j = 0; j < conhecimentoBasico.length && grupo.size() < tamanhoGrupo; j++) {
                if (!grupo.contains(conhecimentoBasico[j]) && !grupo.contains(lideres[i])) { // Verificando se a pessoa já está no grupo
                    grupo.add(conhecimentoBasico[j]);
                }
            }

            // Adicionando o líder ao grupo
            grupo.add(lideres[i]);

            // Adicionando o grupo à lista de grupos
            grupos.add(grupo);
        }

        // Imprimindo os grupos
        for (int i = 0; i < grupos.size(); i++) {
            System.out.println("Grupo " + (i+1) + ": " + grupos.get(i));
        }
    }
}
