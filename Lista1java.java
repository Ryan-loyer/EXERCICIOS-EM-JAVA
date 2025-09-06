import java.util.Scanner;

public class Lista1java {
        public static void questao1(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a quantidade mínima de peças: ");
            double quantidadeMinima = scanner.nextDouble();

            System.out.println("Digite a quantidade máxixma de peças: ");
            double quantidadeMaxima = scanner.nextDouble();

            double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
            System.out.println("O estoque médio é: " + estoqueMedio);

            scanner.close();
        }

        public static void questao2(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a cotação atual do Dólar: ");
            double cotacao = scanner.nextDouble();

            System.out.println("Digite o valor em dólares: ");
            double valorDolar = scanner.nextDouble();

            double valoremReal = cotacao * valorDolar;
            System.out.println("O valor em reais é de: R$" + valoremReal);

            scanner.close();
        }

        public static void questao3(){
                        
        }
}
