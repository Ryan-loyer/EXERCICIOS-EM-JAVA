//NOME: PABLO RYAN LOPES VIEIRA
//MATRICULA: 2024010361
//TURMA: PEX0130
//REPOSITORIO: https://github.com/Ryan-loyer/EXERCICIOS-EM-JAVA


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

        public static void questao11(){
            
            System.out.print("Digite o valor de A: ");
            int A = scanner.nextInt();

            System.out.print("Digite o valor de B: ");
            int B = scanner.nextInt();

            System.out.println("Antes da troca: A = " + A + ", B = " + B);
            
            A = A + B;
            B = A - B;
            A = A - B;

            System.out.println("Depois da troca: A = " + A + ", B = " + B);
        }

        public static void questao12(){

            System.out.println("Digite um número inteiro: ");
            int num = scanner.nextInt();

            int modulo;
            if (num >= 0){
                modulo = num;
            }
            else{
                modulo = num * -1;
            }

            System.out.println("O módulo do número é: " + modulo);
        }

        public static void questao13(){
        
            System.out.print("Digite o número 1: ");
            int n1 = scanner.nextInt();

            System.out.print("Digite o número 2: ");
            int n2 = scanner.nextInt();

            System.out.print("Digite o número 3: ");
            int n3 = scanner.nextInt();

            System.out.print("Digite o número 4: ");
            int n4 = scanner.nextInt();

            System.out.print("Digite o número 5: ");
            int n5 = scanner.nextInt();

            int temp;
    
            int[] nums = {n1, n2, n3, n4, n5}; 
            
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4 - i; j++) {
                    if (nums[j] > nums[j + 1]) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }

            System.out.print("Ordem crescente: ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.print("Ordem decrescente: ");
            for (int i = 4; i >= 0; i--) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            }

        public static void questao14(){
            
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int diferenca;
            if (num1 >= num2) {
                diferenca = num1 - num2;
            } else {
                diferenca = num2 - num1;
            }

            System.out.println("A diferença do maior para o menor é: " + diferenca);
        }

        public static void questao15(){

            System.out.println("Digite as 4 notas do aluno:");

            double somaNotas = 0;

            for (int i = 1; i <= 4; i++) {
                System.out.print("Nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / 4.0;
            System.out.printf("Média: %.2f\n", media);

            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.print("Digite a nota da recuperação: ");
                double recuperacao = scanner.nextDouble();

                double novaMedia = (media + recuperacao) / 2.0;
                System.out.printf("Nova média: %.2f\n", novaMedia);

                if (novaMedia >= 7) {
                    System.out.println("Aluno aprovado na recuperação!");
                } else {
                    System.out.println("Aluno reprovado!");
                }
            }    
        }

        public static void questao16(){
            
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            if (num1 == num2) {
                System.out.println("Os números são iguais: " + num1);
            } else if (num1 > num2) {
                System.out.println("Maior número: " + num1);
                System.out.println("Menor número: " + num2);
            } else {
                System.out.println("Maior número: " + num2);
                System.out.println("Menor número: " + num1);
            }

        }

        public static void questao17(){

            System.out.print("Digite um número inteiro: ");
            int valor = scanner.nextInt();

            if (valor >= 0 && valor <= 9) {
                System.out.println("valor válido");
            } else if (valor < 0 || valor > 9) {
                System.out.println("valor inválido");
            } else {
                System.out.println("erro");
            }
        }

        public static void questao18(){
            System.out.print("Digite o código (1, 2 ou 3): ");
            int codigo = scanner.nextInt();

            switch (codigo) {
                case 1:
                    System.out.println("um");
                    break;
                case 2:
                    System.out.println("dois");
                    break;
                case 3:
                    System.out.println("três");
                    break;
                default:
                    System.out.println("Código inválido");
                    break;
            }
        }

        public static void questao19(){
            System.out.print("Digite o lado A: ");
            double A = scanner.nextDouble();

            System.out.print("Digite o lado B: ");
            double B = scanner.nextDouble();

            System.out.print("Digite o lado C: ");
            double C = scanner.nextDouble();

            // Verifica se os lados formam um triângulo
            if (A < B + C && B < A + C && C < A + B) {
                // Classifica o triângulo
                if (A == B && B == C) {
                    System.out.println("Triângulo equilátero");
                } else if (A == B || A == C || B == C) {
                    System.out.println("Triângulo isósceles");
                } else {
                    System.out.println("Triângulo escaleno");
                }
            } else {
            System.out.println("Os lados fornecidos não formam um triângulo");
            }
        }

        public static void questao20(){
                int a, b, c;

            do {
                System.out.print("Digite o valor para a (maior que zero): ");
                a = scanner.nextInt();
                if (a <= 0) System.out.println("Valor inválido. Deve ser maior que zero.");
            } while (a <= 0);

            do {
                System.out.print("Digite o valor para b (maior que zero): ");
                b = scanner.nextInt();
                if (b <= 0) System.out.println("Valor inválido. Deve ser maior que zero.");
            } while (b <= 0);

            do {
                System.out.print("Digite o valor para c (maior que zero): ");
                c = scanner.nextInt();
                if (c <= 0) System.out.println("Valor inválido. Deve ser maior que zero.");
            } while (c <= 0);

            int maior = a;
            if (b > maior) maior = b;
            if (c > maior) maior = c;

            int menor = a;
            if (b < menor) menor = b;
            if (c < menor) menor = c;

            int multiplicacao = menor * maior;
            double divisao = (double) maior / menor;

            System.out.println("Menor valor multiplicado pelo maior: " + multiplicacao);
            System.out.println("Maior valor dividido pelo menor: " + divisao);

        }

        public static void questao21(){
            
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();

            if (num >= 0) {
                System.out.println("Número positivo");
            } else {
                System.out.println("Número negativo");
            }
        }

        public static void questao22(){
            
            int A = 0, B = 0;

            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (num >= 0) {
                A = num;
            } else {
                B = num;
            }

            System.out.println("A = " + A + ", B = " + B);
        }

        public static void main(String[] args){
            //questao1();
            //questao2();
            //questao3();
            //questao4();
            //questao5();
            //questao6();
            //questao7();
            //questao8();
            //questao9();
            //questao10();
            //questao11();
            //questao12();
            //questao13();
            //questao14();
            //questao15();
            //questao16();
            //questao17();
            //questao18();
            //questao19();
            //questao20();
            //questao21();
              questao22();

            scanner.close();
        }
}

//NOME: PABLO RYAN LOPES VIEIRA
//MATRICULA: 2024010361
//TURMA: PEX0130
//REPOSITORIO: https://github.com/Ryan-loyer/EXERCICIOS-EM-JAVA