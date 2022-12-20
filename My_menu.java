package JAVA_OOP.seminar1;

import java.util.ArrayList;
import java.util.Scanner;

public class My_menu {
 
    public void h2h_community(ArrayList<Human> humans) {
        Human human = new Human();
        Scanner scan = new Scanner(System.in); 
        int n1 = 1;
        int n2 = 1;  
        while (n1!=0||n2!=0){
            System.out.println();
            for (Human item : humans) System.out.println(item.toString());

            System.out.print("\nВведите ID исследуемого человека (0-exit): ");
            n1 = scan.nextInt();
            if (n1==0) break;
            System.out.print("Введите ID для установления степени родства (0-exit): ");
            n2 = scan.nextInt();
            if (n2==0) break;
            System.out.println("\n"+human.getHuman_id(n1, humans).toString());
            System.out.println(human.getHuman_id(n1, humans).
            getFamilyType(human.getHuman_id(n2, humans))+" для");
            System.out.println(human.getHuman_id(n2, humans).toString());}}

    public void getHuman_info_id(ArrayList<Human> humans) {

        Human human = new Human();
        Scanner scan = new Scanner(System.in);
        int id;
        System.out.print("\nВведите ID объекта для получения полной информации : ");
        id = scan.nextInt();
        human = human.getHuman_id(id, humans);
        System.out.println("\nИсследуется объект : "+human.toString()+"\n");
    
        for (Human item : humans) {
        if (!item.equals(human)&&
        !item.getFamilyType(human).equals("Не является генетическим родственником."))    
            System.out.println(item.getFamilyType(human)+ " : "+item.toString());}
    }

    public int main_menu() {
        Scanner scan = new Scanner(System.in); 
        int sel;
        System.out.println("\n1. Вывести краткий список.");
        System.out.println("2. Вывести подробный список.");
        System.out.println("3. Вывести тип родственной связи между объектами.");
        System.out.println("4. Добавить объект.");
        System.out.println("5. Вывести подробную информацию об объекте по ID.");
        System.out.println("6. Завершить.");
        System.out.print("Выберите пункт меню (1-6) : ");
        sel = scan.nextInt();
        if(sel==6) scan.close();
        return sel;} 
    
    public static Human Add_menu(int max_id) {
        Human human = new Human();
        Scanner scan = new Scanner(System.in);
        System.out.println("Создается новый объект с ID "+(max_id+1)+" : ");
        human.setId(max_id+1);
        System.out.print("Введите имя : ");
        String first_name = scan.nextLine(); human.setFirst_name(first_name);
        System.out.print("Введите фамилию : ");
        String last_name = scan.nextLine(); human.setLast_name(last_name);
        System.out.print("Введите год рождения : ");
        int birth_year = scan.nextInt(); human.setBirth_year(birth_year);
        System.out.print("Введите пол (1-мужской/0-женский): ");
        boolean man = true;
        int m = scan.nextInt(); 
        if (m==1) human.setMan(man);
        else human.setMan(!man);
        System.out.print("Введите ID отца (0 - отсутствует) : ");
        int id_father = scan.nextInt(); human.setId_father(id_father);
        System.out.print("Введите ID матери (0 - отсутствует) : ");
        int id_mother = scan.nextInt(); human.setId_mother(id_mother);
        System.out.print("Введите ID cупруга/супруги (0 - отсутствует) : ");
        int id_married= scan.nextInt(); human.setId_married(id_married);        
        return human;}

}
