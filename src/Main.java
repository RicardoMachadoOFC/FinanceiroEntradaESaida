import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       String opcao;
       do {
           opcao = leiaOpcoes();
           switch (opcao) {

               case "1":


               case "2":


               case "3":



           }
       }while (!opcao.equals("5"));



    }
    public static String leiaOpcoes(){
        return  JOptionPane.showInputDialog(
                "Escolha uma opção: \n"

                        + "1 - Cadastrar cliente\n"
                        + "2 - Adicionar gastos\n"
                        + "3 - Registrar pagamentos\n"
                        + "4 - Exibir informações atualizadas\n"
                        + "5 - Sair");
    }
}