import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите преобразовать температуру из цельсия в фаренгейта? Тогда нажмите 1, а если хотите из фаренгейта в цельсия - нажмите 2!");
        int num = scanner.nextInt();
        System.out.println("Введите температуру");
        float temperature = scanner.nextFloat();
        double f = 0;
        if(num == 1){
            f = temperature * 1.8 + 32;
            System.out.println(f);
        }
        else if(num == 2){
            f = (temperature - 32) / 1.8;
            System.out.println(f);


        }
        else{
            System.out.println("Вы ввели неправильное число! Повторите попытку, если вы ошиблись!");
        }








    }

}
