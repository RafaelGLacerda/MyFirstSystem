public class nomeidade2 {
    
        private String nome;
        private int idade;
        
        public nomeidade2(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
        
        public String getNome() {
            return nome;
        }
        
        public int getIdade() {
            return idade;
        }
        
        public static nomeidade2 maiorIdade(nomeidade2[] pessoas) {
            nomeidade2 pessoaMaisVelha = pessoas[0];
            for (int i = 1; i < pessoas.length; i++) {
                if (pessoas[i].getIdade() > pessoaMaisVelha.getIdade()) {
                    pessoaMaisVelha = pessoas[i];
                }
            }
            return pessoaMaisVelha;
        }
    }
