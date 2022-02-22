package com.raw.black_belt.nbb004_nested_classes.local_inner_class;

public class Nbb29LocalInnerClass {
    public static void main(String[] args) {
        Nbb29LocalInnerClass nbb29LocalInnerClass = new Nbb29LocalInnerClass();
        nbb29LocalInnerClass.getResults();
    }
    public void getResults(){
        final int delimoe = 21;
        class Delenie{
//            private int delimoe;//divisible;
            private int delitel;//divider;

            public int getDelimoe() {
                return delimoe;
            }

//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }
//
//            public int getDelitel() {
//                return delitel;
//            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }
        }
        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}
