import java.util.Scanner;

public class ADO2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("\nVamos descobrir se o ano é bissexto?");
        System.out.println("\nPressione Enter");
        leia.nextLine();
        System.out.println("Insira o ano: ");
        int ano = leia.nextInt();

        if(((ano % 4 == 0) && (ano % 100 != 0)) || ((ano % 100 == 0) && (ano % 400 == 0))){
            System.out.println("\nEste ano é bissexto!");
        }else{
            System.out.println("\nEste ano não é bissexto.");
        }
    leia.close();
    
    }
}
