package exemplos.heranca;

/**
 * Classe utilizada para representar o Coordenador.
 * Classe utilizada para representar um Coordenador que é uma Pessoa.
 */
public class Coordenador extends Pessoa {
    //private String nome;
    //private int matricula;
    private String cursoCoordenado;
    
    public Coordenador(String nome, int matricula, String cursoCoordenado) {
        super(nome, matricula);
    	//this.nome = nome;
        //this.matricula = matricula;
        this.cursoCoordenado = cursoCoordenado;
    }

    //public int getMatricula() { return matricula; }
    //public void setMatricula(int matricula) { this.matricula = matricula; }

    //public String getNome() { return nome; }
    //public void setNome(String nome) { this.nome = nome; }

    public String getCursoCoordenado() { return cursoCoordenado; }
    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }
}
