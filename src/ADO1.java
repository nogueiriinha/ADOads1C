import java.util.Scanner;

public class ADO1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nInsira o Valor do produto:\n");
        float vcompra = leia.nextFloat();
        float vtotal,vdesc,descmaior,descmenor;
        descmaior = (float) 0.20;
        descmenor = (float) 0.15;

        if((vcompra >= 300)){
            vdesc = vcompra * descmaior;
            vtotal = vcompra - vdesc;
            System.out.printf("\nValor do Produto: R$ %.2f",vcompra);
            System.out.printf("\nValor do Desconto: R$ %.2f",vdesc);
            System.out.printf("\nValor Total: R$ %.2f\n",vtotal);
        }else{
            vdesc = vcompra * descmenor;
            vtotal = vcompra - vdesc;
            System.out.printf("\nValor do Produto: R$ %.2f",vcompra);
            System.out.printf("\nValor do Desconto: R$ %.2f",vdesc);
            System.out.printf("\nValor Total: R$ %.2f\n",vtotal);
        }
        leia.close();
        
    }
}
