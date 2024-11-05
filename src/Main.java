public class Main {
    public static void main(String[] args) {
        Abonent[] abonents = new Abonent[]{
                new Abonent("1", "Иванов", "Иван", "Иванович", "Москва, ул. Пушкина, д. 1", 120, "1234-5678-9012-3456", 0),
                new Abonent("2", "Петров", "Петр", "Петрович", "Санкт-Петербург, ул. Ленина, д. 2", 80, "2345-6789-0123-4567", 50),
                new Abonent("3", "Сидоров", "Сидор", "Сидорович", "Екатеринбург, ул. Чехова, д. 3", 150, "3456-7890-1234-5678", 20),
                new Abonent("4", "Кузнецов", "Алексей", "Алексеевич", "Казань, ул. Горького, д. 4", 60, "4567-8901-2345-6789", 0),
        };

        printAbonentsWithLongCalls(abonents, 100);
    }

    public static void printAbonentsWithLongCalls(Abonent[] abonents, int minCallTime) {
        for (Abonent abonent : abonents) {
            if (abonent.getTotalCallTime() > minCallTime) {
                System.out.println(abonent.getAttributes());
            }
        }
    }
}