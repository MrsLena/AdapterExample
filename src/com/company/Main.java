package com.company;
//package patterns.srtuctural;

public class Main {

    public static void main(String[] args) {
        CarService MyCarService = new CarService();
        MyCarService.ServiceCar(new Hyundai());
        MyCarService.ServiceCar(new Kia());
        MyCarService.ServiceCar(new TruckAdapt(new TruckVolvo()));

    }
}




    interface Truck {
        void ServiceTruck();
    }

    class TruckAdapt implements Car {
        Truck truck;

        public TruckAdapt(Truck truck) {
            this.truck = truck;
        }

        @Override
        public void Service() {
            truck.ServiceTruck();
        }
    }

    class TruckVolvo implements Truck {
        @Override
        public void ServiceTruck() {
            System.out.println("Service Truck Volvo");
        }
    }

    interface Car {
        void Service();
    }

    class Hyundai implements Car {
        @Override
        public void Service() {
            System.out.println("Service Hyundai");
        }
    }

    class Kia implements Car {
        @Override
        public void Service() {
            System.out.println("Service Kia");
        }
    }

    class CarService {
        public void ServiceCar(Car car) {
         car.Service();
        }
    }


