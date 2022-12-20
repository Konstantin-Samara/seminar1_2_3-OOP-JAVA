package JAVA_OOP.seminar1;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Tree my_tree = new Tree();
        My_menu my_menu = new My_menu();
        int sel = 0;       

        // ArrayList<Human> humans = new ArrayList<>();
        // My_write_read.my_read(humans);
        // my_tree.setHumans(humans);
        // my_tree.setMax_id(10);
        // System.out.println("\n\n\nmax ID : "+ my_tree.getMax_id()); 

        my_tree.setWriteable(new New_write_read());
        my_tree = my_tree.new_read();
        my_tree.create_tree();

        while (sel!=6) {
        sel = my_menu.main_menu();
        switch (sel) {
            case 1: System.out.println(); 
                    my_tree.getHumans().sort(new Human_Comparator_Name());
                    for (Human item : my_tree) System.out.println(item.toString());
                    break; 
            case 2: System.out.println();
                    my_tree.getHumans().sort(new Human_Comparator_Birth_year());
                    for (Human item : my_tree) item.toString_1(); 
                    break;
            case 3: my_menu.h2h_community(my_tree.getHumans());
                    break;
            case 4: my_tree.add_human(); 
                    break;
            case 5: my_menu.getHuman_info_id(my_tree.getHumans());
                    break;
            case 6: break;}}
        my_tree.new_save();

        // My_write_read.my_write(my_tree.getHumans());
}
    
}
