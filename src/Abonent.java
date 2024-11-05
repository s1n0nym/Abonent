class Abonent {
    private String idNumber;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int totalCallTime;
    private String creditCardNumber;
    private double debit;

    public Abonent(String idNumber, String surname, String name, String patronymic, String address,
                   int totalCallTime, String creditCardNumber, double debit) {
        this.idNumber = idNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.totalCallTime = totalCallTime;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
    }

    public Abonent(String idNumber, String surname, String name, String address) {
        this(idNumber, surname, name, null, address, 0, null, 0);
    }

    public void setAttributes(String idNumber, String surname, String name, String patronymic, String address,
                              int totalCallTime, String creditCardNumber, double debit) {
        this.idNumber = idNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.totalCallTime = totalCallTime;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
    }

    public String getAttributes() {
        return "ID: " + idNumber + ", Фамилия: " + surname + ", Имя: " + name +
                ", Отчество: " + patronymic + ", Адрес: " + address +
                ", Общее время разговора: " + totalCallTime + " минут, " +
                "Номер кредитной карточки: " + creditCardNumber + ", Дебет: " + debit;
    }

    public int getTotalCallTime() {
        return totalCallTime;
    }
}