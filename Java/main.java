class Main {
    public static void main(String[] args) {
        System.out.println("-----Instanciando mi primera clase-----");
        Car car = new Car("AMQ123", new Account("Andrés Herrera", "AND123")); //Se pone el tipo de clase "Car", luego el nombre del objeto "car", se usa la palabra reservada "new" para asignar su espacio en memoria y finalmente se aplica el método constructor.
        
        //Puedo hacer uso de los atributos que declaré en la clase, de la siguiente manera:
        //car.license = "AMQ123";
        //car.driver = "Andrés Herrera";
        car.passenger = 8;

        //Ahora quiero imprimir los resultados
        System.out.println("Driver's license: " + car.license + " Driver: " + car.driver.name);

        //Segunda instancia que hará uso del método .printDataCar definido en Car.java
        System.out.println("----Segunda Instancia----");
        Car car2 = new Car("OHL345", new Account("Andrea Herrera","AND456"));
        //car2.license = "OHL345";
        //car2.driver = "Andrea Herrera";
        car2.passenger = 8;
        car2.printDataCar();
    }
}