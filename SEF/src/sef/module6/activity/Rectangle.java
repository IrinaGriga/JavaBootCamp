package sef.module6.activity;

public class Rectangle extends Shape {
    private double lenght;
    private double high;

    Rectangle(double lenght, double high) {

        this.lenght = lenght;
        this.high = high;
    }
        public double calculateArea () {
            double area = lenght * high;
            return area;
        }
            public double calculatePerimeter(){
                double perimeter = 2* (lenght + high);
                return perimeter;

            }
        }


