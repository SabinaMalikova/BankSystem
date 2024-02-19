import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*      Account деген класс тузунуз ,анын сөзсүз double
        balance деген полясы болот жана сиз  каалагандай
        поле кошсонуз болот
        checkBalance -  балансты текшеруу,
                deposit() - баланска акча кошот ,
        withdrawal() - баланстан акча алат
        transaction() - бир account тан экинчи account ка акча
        которуу методору болсун. */

        Scanner scanner = new Scanner(System.in);

        Account account1 = new Account(0,1111);
        Account account2 = new Account();


        int pin;
        do {
            System.out.print("Введите свой пин-код: ");
            pin = scanner.nextInt();
            if (pin == 1111) {
                System.out.println("Вы спешно зашли в аккаунт! ");
            }
        } while (pin != 1111);

        while (true) {
            System.out.println("""
                     Возможные дествия с счетом:                    
                                    1 - Проверка баланса 
                                    2 - Вненсение депозита 
                                    3 - Снятие средств 
                                    4 - Перевод средств на другой счет
                                    5 - Выйти из системы""");
            System.out.println("Введите номер действия: ");
            int yourChoice = scanner.nextInt();

            switch (yourChoice) {
                case 1:
                    System.out.println("Ваш баланс состовляет: " + account1.checkBalance() + '$');
                    break;
                case 2:
                    System.out.println("Введите сумму для депозита: ");
                    double deposite = scanner.nextInt();
                    account1.deposit(deposite);
                    break;
                case 3:
                    System.out.println("Введите сумму для снятия средств: ");
                    double withdrawal = scanner.nextInt();
                    account1.withdrawal(withdrawal);
                    break;
                case 4:
                    System.out.println("Введите сумму для перевода на другой счет: ");
                    int transaction = scanner.nextInt();
                    account1.transaction(transaction, account2);
                    break;
                case 5:
                    System.out.println("Хорошего вам дня! ");
                    return;
                default:
                    System.out.println("Неправильный выбор, поробуйте снова ");
            }
        }
    }
}