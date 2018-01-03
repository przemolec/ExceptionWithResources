import java.io.File;

class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing");
    }
}

public class Java7Exception {
    public static void main(String[] args) {

        try(Temp temp = new Temp()){

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
