class Car{
    Integer id;
    String license;
    Account driver; //Cambiamos de tipo String a Account para reutilizar la variable que hereda del módulo Account
    Integer passenger;

    //Vamos a formar el método constructor de tal forma que siempre requiera de unos parámetros para poder usarlo y crear el objeto
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;

    }

    //Defino un método que me permita imprimir de una los resultados
    void printDataCar() {
        System.out.println("License: " + license + " Driver's Name: " + driver.name);
    }
}