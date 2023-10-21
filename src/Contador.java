import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner param1 = new Scanner(System.in);
        Scanner param2 = new Scanner(System.in);
        System.out.println("Informe o Primeiro valor: ");
        int num1 = param1.nextInt();
        System.out.println("Informe o Segundo valor: ");
        int num2 = param2.nextInt();
        param1.close();
        param2.close();
        System.out.println(num1);
        System.out.println(num2);
        try {
            contador(num1,num2);
        }catch (ParametrosInvalidosException e){
            e.printStackTrace();
        }
    }

    static void contador(int param1, int param2) throws ParametrosInvalidosException{


        if(param1 < param2 || param1 < 0 || param2 < 0) {
            throw new ParametrosInvalidosException("Parametro devem ser maior que 0, e segundo parametro deve ser maior que o primeiro");
        }
        int result = param1 - param2;

        for(int i = result; i> 0; i--){
            System.out.println("Imprimindo o numero: "+i);
        }


    }
}
