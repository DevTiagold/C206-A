import java.util.Scanner;
public class MainContaBanco {
    public static void main(String[] args) {
        System.out.print("Informe seu nome de usuário e senha: ");
        Scanner entrada = new Scanner(System.in);
        String nome;
        int opcao;
        float deposito;
        float saque;
        int senha = 0000;
        int contadorErros = 0;
        int continuarSecao = 1;
        boolean verifica = false;
        boolean verifica2 = false;
        ContaBanco conta1 = new ContaBanco();

        //Dados conta1
        conta1.nomeDoContratante = "Tiago Augusto";

        nome = entrada.nextLine();

        switch (nome){
            case "Tiago Augusto":
                while(verifica2 == false && continuarSecao == 1){

                    if(continuarSecao == 1){
                        System.out.print("Senha de 4 digitos: ");
                        senha = entrada.nextInt();
                    }



                    if (senha == conta1.senhaDaConta){
                        while(continuarSecao == 1){
                            System.out.print("1/para Depositos 2/saques: ");
                            opcao = entrada.nextInt();
                            if(opcao == 1){
                                System.out.print("Quanto deseja depositar: ");
                                deposito = entrada.nextFloat();
                                conta1.debito(deposito);
                                System.out.println(conta1.nomeDoContratante+ " Depósito realizado, seu novo saldo é R$" + conta1.saldoDaConta);
                            }
                            if(opcao == 2){
                                System.out.print("Quanto deseja sacar: ");
                                saque = entrada.nextFloat();
                                conta1.saque(saque);
                                System.out.println(conta1.nomeDoContratante+ " Saque realizado, seu novo saldo é R$" + conta1.saldoDaConta);
                            }
                            System.out.print("Deseja fazer alguma outra acao: 1/sim 2/nao: ");
                            continuarSecao = entrada.nextInt();
                            if(continuarSecao != 1)
                                System.out.println("Encerrando secao...");
                        }
                        break;

                    }
                    if(senha != conta1.senhaDaConta){
                        System.out.println("Acesso negado, Tente novamente");
                        contadorErros += 1;
                        if(contadorErros == 3){
                            verifica2 = true;
                        }
                        verifica = true;
                    }

                }
                if(verifica == true){
                    System.out.println("Erros excedidos!!! CONTA BLOQUEADA.");
                }
                else{
                    System.out.println("Saiu com sucesso, Obrigado!");
                }
                break;

            default:
                System.out.println("Usuário inválido, verifique executando novamente!");
                System.out.println("Obs: Verifica letras maiusculas e minusculas e ainda se está digitando o primeiro e segundo nome.");
                break;

        }

    }


}
