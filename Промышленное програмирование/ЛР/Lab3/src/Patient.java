/*Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
Создать массив объектов. Вывести:
a) список пациентов, имеющих данный диагноз;
b) список пациентов, номер медицинской карты которых находится в заданном интервале.
 */
public class Patient
{
    private static int _AllId; //Общее количество пациентов
    
    private int _Id;
    private String _Surname;
    private String _Name;
    private String _LastName;
    private String _Address;
    private int _Phone;
    private int _MedCard;
    private String _Diagnosis;

    public Patient(String Surname, String Name, String LastName, String Address, int Phone, int MedCard, String Diagnosis) 
    {
        _AllId++; // Автоинкремент
        
        _Id = _AllId;
        _Surname = Surname;
        _Name = Name;
        _LastName = LastName;
        _Address = Address;
        _Phone = Phone;
        _MedCard = MedCard;
        _Diagnosis = Diagnosis;
    }

    public Patient(String Surname, String Name, String LastName)
    {
        _AllId++; // Автоинкремент
        
        _Id = _AllId;
        _Surname = Surname;
        _Name = Name;
        _LastName = LastName;
        _Address = "";
        _Phone = 0;
        _MedCard = 0;
        _Diagnosis = "";
    }

    public String toString()
    {
        String stringInfo = "\nId: " + _Id + "\n";
        stringInfo += "Фамилия: " + _Surname + "\n";
        stringInfo += "Имя: " + _Name + "\n";
        stringInfo += "Отчество: " + _LastName + "\n";
        stringInfo += "Адрес: " + _Address + "\n";
        stringInfo += "Телефон: " + _Phone + "\n";
        stringInfo += "Номер медицинской карты: " + _MedCard + "\n";
        stringInfo += "Диагноз: " + _Diagnosis + "\n";
        return stringInfo;
    }

    public int get_Id() { return _Id; }
    public static void set_Id(int Id) { _AllId = Id; }
    
    public String get_Surname() { return _Surname; }
    public void set_Surname(String Surname) { _Surname = Surname; }
    
    public String get_Name() { return _Name; }
    public void set_Name(String Name) { _Name = Name; }
    
    public String get_LastName() { return _LastName; }
    public void set_LastName(String LastName) { _LastName = LastName; }

    public String get_Address() { return _Address; }
    public void set_Address(String Address) { _Address = Address; }

    public int get_Phone() { return _Phone; }
    public void set_Phone(int Phone) { _Phone = Phone; }

    public int get_MedCard() { return _MedCard; }
    public void set_MedCard(int MedCard) { _MedCard = MedCard; }
    
    public String get_Diagnosis() { return _Diagnosis; }
    public void set_Diagnosis(String Diagnosis) { _Diagnosis = Diagnosis; }
}
