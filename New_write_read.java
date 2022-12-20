package JAVA_OOP.seminar1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class New_write_read implements Writeable, Serializable{   

    public void new_save(Tree my_tree) throws FileNotFoundException, IOException {
        ObjectOutputStream objectOutputStream = 
        new ObjectOutputStream(new FileOutputStream("humans.out"));
        objectOutputStream.writeObject(my_tree);
        objectOutputStream.close();}

    public Tree new_read() throws FileNotFoundException, IOException, ClassNotFoundException {
        Tree my_tree = new Tree();
        ObjectInputStream objectInputStream = 
        new ObjectInputStream(new FileInputStream("humans.out"));
        my_tree = (Tree) objectInputStream.readObject();
        objectInputStream.close();
        return my_tree;}
}
