package Atv1Java;

    public class Principal extends Imposto {
        public static void main(String[] args) {



            Cadastro pessoa1 = new Cadastro("polar","Rafael","rafael@gmail.com",100.0);

            System.out.println(pessoa1.toString());
            pessoa1.aumento(10);
            System.out.println(pessoa1.toString());
            System.out.println(Imposto.calcularImposto(pessoa1.getSalario(),10));


        }
    }

