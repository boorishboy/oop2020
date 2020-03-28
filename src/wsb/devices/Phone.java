package wsb.devices;

import wsb.Human;

public class Phone extends Device {
    final Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
        super(producer,model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("phone is turned on");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {

    }
}
