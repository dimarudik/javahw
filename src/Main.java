import java.util.Scanner;

public class Main {
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args) {
        // открываем бесконечный цикл для ввода данных
        while (true) {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt();

            // проверяем, что сумма доходов входит в диапазон minIncome maxIncome
            if (!checkIncomeRange(income)) {
                continue;
            }

            // расчетная сумма ЗП
            double managerSalary = income * managerPercent;
            // расчитываем бюджет
            double pureIncome = income - managerSalary -
                calculateFixedCharges();
            // считаем налоги
            double taxAmount = mainTaxPercent * pureIncome;
            // бюджет после налогов
            double pureIncomeAfterTax = pureIncome - taxAmount;

            // определяем сможем ли инвестировать
            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income) {
        if (income < minIncome) {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges() {
        return officeRentCharge +
            telephonyCharge +
            internetAccessCharge +
            assistantSalary +
            financeManagerSalary;
    }
}
