function Car(license, driver) {
    this.id;
    this.licencse = license;
    this.driver = driver;
    this.passenger;
}
Car.prototype.printDataCar =  function () {
     console.log(this.license)
     console.log(this.driver.name)
     console.log(this.driver.document)
}