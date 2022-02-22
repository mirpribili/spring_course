package com.raw.black_belt.nbb004_nested_classes.inner_class;



public class Nbb28InnerClassCar {
    String color;
    int doorCount;
    Engine engine;

    public Nbb28InnerClassCar(String color, int doorCount/*,  int horsePower*/) {
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public class Engine{
        private int horsePower;

        public Engine(int horsePower){
            System.out.println(doorCount); // !!!!!!!!
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Main{
    public static void main(String[] args) {
        Nbb28InnerClassCar car = new Nbb28InnerClassCar("black", 2);

        Nbb28InnerClassCar.Engine engine = car.new Engine(100);

        car.setEngine(engine);
        System.out.println(car);
        Nbb28InnerClassCar.Engine engine2 = new Nbb28InnerClassCar("yellow", 4).new Engine(1);
    }
}
