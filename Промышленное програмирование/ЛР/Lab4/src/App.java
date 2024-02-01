import Statement.Area;
import Statement.City;
import Statement.Region;
import Statement.State;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        task1();
    }

    public static void task1()
    {
        // Создать объект класса Государство, используя классы Область, Район, Город. 
        State state = new State("Россия");

        state.setRegions(new Region[] {
            
            new Region("ЦФО", new Area[] {
            
                new Area("Московская область", new City[] {
            
                    new City("Москва", 1000, true),
                    new City("Люберцы", 100),
                    new City("Мытищи", 100)

                }),

                new Area("Ленинградская область", new City[] {
                    
                    new City("Санкт-Петербург", 1000),
                    new City("Всеволожск", 100),
                    new City("Сланцы", 100)

                }),

                new Area("Рязанская область", new City[] {

                    new City("Рязань", 500),
                    new City("Рыбное", 100),
                    new City("Михайлов", 100)
                })
            }, true),

            new Region("СФО", new Area[] {
                
                new Area("Самарская область", new City[] {
                    
                    new City("Самара", 1000),
                    new City("Сызрань", 100),
                    new City("Тольятти", 100)
                }),

                new Area("Саратовская область", new City[] {
                    
                    new City("Саратов", 1000),
                    new City("Армавир", 100),
                })
            }),

            new Region("УФО", new Area[] {
                
                new Area("Ульяновская область", new City[] {
                    
                    new City("Ульяновск", 1000),
                    new City("Улан-Удэ", 400),
                    new City("Иваново", 100)
                
                })
            }),

            new Region("СЗФО", new Area[] {
                
                new Area("Республика Татарстан", new City[] {
                    
                    new City("Казань", 1000),
                    new City("Нижнекамск", 100),
                    new City("Новосибирск", 100)
                })
            }, true)
        });

        // Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
        System.out.println("Столица государства " + state.getName() + ": " + state.getCapital().getInfo());
        System.out.println("Количество областей: " + state.getRegionsCount());
        System.out.println("Площадь: " + state.getSquare() + " км2");
        System.out.println("Областные центры:");
        for (Region region : state.getRegions())
            if (region.getIsPrimary())
                System.out.println(region.getName() + ": " + region.getSquare() + " км2");
    }
}
