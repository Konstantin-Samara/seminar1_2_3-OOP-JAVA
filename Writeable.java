package JAVA_OOP.seminar1;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Writeable {
    void new_save(Tree my_tree) throws FileNotFoundException, IOException;
    Tree new_read() throws FileNotFoundException, IOException, ClassNotFoundException;}
