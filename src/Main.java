import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    private static ArrayList<String> clientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String opcao;
        do {
            opcao = leiaOpcoes();
            switch (opcao) {

                case "1":
                    cadastrarCliente();
                    break;

                case "2":
                    adicionarGastos();

                case "3":
                    registrarPagamentos();


            }
        } while (!opcao.equals("5"));


    }

    public static String leiaOpcoes() {
        return JOptionPane.showInputDialog(
                "Escolha uma opção: \n"

                        + "1 - Cadastrar cliente\n"
                        + "2 - Adicionar gastos\n"
                        + "3 - Registrar pagamentos\n"
                        + "4 - Exibir informações atualizadas de valores para determinado cliente \n"
                        + "5 - Sair");
    }

    public static void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog(null, "digite o nome do cliente");
        if (nome != null && !nome.trim().isEmpty()) {
            clientes.add(nome);
            JOptionPane.showMessageDialog(null, "cliente " + nome + " adicionado");
        }

    }

    public static void adicionarGastos() {
        String nomeCliente = JOptionPane.showInputDialog(null, "digite para qual cliente gostaria de adicionar gastos");
        if (clientes.contains(nomeCliente)) {
            int gastos = Integer.parseInt(JOptionPane.showInputDialog(null, "digite quanto " + nomeCliente + " gastou"));
        } else {
            JOptionPane.showMessageDialog(null, "cliente não encontrado");
        }
    }

    public static void registrarPagamentos() {
        String nomeCliente = JOptionPane.showInputDialog(null, "digite para qual cliente gostaria de adicionar pagamentos realizados");
        if (clientes.contains(nomeCliente)) {
            int pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "digite quanto foi pago pelo cliente " + nomeCliente));
        } else {
            JOptionPane.showMessageDialog(null, "cliente não encontrado");
        }
    }
}