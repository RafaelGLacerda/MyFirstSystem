import java.util.ArrayList;
import java.util.Date;

public class atividade1 {
    private String companhia;
    private String origem;
    private String destino;
    private Date dataVoo;
    private String horaVoo;
    private int numeroDoVoo;
    private ArrayList<Integer> cadeirasOcupadas;

    
    public atividade1(String companhia, String origem, String destino, Date dataVoo, String horaVoo, int numeroDoVoo) {
        this.companhia = companhia;
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;
        this.horaVoo = horaVoo;
        this.numeroDoVoo = numeroDoVoo;
        this.cadeirasOcupadas = new ArrayList<>();
    }

    
    public int proximoLivre() {
        int proximaCadeira = 1;
        while (cadeirasOcupadas.contains(proximaCadeira)) {
            proximaCadeira++;
        }
        return proximaCadeira;
    }

    
    public boolean verifica(int numeroCadeira) {
        return cadeirasOcupadas.contains(numeroCadeira);
    }

    
    public boolean ocupa(int numeroCadeira) {
        if (cadeirasOcupadas.contains(numeroCadeira)) {
            return false; 
        } else {
            cadeirasOcupadas.add(numeroCadeira);
            return true; 
        }
    }

    
    public int vagas() {
        return 100 - cadeirasOcupadas.size();
    }

    
    public int getVoo() {
        return numeroDoVoo;
    }

    
    public Date getData() {
        return dataVoo;
    }
}
