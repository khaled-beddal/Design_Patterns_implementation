package Bridge_example_02_TP3_EX02;


public class main {

    
    public static void main(String[] args) {
            
            Device tv = new TV();
            Device dvd = new Dvd();
            Device radios = new Radios();
            
            UniversalRemote universalremotecontrol = new UniversalRemoteControl();

            universalremotecontrol.device = tv;
            universalremotecontrol.turnOn();
            universalremotecontrol.turnOff();
            universalremotecontrol.volUp();
            universalremotecontrol.volDown();
              System.out.println("----------------------------------\n");
            universalremotecontrol.device = dvd;
            universalremotecontrol.turnOn();
            universalremotecontrol.turnOff();
            universalremotecontrol.volUp();
            universalremotecontrol.volDown();
              System.out.println("----------------------------------\n");
            universalremotecontrol.device = radios;
            universalremotecontrol.turnOn();
            universalremotecontrol.turnOff();
            universalremotecontrol.volUp();
            universalremotecontrol.volDown();

    }
}

