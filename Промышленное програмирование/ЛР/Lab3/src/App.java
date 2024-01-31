public class App 
{
    public static void main(String[] args) 
    {
        task1();    
        task2();
    }

    /**
     * Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз. 
     * Создать массив объектов. Вывести: 
     * a) список пациентов, имеющих данный диагноз; 
     * b) список пациентов, номер медицинской карты которых находится в заданном интервале. 
     */
    public static void task1() 
    {
        Patient[] patients = new Patient[10];
        String[] surnames = {
            "Иванов", "Петров", "Сидоров", "Кузнецов", "Смирнов", 
            "Васильев", "Попов", "Соколов", "Михайлов", "Николаев"
        };
        String[] names = {
            "Иван", "Петр", "Сидор", "Кузьма", "Семен",
            "Василий", "Павел", "Сергей", "Михаил", "Никита"
        };
        String[] lastnames = {
            "Иванов", "Петров", "Сидоров", "Кузнецов", "Смирнов",
            "Васильев", "Попов", "Соколов", "Михайлов", "Николаев"
        };
        String[] addresses = {
            "Иваново", "Петрово", "Сидорово", "Кузнецово", "Смирново",
            "Васильево", "Попово", "Соколово", "Михайлово", "Николаево"
        };
        int[] phones = {
            111111, 222222, 333333, 444444, 555555,
            666666, 777777, 888888, 999999, 000000
        };
        int[] medCards = {
            11111, 22222, 33333, 44444, 55555,
            66666, 77777, 88888, 99999, 00000
        };
        String[] diagnoses = {
            "ОРВИ", "Грипп", "Туберкулез", "Гастрит", "Гастрит",
            "Коронавирус", "ОРВИ", "Грипп", "Туберкулез", "Гастрит"
        };

        for (int i = 0; i < patients.length; i++) 
        {
            patients[i] = new Patient
            (
                surnames[i], names[i], lastnames[i],
                addresses[i], phones[i], medCards[i], diagnoses[i]
            );
        }
        
        String requiredDiagnosis = "ОРВИ";
        System.out.println("Пациенты с диагнозом " + requiredDiagnosis + ":\n");

        for (Patient patient : patients) 
        {
            if (patient.get_Diagnosis().equals(requiredDiagnosis)) 
                System.out.println(patient.toString());
        }

        System.out.println("\nПациенты с номером медицинской карты в диапазоне от 20000 до 40000:\n");

        for (Patient patient : patients) 
        {
            int medCard = patient.get_MedCard();
            if (medCard >= 20000 && medCard <= 40000) 
                System.out.println(patient.toString());
        }
    }
    
    /**
     * Определить класс Полином степени n. 
     * Объявить массив/список/множество из m полиномов и определить сумму полиномов массива. 
     */
    public static void task2()
    {
        Polynom p1 = new Polynom(3, new int[] {1, 2, 3, 4});
        Polynom p2 = new Polynom(2, new int[] {1, 2, 3});
        Polynom p3 = new Polynom(1, new int[] {1, 2});
        
        Polynom[] polynoms = {p1, p2, p3};
        Polynom sum = Polynom.sumPolynomals(polynoms);

        System.out.println("Сумма полиномов: " + sum.toString());
    }
}
