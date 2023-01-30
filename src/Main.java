import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            if (isr.read() != -1) {
                int inter = isr.read();
                int sec = 0;
                if (inter == 13) {
                    sec = inter;
                } else if (inter != 10 && sec != 13) {
                    System.out.println(inter);
                }
            } else if (isr.read() == -1) {
                System.out.flush();
                break;
            }
        }
    }
}

