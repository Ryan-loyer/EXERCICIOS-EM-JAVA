import java.util.Scanner;

public class Lista1java {

        static Scanner scanner = new Scanner(System.in);

        public static void questao1(){
 
            System.out.println("Digite a quantidade mínima de peças: ");
            double quantidadeMinima = scanner.nextDouble();

            System.out.println("Digite a quantidade máxixma de peças: ");
            double quantidadeMaxima = scanner.nextDouble();

            double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
            System.out.println("O estoque médio é: " + estoqueMedio);

        }

        public static void questao2(){
 
            System.out.println("Digite a cotação atual do Dólar: ");
            double cotacao = scanner.nextDouble();

            System.out.println("Digite o valor em dólares: ");
            double valorDolar = scanner.nextDouble();

            double valoremReal = cotacao * valorDolar;
            System.out.println("O valor em reais é de: R$" + valoremReal);

        }

        public static void questao3(){
             
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
            System.out.printf("Total da venda: R$ %.2f\n", totalVenda);
            System.out.printf("Comissão (5%%): R$ %.2f\n", comissao);


        }

        public static void questao4(){
 
            System.out.print("Digite o valor de A: ");
            int A = scanner.nextInt();

            System.out.print("Digite o valor de B: ");
            int B = scanner.nextInt();

            System.out.print("Digite o valor de C: ");
            int C = scanner.nextInt();

            System.out.print("Digite o valor de D: ");
            int D = scanner.nextInt();

            System.out.println("\nResultados das somas e multiplicações:");

            System.out.printf("A + B = %d, A * B = %d\n", A + B, A * B);
            System.out.printf("A + C = %d, A * C = %d\n", A + C, A * C);
            System.out.printf("A + D = %d, A * D = %d\n", A + D, A * D);
            System.out.printf("B + C = %d, B * C = %d\n", B + C, B * C);
            System.out.printf("B + D = %d, B * D = %d\n", B + D, B * D);
            System.out.printf("C + D = %d, C * D = %d\n", C + D, C * D);

            }

        public static void questao5(){
 
            System.out.print("Informe o tempo gasto na viagem (horas): ");
            double tempo = scanner.nextDouble();

            System.out.print("Informe a velocidade média (km/h): ");
            double velocidade = scanner.nextDouble();

            double distancia = tempo * velocidade;

            double litrosUsados = distancia / 12;

            System.out.printf("Velocidade média: %.2f km/h\n", velocidade);
            System.out.printf("Tempo gasto: %.2f horas\n", tempo);
            System.out.printf("Distância percorrida: %.2f km\n", distancia);
            System.out.printf("Litros de combustível usados: %.2f litros\n", litrosUsados);

        }

        public static void questao6(){
 
            System.out.print("Digite a temperatura em graus Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (9 * celsius + 160) / 5;

            System.out.printf("Temperatura em Fahrenheit: %.2f\n", fahrenheit);
            
        }

        
        public static void questao7(){
 
            System.out.print("Digite a temperatura em graus Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.printf("Temperatura em Celsius: %.2f\n", celsius);
            
        }

        public static void questao8(){
 
            System.out.print("Digite o raio da lata (R): ");
            double raio = scanner.nextDouble();

            System.out.print("Digite a altura da lata (A): ");
            double altura = scanner.nextDouble();

            double volume = 3.14159 * raio * raio * altura;

            System.out.printf("O volume da lata de óleo é: %.2f unidades cúbicas\n", volume);

    }

        public static void questao9(){
 
            System.out.print("Digite a idade em anos: ");
            int anos = scanner.nextInt();

            System.out.print("Digite a idade em meses: ");
            int meses = scanner.nextInt();

            System.out.print("Digite a idade em dias: ");
            int dias = scanner.nextInt();

            int idadeEmDias = anos * 365 + meses * 30 + dias;

            System.out.println("A idade da pessoa em dias é: " + idadeEmDias);

        }

        
        public static void questao10(){
 
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Relacionamentos entre os números:");

            if (num1 == num2) {
                System.out.println("Igual");
            } else {
                System.out.println("Não igual");
            }

            if (num1 > num2) {
                System.out.println("Maior");
            }

            if (num1 < num2) {
                System.out.println("Menor");
            }

            if (num1 >= num2) {
                System.out.println("Maior ou igual");
            }

            if (num1 <= num2) {
                System.out.println("Menor ou igual");
            }

        }

        public static void main(String[] args){
            questao1();
            questao2();
            questao3();
            questao4();
            questao5();
            questao6();
            questao7();
            questao8();
            questao9();
            questao10();

            scanner.close();
        }
}
