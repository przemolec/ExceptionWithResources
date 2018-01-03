import java.io.*;

public class Java7Exeption2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Can find file");
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
    }
}
