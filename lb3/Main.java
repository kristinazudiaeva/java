public class Main {
    public static void main(String[] args) {
        HashTable<String, Contact> phoneBook = new HashTable<>();

        System.out.println("Телефонная книга пуста: " + phoneBook.isEmpty());

        Contact contact1 = new Contact("Иван Догов", "Ivan.dogov243@yandex.ru", "Дополнительная информация 1");
        phoneBook.put("89774903856", contact1);

        System.out.println("Количество контактов в телефонной книге: " + phoneBook.size());

        Contact contact2 = new Contact("Катя Семенова", "Katesemen009@mail.com", "Дополнительная информация 2");
        phoneBook.put("89264320992", contact2);

        System.out.println("Количество контактов в телефонной книге: " + phoneBook.size());

        System.out.println("Информация о контакте с номером телефона 89264320992: " + phoneBook.getValue("89264320992"));

        phoneBook.remoteKey("89774903856");
        System.out.println("Количество контактов в телефонной книге: " + phoneBook.size());
        System.out.println("Информация о контакте с номером телефона 89774903856: " + phoneBook.getValue("89774903856"));
    }
}
