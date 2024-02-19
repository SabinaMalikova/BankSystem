public class Account {
    private double balance;
    private int pin_code;



    public Account() {
    }
    public Account(double balance, int pin_code) {
        this.balance = balance;
        this.pin_code = pin_code;
    }



    public double checkBalance() {
        return balance;
    }

    public void deposit(double amountOfCash) {
        if (amountOfCash > 0) {
            balance = balance + amountOfCash;
            System.out.println("Ваша операция успешно произведена! \n" +
                    "Ваш баланс составляет: " + balance + '$');
        } else {
            System.out.println("Введите правильное значение! ");
        }
    }

    public void withdrawal(double amountOfCash) {
        if (amountOfCash > 0) {
            if (amountOfCash < balance) {
                balance = balance - amountOfCash;
                System.out.println("Ваша операция успешно произведена! \n" +
                        "Ваш баланс составляет: " + balance + '$');
            } else {
                System.out.println("На вашем счету недостаточно средств! ");
            }
        } else {
            System.out.println("Введите правильные значения!");
        }
    }

    public void transaction(double amountOfCash, Account otherAkk) {
        if (amountOfCash > 0) {
            if (balance >= amountOfCash) {
                balance = balance - amountOfCash;
                System.out.println("Ваша операция успешно произведена! \n" +
                        "Ваш баланс составляет: " + balance + '$');
            } else {
                System.out.println("Недостатосно средств на счете!");
            }
        } else {
            System.out.println("Введите правильное значение!");
        }
    }
}
