package Atv1Java;

public class Cadastro extends Imposto{
    private String id;
    private String nome;
    private String email;
    private Double salario;





    public Cadastro(String id, String nome, String email, Double salario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Cadastro{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void aumento(int porcentagem){
        setSalario(this.salario + (this.salario * ((double)porcentagem/100)));
    }

}
