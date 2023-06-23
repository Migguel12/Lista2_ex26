import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a quantidade de litros: ");
        double litros = ler.nextDouble();
        ler.nextLine();
        System.out.println("");

        System.out.print("Informe o tipo de combustivel A(Álcool) ou G(Gasolina): ");
        String combustivel = ler.nextLine();
        System.out.println("");

        ler.close();

        if("G".equalsIgnoreCase(combustivel)){
            if(litros <= 20){
                System.out.printf("O valor total a ser pago é: %2.2f",litros * (2.50 - (2.50 * 0.04) ));
            }
            if(litros > 20){
                System.out.printf("O valor total a ser pago é: %2.2f",litros * (2.50 - (2.50 * 0.06) ));
            }
        }

        if("A".equalsIgnoreCase(combustivel)){
            if(litros <= 20){
                System.out.printf("O valor total a ser pago é: %2.2f",litros * (1.90 - (1.90 * 0.03) ));
            }
            if(litros > 20){
                System.out.printf("O valor total a ser pago é: %2.2f",litros * (1.90 - (1.90 * 0.05) ));
            }
        }
    }
}
