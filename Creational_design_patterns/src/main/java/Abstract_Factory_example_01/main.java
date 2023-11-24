package Abstract_Factory_example_01;

import Abstract_Factory_example_01.Form.Factory.AbstractFactory;
import Abstract_Factory_example_01.Form.Factory.MacFactory;
import Abstract_Factory_example_01.Form.Factory.WindowsFactory;

public class main {
    public static void main(String[] args) {
        
        Application application = new Application();
        AbstractFactory factory = null;
        String os = "MAC";

        if (os.equals("MAC")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }

        application.run(factory);

    }
}
