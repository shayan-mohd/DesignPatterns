package StructuralDesignPattern.Decorator;

class ToyCar implements Car {
        @Override
        public void assemble() {
            System.out.println("Toy Car");
        }
    }