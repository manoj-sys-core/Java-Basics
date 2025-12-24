package DAY10;
import java.io.*;

public class Files {
    public static void main(String[] args) throws Exception{
        File fc =new File("data.txt");
        fc.createNewFile();
        System.out.println("Name: "+fc.getName());
        System.out.println("Exists: "+fc.exists());
        System.out.println("Path: "+fc.getAbsolutePath());
        FileWriter fw = new FileWriter("data.txt",true);
        fw.write("Hello World!!");
        fw.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt",true));
        bw.newLine();
        bw.write("Manoj S");
        bw.newLine();
        bw.write("Wassup ");
        bw.close();
        BufferedReader bb = new BufferedReader(new FileReader("data.txt"));
        String l;
        while ((l = bb.readLine()) != null){
            System.out.println(l);
        }
    }
}
