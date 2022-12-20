package JAVA_OOP.seminar1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tree implements Serializable, Iterable<Human>{
    private int max_id;
    private ArrayList<Human> humans = new ArrayList<>();
    private Writeable writeable; 

// public Tree_class(int inp_max_id, ArrayList<Human> inp_humans){
//     this.max_id = inp_max_id;
//     this.humans = inp_humans;}

public Tree new_read() throws FileNotFoundException, 
                            ClassNotFoundException, IOException { 
    return writeable.new_read();}

public void new_save() throws FileNotFoundException, IOException {
    writeable.new_save(this);}

public void setWriteable(Writeable writeable) {
        this.writeable = writeable;}

public void create_tree() {
    for (Human item : this) item.find_parents(this.getHumans());
    for (Human item : this) item.find_married(this.getHumans());
    for (Human item : this) item.find_childrens(this.getHumans());}

public void add_human() throws FileNotFoundException, IOException {
    this.humans.add(My_menu.Add_menu(this.max_id));
    this.setMax_id(++this.max_id);
    this.create_tree();}

// public void getHuman_info_id() {
   
//     Human human = new Human();
//     Scanner scan = new Scanner(System.in);
//     int id;
//     System.out.print("\nВведите ID объекта для получения полной информации : ");
//     id = scan.nextInt();
//     human = human.getHuman_id(id, this.getHumans());
//     System.out.println("\nИсследуется объект : "+human.toString()+"\n");

//     for (Human item : this) {
//     if (!item.equals(human)&&
//     !item.getFamilyType(human).equals("Не является генетическим родственником."))    
//         System.out.println(item.getFamilyType(human)+ " : "+item.toString());}
    
//     }
        
    public ArrayList<Human> getHumans() {
        return humans;}
        
    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;}
    
    public int getMax_id() {
        return max_id;}
    public void setMax_id(int max_id) {
        this.max_id = max_id;}

    @Override
    public Iterator<Human> iterator() {
        return new Tree_Iterator(humans);}
}
