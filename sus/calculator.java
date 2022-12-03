package sus;
import java.util.Scanner;

public class calculator 
{
public static void main(String[] args) {
Scanner calc = new Scanner(System.in);
System.out.println("Введите 1 число");
int number1 = calc.nextInt();
System.out.println("Введите 2 число");
int number2 = calc.nextInt();

int result = number1 + number2;

System.out.println("Результат " + result);
}
}
