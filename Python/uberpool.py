from car import Car

class UberPool(Car):
    brand = str
    model = str

    def __init__(self, driver, license, brand, model):
        super.__init__(license, driver)
        self.brand = brand
        self.model = model