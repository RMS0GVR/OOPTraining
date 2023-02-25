from car import Car

if __name__ == "__main__":
    print("Instancio mi primer objeto")
    car = Car()
    car.license = "AMS890"
    car.driver = "Andrés Herrera"
    print(vars(car)) #A diferencia de Java, acá no debo definir un método especial para imprimir los atributos, solo uso la función print(vars(acá_le_paso_el_objeto_como_parámetro))


