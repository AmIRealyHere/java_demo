package Bro;

public class CarCopyObject {
        private String make;
        private String model;
        private int year;

    CarCopyObject(String make, String model, int year){
            this.setMake(make);
            this.setModel(model);
            this.setYear(year);

        }
        CarCopyObject(CarCopyObject x){
        this.copy(x);

        }

        public String getMake(){
            return make;
        }
        public String getModel(){
            return model;
        }
        public int getYear(){
            return year;
        }

        public void setMake(String make){
            this.make = make;
        }
        public void setModel(String model){
            this.model = model;
        }
        public void setYear(int year){
            this.year = year;
        }

        public void copy(CarCopyObject x){
            this.setMake(x.getMake());
            this.setModel(x.getModel());
            this.setYear(x.getYear());
        }
    }

