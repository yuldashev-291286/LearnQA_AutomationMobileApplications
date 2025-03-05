public class MainClass {

    // В классе MainClass сделать метод, который возвращает число 14 (назвать: getLocalNumber).
    public int getLocalNumber(){

        return 14;
    }


    // Сделать в классе MainClass приватное поле класса, которое равно 20 (назвать: class_number).
    private int class_number = 20;

    // Сделать в классе MainClass публичный метод (getClassNumber), который эту переменную возвращает class_number.
    public int getClassNumber() {

        return this.class_number;
    }


    // Сделать в классе MainClass приватное поле класса, которое равно строке “Hello, world” (назвать: class_string).
    private String class_string = "Hello, world";

    // Сделать в классе MainClass публичный метод (назвать: getClassString), который возвращает строку class_string.
    public String getClassString(){

        return this.class_string;

    }



}
