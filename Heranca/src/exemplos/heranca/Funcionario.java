package exemplos.heranca;

/**
 * Classe utilizada para representar o Funcionario.
 * Classe utilizada para representar um Funcionario que é uma Pessoa.
 */
public class Funcionario extends Pessoa {
	//private String nome;
	//private int matricula;
    private String departamento;
    
    public Funcionario(String nome, int matricula, String departamento) {
        super(nome, matricula);
    	//this.nome = nome;
        //this.matricula = matricula;
        this.departamento = departamento;
    }

    //public int getMatricula() { return matricula; }
    //public void setMatricula(int matricula) { this.matricula = matricula; }

    //public String getNome() { return nome; }
    //public void setNome(String nome) { this.nome = nome; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
