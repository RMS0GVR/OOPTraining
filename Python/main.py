from car import Car
from account import Account

if __name__ == "__main__":
    print("Instancio mi primer objeto")
    
    car = Car("AMS234", Account("Andrés Herrera","AND234"))
    print(vars(car))
    print(vars(car.driver))
    #car = Car()
    #car.license = "AMS890"
    #car.driver = "Andrés Herrera"
    #print(vars(car)) #A diferencia de Java, acá no debo definir un método especial para imprimir los atributos, solo uso la función print(vars(acá_le_paso_el_objeto_como_parámetro))


