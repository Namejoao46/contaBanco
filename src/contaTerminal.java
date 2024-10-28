import java.util.Scanner;

public class contaTerminal {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String [] args){
      Scanner leitor = new Scanner(System.in);
      
      //inserindo variaveis
      double saldo = 237.48;
      int numeroConta;
      String nomeCliente, agencia;

      //lendo variaveis inseridas pelo usuario
      System.out.println("POR FAVOR, DIGITE O NUMERO DA SUA CONTA!");
      numeroConta = leitor.nextInt();
      System.out.println("AGORA DIGITE O NUMERO DA SUA AGÊNCIA");
      agencia = leitor.next();
      System.out.println("AGORA INFORME O SEU NOME COMPLETO");
      nomeCliente = leitor.next();
      System.out.println("SEU SALDO ATUAL E DE; " + saldo);

      //imprimindo para o usuario
      System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está " + "disponível para saque", nomeCliente, agencia, numeroConta, saldo);

      //fechando classe scanner
      leitor.close();

    }
}