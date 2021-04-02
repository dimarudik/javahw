public class Ticket {

    public static void main(String[] args) {

        // Или заданее странное, или я его не так понял

        for (int i = 200000; i <= 215000; i++) {
            if (i <= 210000) System.out.print(i + " ");
            System.out.println(i + 20000);
        }

        int i = 0;
        while (i <= 215000) {
            if (i <= 210000) System.out.print(i + " ");
            System.out.println(i + 20000);
            i++;
        }

    }
}
