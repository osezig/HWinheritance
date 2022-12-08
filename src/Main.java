import Animal.*;
import Transport.Bus;
import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada ", " Granta ", 1.7,
                " Желтый ", 2015, " Россия", "Механическая",
                "Седан", "ю123юю123", 5, 0, 180, " бензин ",0);
        Car audi = new Car("Audi ", " A8 ", 3.0,
                " Черный ", 2020, " Германия", "Автоматическая",
                "Купе", "а3а88кр123", 2, 1, 240,"бензин",0);
        Car bmw = new Car("BMW ", " Z8 ", 3.0,
                " Черный ", 2021, " Германия", "Автоматическая",
                "Купе", "щ123456", 2, 1, 240, "бензин",0);
        Car kia = new Car("KIA ", " Sportage ", 2.4,
                " Красный ", 2018, " Южная Корея", "Автоматическая",
                "Кроссовер", "в123вв123", 5, 0, 200, "бензин",0);
        Car hyundai = new Car("Hyundai ", " Avante ", 1.6,
                " Оранжевый ", 2016, " Южная Корея", "Механическая",
                "Седан", "ш123шш123", 5, 1, 180, "бензин",0);

        System.out.println(audi);
        kia.checkRegistrationNum();
        audi.checkRegistrationNum();
        audi.setInsurance(audi.new Insurance(2021, 330000, 331854894));
        lada.setInsurance(lada.new Insurance(2022, 20000, 44536872));
        bmw.setInsurance(bmw.new Insurance(2021, 50000, 2317548));
        kia.setInsurance(kia.new Insurance(2020, 8000, 931954));
        hyundai.setInsurance(hyundai.new Insurance(2021, 40000, 999999999));

        audi.checkValidityInsurance();
        lada.checkValidityInsurance();
        bmw.checkValidityInsurance();
        kia.checkValidityInsurance();
        audi.checkValidityInsurance();

        lada.checkNumInsurance();
        System.out.println(audi);

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия",
                "Зеленый", 301, 3500, 30, "Белорусский вокзал",
                "Минск-Пасажирский", 11, "дизель", 0);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                "Зеленый", 270, 1700, 15, "Ленинградского вокзала",
                "Ленинград-Пассажирский", 8, "дизель", 0);
        System.out.printf(lastochka + "\n" + leningrad + "\n");

        Bus busOne = new Bus("busOne", "A1", 2015, "Россия",
                "Белый", 120, "дизель", 0);
        Bus busTwo = new Bus("busTwo", "B2", 2012, "Россия",
                "Синий", 120, "бензин", 0);
        Bus busThree = new Bus("busThree", "C3", 2013, "Россия",
                "Белый", 110, "бензин", 0);
        System.out.printf(busOne + "\n" + busTwo + "\n" + busThree + "\n");

        System.out.println(hyundai);
        hyundai.reFuel(20);
        System.out.println(hyundai);

        busThree.reFuel(50);
        System.out.println(busThree);

        lastochka.reFuel(500);
        System.out.println(lastochka);

        Herbivores gazel = new Herbivores("Газель", 2, "Африка", 60);
        Herbivores zhiraf = new Herbivores("Жираф", 3, "Африка", 40);
        Herbivores horse = new Herbivores("Лошадь", 3, "Степи", 50);
        Predators giena = new Predators("Гиена", 5, "Африка", 20);
        Predators tiger = new Predators("Тигр", 2, "Дальний восток", 40);
        Predators bear = new Predators("Медведь", 6, "Леса", 40);
        Amphibians laygushka = new Amphibians("Лягушка", 1, "Водоемы");
        Amphibians uzh = new Amphibians("Уж пресноводный", 3, "Водоемы");
        Flightless pavlin = new Flightless("Павлин", 2, "Тропики", "Ходит");
        Flightless pingvin = new Flightless("Пингвин", 2, "Антарктида", "Ходит");
        Flightless dodo = new Flightless("Птица Додо", 2, "Озера", "Ходит");
        Flying chaika = new Flying("Чайка", 3, "Берег водоемов", "Летает");
        Flying albatros = new Flying("Альбатрос", 6, "Берег водоемов", "Летает");
        Flying sokol = new Flying("Сокол", 3, "Горы", "Летает");

        System.out.println(gazel.equals(zhiraf));
        System.out.printf(gazel + " " + gazel.getClass() + "\n" +
                zhiraf + " " + zhiraf.getClass()+ "\n" +
                horse + " " + horse.getClass()+ "\n" +
                giena + " " + giena.getClass()+ "\n" +
                tiger + " " + tiger.getClass()+ "\n" +
                bear + " " + bear.getClass()+ "\n" +
                laygushka + " " + laygushka.getClass()+ "\n" +
                uzh + " " + uzh.getClass()+ "\n" +
                pavlin + " " + pavlin.getClass()+ "\n" +
                pingvin + " " + pingvin.getClass()+ "\n" +
                dodo + " " + dodo.getClass()+ "\n" +
                chaika + " " + chaika.getClass()+ "\n" +
                albatros + " " + albatros.getClass()+ "\n" +
                sokol + " " + sokol.getClass()+ "\n"
        );
    }
}