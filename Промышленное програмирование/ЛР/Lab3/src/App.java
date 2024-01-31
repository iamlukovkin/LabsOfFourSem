public class App {
    public static void main(String[] args) 
    {
        task1();    
    }

    public static void task1() {
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

        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Patient
            (
                surnames[i], names[i], lastnames[i],
                addresses[i], phones[i], medCards[i], diagnoses[i]
            );
        }
        
        String requiredDiagnosis = "ОРВИ";
        System.out.println("Пациенты с диагнозом " + requiredDiagnosis + ":\n");

        for (Patient patient : patients) {
            if (patient.get_Diagnosis().equals(requiredDiagnosis)) 
                System.out.println(patient.toString());
        }

        System.out.println("\nПациенты с номером медицинской карты в диапазоне от 20000 до 40000:\n");

        for (Patient patient : patients) {
            int medCard = patient.get_MedCard();
            if (medCard >= 20000 && medCard <= 40000) 
                System.out.println(patient.toString());
        }
    }
}
