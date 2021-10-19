package com.company;

public class Question1 {
    public static void main(String[] args) {
        Shape shape1 = new Shape("Shape1", "pink");
        System.out.println("shape1");
        System.out.println(shape1.printShape());
        Shape shape2 = new Shape("Shape2", "orange", 20, 30);
        System.out.println("shape2");
        System.out.println("area : " + shape2.getArea() + " perimeter : " + shape2.getPerimeter());
        System.out.println(shape2.printShape());
        Rectangle rectangle1 = new Rectangle(2);
        System.out.println("rectangle1");
        System.out.println("area : " + rectangle1.getArea() + " perimeter : " + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle("Rectangle", "Purple", 4, 7);
        System.out.println("rectangle2");
        System.out.println("area : " + rectangle2.getArea() + " perimeter : " + rectangle2.getPerimeter());
        System.out.println(rectangle2.printShape());
        Square square1 = new Square(3);
        System.out.println("square1");
        System.out.println("area : " + square1.getArea() + " perimeter : " + square1.getPerimeter());
        Square square2 = new Square("Square", "black", 7);
        System.out.println("square2");
        System.out.println("area : " + square2.getArea() + " perimeter : " + square2.getPerimeter());
        System.out.println(square2.printShape());
    }



    public class Shape{
        public String name;
        public String color;
        public int area;
        public int perimeter;

        //constructors
        public Shape(String name,String color,int perimeter,int area){
            this.name=name;
            this.color=color;
            this.perimeter=perimeter;
            this.area=area;
        }
        public Shape(String name,String color){
            this.name=name;
            this.color=color;
        }
        public String printShape(){

            return "The "+name+" has a "+color+" color";
        }
        public int getArea(){
            return area;

        }
        public int getPerimeter(){
            return perimeter;
        }


    }
    public static class Rectangle extends Shape{  //rectangle inherit shape

        int width;
        int height;
        int side;
        public Rectangle(int width,int height){
            super();
            this.width=width;
            this.height=height;
        }
        public Rectangle(int side){
            super();
            this.side=side;
        }
        public Rectangle(String name,String color,int width,int height){
            super(name, color,width,height);
            this.name=name;
            this.color=color;
            this.width=width;
            this.height=height;
        }
        public void set(int side){
            this.width=side;
            this.height=side;

        }
        public String printShape(){

            return "The "+name+" has a "+color+" color";
        }
        public int getArea(){
            area=width*height;
            return area;

        }
        public int getPerimeter(){
            perimeter=2*(width+height);
            return perimeter;
        }

    }

    public static class Square extends Shape{  //square inherit shape
        int side;
        int width;
        int height;
        public Square(int side){
            super();
            this.width=side;
            this.height=side;
            this.side=side;
        }
        public Square(String name,String color,int side){
            super();
            this.name=name;
            this.color=color;
            this.side=side;
        }
        public void set(int side){
            this.width=side;
            this.height=side;

        }
        public String printShape(){

            return "The "+name+" has a "+color+" color";
        }
        public int getArea(){
            area=width*height;
            return area;

        }
        public int getPerimeter(){
            perimeter=2*(width+height);
            return perimeter;
        }
    }
}

