package exemplos.heranca;

/**
 * Classe utilizada para testar a Herança da classe
 * Funcionario.
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        /* Declarações comuns. */
        Pessoa alexandre = new Pessoa("alexandre", 999);
        Funcionario breno = new Funcionario("breno", 292, "arquiteto");
        
        /* Todo Funcionario é uma Pessoa. */
        Pessoa sakurai = new Funcionario("arthur", 313, "telecomunicação");
        
        /* Erro de compilação, porque nem toda
           Pessoa é um Funcionario. */
        //Funcionario cristiano = new Pessoa("Cristiano", 456);
    }
}
