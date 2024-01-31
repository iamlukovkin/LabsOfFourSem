package lab;

import java.util.Scanner;

/*Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
Создать массив объектов. Вывести:
a) список пациентов, имеющих данный диагноз;
b) список пациентов, номер медицинской карты которых находится в заданном интервале.
 */
public class Patient {
    private int id;
    private String Фамилия;
    private String Имя;
    private String Отчество;
    private String Адресс;
    private String Телефон;
    private int НомерКарты;
    private String Диагноз;

    Patient(int n, String LastName, String FirstName, int num, String diagnoz){
        id = n;
        Фамилия = LastName;
        Имя = FirstName;
        НомерКарты = num;
        Диагноз = diagnoz;
    }
    Patient(int n, String LastName, String FirstName, int num){
        id = n;
        Фамилия = LastName;
        Имя = FirstName;
        НомерКарты = num;
    }
    public void displayInfo() {
        System.out.printf("id: %d \tИмя: %s \tФамилия: %s\t Номер Карты: %s \tДиагноз: %s\n", id, Имя, Фамилия, НомерКарты, Диагноз);
    }

    public static void Diagnoz(){

    }

}
