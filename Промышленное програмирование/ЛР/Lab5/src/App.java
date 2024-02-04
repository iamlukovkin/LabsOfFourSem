import vehicles.*;
import  engine.Vehicle;

/**
 * Средство передвижения. 
 * Возможности: получить или изменить различную информацию о средстве передвижения: 
 * регистрационный номер, марка, модель, VIN-номер, владелец, тип движущей силы; 
 * заправить\отремонтировать\обслужить; пройти техосмотр. 
 * Добавить дополнительные возможности для автомобиля, велосипеда, самоката, мотоцикла, квадроцикла. 
 */
public class App
{
    public static void main(String[] args)
    {
        Auto bmw = new Auto("эв245м", "BMW", "X8", "LALALA101", "Бастрычкин А.С.", "V8 Engine");
        Bicycle yamahaBike = new Bicycle("ве245л", "Yamaha", "BMX", "OAOAO05", "Бекренев В.О.", "Педали");
        Motorcycle toyotaBike = new Motorcycle("wo999w", "Toyota", "awesomeBike", "404", "Устюков Д.И.", "powerEngine");
        Quadrocycle quadrocycle = new Quadrocycle("he101h", "Suzuki", "Quadro", "004", "Иванов И.И.", "V2 Engine");
        Scooter scooter = new Scooter("le001h", "Xiaomi", "Scooter", "002", "Петров П.П.", "Electric");
        performActions(bmw);
        performActions(yamahaBike);
        performActions(toyotaBike);
        performActions(quadrocycle);
        performActions(scooter);
    }

    private static void performActions(Vehicle vehicle) {
        vehicle.jetFuel();
        vehicle.makeService();
        vehicle.uniqueAction();
        if (vehicle instanceof Bicycle) {
            vehicle.makeRepair();
        } else if (vehicle instanceof Motorcycle) {
            vehicle.makeReview();
        }
        System.out.println("\n");
    }
}
