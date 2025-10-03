import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader {
    InputStreamReader inputStreamReader;
    BufferedReader reader;
    public Reader(InputStream input) {
        inputStreamReader = new InputStreamReader(input);
        reader = new BufferedReader(inputStreamReader);
    }
    public Reader() {
        inputStreamReader = new InputStreamReader(System.in);
        reader = new BufferedReader(inputStreamReader);
    }
    public String readLine() {
        try {
            return reader.readLine();
        } catch(Exception error) {
            throw new Error("IO exception" + error.getMessage().toString());
        }
        
    }
}
