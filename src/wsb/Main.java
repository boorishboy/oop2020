package wsb;

import wsb.creatures.Animal;
import wsb.creatures.FarmAnimal;
import wsb.creatures.Pet;
import wsb.devices.Car;
import wsb.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog = new Pet("dog");
        dog.name = "Reksio";

        Phone iphone = new Phone("Apple", "Xr", 6.1);

        Human me = new Human();
        me.firstName = "Wojciech";
        me.lastName = "Chamski";
        me.pet = dog;
        me.mobile = iphone;
        me.cash = 1000.0;

        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        Car dirtyOne = new Car("ford", "fiesta", 1996, 1.1);
        dirtyOne.plates = "GDA6666";
        me.car = dirtyOne;

        System.out.println(me.car.producer + " " + me.car.model + " " + me.car.plates);

        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Object);

        me.feed();
        me.pet.feed();

        iphone.turnOn();
        dirtyOne.turnOn();

        iphone.sell();
        me.pet.sell();

        Human wife = new Human();
        wife.firstName = "Natalia";
        wife.lastName = "Chamska";
        wife.car = dirtyOne;

        System.out.println(me.car);
        System.out.println(wife.car);
        System.out.println(me);

        Human brother = new Human();
        brother.firstName = "Seba";
        brother.cash = 300.0;
        me.car.sell(brother, me, 100.0);

        FarmAnimal chicken = new FarmAnimal("chiken");

    }
}
