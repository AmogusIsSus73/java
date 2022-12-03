package sus;
import java.util.Arrays;
import java.util.Scanner;

public class amogus 
{
	public static void main(String[] args) {
		int a = 9,b= 3, c=6, d=a%c;	
		String name1 = "Hello ", name2 = "World ", name3= a + "city", code="10", name4="CAPSLOCK", name7="capslock";
		float f = 4.5f;
		b = a + b;
		b = b * c;
		b--;
		b--;
		c = a / 3;
		int name5 = Integer.parseInt(code + 4) ;
		int count1 = name1.length(),count2 = (name1 + 12).length();
		String name6 = name4.toLowerCase(), name8 = name7.toUpperCase() ;
		System.out.println(f);//Число с плавающей точкой
		System.out.println(name8);//Большие символы
		System.out.println(name6);//Маленькие символы
		System.out.println(count1);//подсчет символов
		System.out.println(count2);//подсчет символов
		System.out.println(((b + a) * c)+d + name5); 
		System.out.println(name1 + name2 + b + name3);
		
		int [] mass = new int [10];//Массивы
		mass[0] = 5;
		mass[1] = mass[0] + 5;
		mass[2] = mass[1] + 5;
		System.out.println(Arrays.toString(mass));
		
		for (int i = 0 ;i < 237; i = i+2 ) { //Упражнение на вывод цикла четных чисел
			System.out.println(i);
		};

		Scanner console = new Scanner(System.in);//ввод
		String name = console.nextLine();
		int age = console.nextInt();
		System.out.println("Имя: " + name);
		System.out.println("Возраст:" + age);


	}
	
}
