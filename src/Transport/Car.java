package Transport;

import java.time.LocalDate;

public class Car extends Transport {

    double engineVolume;
    String transmission;
    private String bodyType;
    String registrationNum;
    private int numOfSeat;
    boolean winterTires;
    private Key key;
    private Insurance insurance;


    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(boolean keylessEntry) {
            this.keylessEntry = keylessEntry;
        }
    }

    public class Insurance {
        private int validity;
        private int cost;
        private int number;

        public Insurance(int validity, int cost, int number) {
            if (validity <= 0) {
                this.validity = 2022;
            } else {
                this.validity = validity;
            }
            if (cost <= 0) {
                this.cost = 5000;
            } else {
                this.cost = cost;
            }
            if (number <= 0) {
                this.number = 100000000;
            } else {
                this.number = number;
            }
        }

        @Override
        public String toString() {
            return "validity=" + validity +
                    ", cost=" + cost +
                    ", number=" + number +
                    '}';
        }

        public int getValidity() {
            return validity;
        }

        public void setValidity(int validity) {
            this.validity = validity;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNum, int numOfSeat, int winterTires, int maxSpeed, String typeOfFuel, int quantityOfFuel) {

        super(brand, model, year, country, color, maxSpeed, typeOfFuel, quantityOfFuel);

        this.transmission = ValidateUtil.validateString(transmission);
        this.bodyType = ValidateUtil.validateString(bodyType);
        this.registrationNum = ValidateUtil.validateString(registrationNum);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (numOfSeat < 0) {
            this.numOfSeat = 5;
        } else {
            this.numOfSeat = numOfSeat;
        }
        this.winterTires = winterTires == 1;
    }

    @Override
    public String toString() {
        return "Transport.Transport.Transport.Transport.Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNum='" + registrationNum + '\'' +
                ", numOfSeat=" + numOfSeat + '\'' +
                ", winterTires=" + winterTires + '\'' +
                ", maxSpeed=" + getMaxSpeed() + '\'' +
                ", typeOfFuel=" + getTypeOfFuel() + '\'' +
                ", quantityOfFuel=" + getQuantityOfFuel() + '\'' +
                "Insurance{" +
                getInsurance() +
                '}';
    }

    public void changeTires(int winterTires) {
        if (winterTires > 1 || winterTires < 0) {
            winterTires = 1;
        }
        this.winterTires = winterTires == 1;
    }

    public void checkRegistrationNum() {

        if (this.registrationNum.length() == 9) {
            if (!this.registrationNum.substring(5, 6).matches("[а-я]")) {
                System.out.println("Номер введен неверно");
            } else if (!this.registrationNum.substring(0, 1).matches("[а-я]")) {
                System.out.println("Номер введен неверно");
            } else if (!this.registrationNum.substring(2, 4).matches("[\\d]+")) {
                System.out.println("Номер введен неверно");
            } else if (!this.registrationNum.substring(7, 9).matches("[\\d]+")) {
                System.out.println("Номер введен неверно");
            } else {
                System.out.println("Номер введен верно");
            }
        } else {
            System.out.println("Номер введен неверно");
        }
    }

    public void checkNumInsurance() {
        String tmp = Integer.toString(this.insurance.getNumber());
        if (tmp.length() != 9) {
            System.out.println("Номер страховки введен не корректно");
        } else {
            System.out.println("Номер страховки верный");
        }
    }

    public void checkValidityInsurance() {
        if (this.insurance.getValidity() < LocalDate.now().getYear()) {
            System.out.println("Нужно срочно ехать оформлять новую страховку");
        }
    }

    @Override
    public void reFuel(int quantityOfFuel) {
        setQuantityOfFuel(getQuantityOfFuel() + quantityOfFuel);
    }


}

