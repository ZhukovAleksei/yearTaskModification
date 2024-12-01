import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год в формате уууу");
        int year = sc.nextInt();
        if(year % 400 == 0){
            System.out.println("Количество дней 366");
        }else if(year % 100 == 0){
            System.out.println("Количесвто дней 365");
        }else if(year % 4 == 0){
            System.out.println("Количество дней 366");
        }else{
            System.out.println("Количесвто дней 365");
        }

    }
}