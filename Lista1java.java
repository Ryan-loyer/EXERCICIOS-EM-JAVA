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
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Identificação do vendedor: ");
            String vendedor = scanner.nextLine();

            
            System.out.println("Código da peça: ");
            String codigoPeca = scanner.nextLine();

            
            System.out.println("Preço unitário da peça: ");
            double precoUnitario = scanner.nextDouble();

            
            System.out.println("Quantidade vendida: ");
            int quantidade = scanner.nextInt();

            double totalVenda = quantidade * precoUnitario;

            double comissao = totalVenda * 0.5;

            System.out.println("\nResumo da venda:");
            System.out.println("Vendedor: " + vendedor);
            System.out.println("Código da peça: " + codigoPeca);
            System.out.printf("Total da venda: R$ %.2f%n", totalVenda);
            System.out.printf("Comissão (5%%): R$ %.2f%n", comissao);

            scanner.close();

        }

        public static void questao4(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        int D = scanner.nextInt();

        System.out.println("\nResultados das somas e multiplicações:");

        System.out.printf("A + B = %d, A * B = %d%n", A + B, A * B);
        System.out.printf("A + C = %d, A * C = %d%n", A + C, A * C);
        System.out.printf("A + D = %d, A * D = %d%n", A + D, A * D);
        System.out.printf("B + C = %d, B * C = %d%n", B + C, B * C);
        System.out.printf("B + D = %d, B * D = %d%n", B + D, B * D);
        System.out.printf("C + D = %d, C * D = %d%n", C + D, C * D);

        scanner.close();
        }

        public static void questao5(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tempo gasto na viagem (horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Informe a velocidade média (km/h): ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;

        System.out.printf("Velocidade média: %.2f km/h%n", velocidade);
        System.out.printf("Tempo gasto: %.2f horas%n", tempo);
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Litros de combustível usados: %.2f litros%n", litrosUsados);

        scanner.close();
        }
}
