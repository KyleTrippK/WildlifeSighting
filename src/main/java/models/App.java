
import spark.ModelAndView;
import java.util.ArrayList;

import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
    }
}
