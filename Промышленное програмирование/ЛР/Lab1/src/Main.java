public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:\n");
        Values randomValues = new Values();
        randomValues.setRandomValues();
        Values.printValuesWithoutNewLine(randomValues.getValues());
        Values.printValuesWithNewLine(randomValues.getValues());

        System.out.println("Задание 2:\n");
        Values userValues = new Values();
        userValues.inputValues();
        userValues.printValuesDivisibleBy5And7();
    }
}