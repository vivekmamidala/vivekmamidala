import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {
    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Test t = new Test();
        FileOutputStream fos = new FileOutputStream("test.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(t);
        }
        FileInputStream fis = new FileInputStream("test.txt");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            Test t1 = (Test)ois.readObject();
            System.out.println(t1.i + "," + t1.j);
        }
    }
    
}
