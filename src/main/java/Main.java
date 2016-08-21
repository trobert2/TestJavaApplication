/**
 * Created by RTingirica on 21.08.2016.
 */
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> "{\"routes\": \"/hello\"}");
        get("/hello", (req, res) -> "{\"message\": \"Hello World\"}");
    }
}
