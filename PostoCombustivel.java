import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Preços por litro
        double precoAlcool = 1.90;
        double precoGasolina = 2.50;
        double desconto = 0;
        double valorSemDesconto, valorComDesconto;

        // Entradas
        System.out.println("=== POSTO DE COMBUSTÍVEL ===");

        System.out.print("Informe o tipo de combustível (A-Álcool, G-Gasolina): ");
        String tipo = input.nextLine().trim().toUpperCase();

        System.out.print("Informe a quantidade de litros vendidos: ");
        double litros = input.nextDouble();

        // Estrutura de decisão
        if (tipo.equals("A")) {
            // Álcool
            if (litros <= 20) {
                desconto = 0.03; // 3%
            } else {
                desconto = 0.05; // 5%
            }

            valorSemDesconto = litros * precoAlcool;
            valorComDesconto = valorSemDesconto - (valorSemDesconto * desconto);

            System.out.println("\n=== NOTA DE COMPRA ===");
            System.out.println("Combustível: Álcool");
            System.out.printf("Quantidade: %.2f litros%n", litros);
            System.out.printf("Preço por litro: R$ %.2f%n", precoAlcool);
            System.out.printf("Desconto aplicado: %.0f%%%n", desconto * 100);
            System.out.printf("Valor total a pagar: R$ %.2f%n", valorComDesconto);

        } else if (tipo.equals("G")) {
            // Gasolina
            if (litros <= 20) {
                desconto = 0.04; // 4%
            } else {
                desconto = 0.06; // 6%
            }

            valorSemDesconto = litros * precoGasolina;
            valorComDesconto = valorSemDesconto - (valorSemDesconto * desconto);

            System.out.println("\n=== NOTA DE COMPRA ===");
            System.out.println("Combustível: Gasolina");
            System.out.printf("Quantidade: %.2f litros%n", litros);
            System.out.printf("Preço por litro: R$ %.2f%n", precoGasolina);
            System.out.printf("Desconto aplicado: %.0f%%%n", desconto * 100);
            System.out.printf("Valor total a pagar: R$ %.2f%n", valorComDesconto);

        } else {
            // Tipo inválido
            System.out.println("Tipo de combustível inválido! Use 'A' para Álcool ou 'G' para Gasolina.");
        }

        input.close();
    }
}
