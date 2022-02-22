package com.raw.black_belt.nbb004_nested_classes.static_nested_class;

public class Nbb27StaticClassCar {
    String color;
    int doorCount;
    Engine engine;
    public void method(){
        Nbb27StaticClassCar.Engine engine = new Engine(11);
        System.out.println(engine.horsePower);
    }

    public Nbb27StaticClassCar(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
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
    public static class Engine{
        private int horsePower;

        public Engine(int horsePower){
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
        Nbb27StaticClassCar.Engine engine = new Nbb27StaticClassCar.Engine(256);
        System.out.println(engine);
        Nbb27StaticClassCar car = new Nbb27StaticClassCar("red", 4, engine);
        //System.out.println(engine.horsePower); // not work((
    }
}