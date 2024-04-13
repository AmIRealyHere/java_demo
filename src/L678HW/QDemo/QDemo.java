package L678HW.QDemo;

import Practice.Queue;

public class QDemo {
    public static void main(String[] args) {
        Practice.Queue bigQ = new Practice.Queue(100);
        Practice.Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Using bigQ to store alphabet");
// Поместить буквенные символы в очередь ЬigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));
// Извлечь буквенные символы из очереди ЬigQ и отобразить
        System.out.print("Contents of Queue ЬigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Using Queue  " +
                "to demonstrate errors");
// Использовать очередь smallQ для генерации ошибок
        for (i = 0; i < 5; i++) {
            System.out.print("Attempting to store " +
                    (char) ('Z' - i));
        smallQ.put((char) ('Z' - i));
        System.out.println();
    }
            System.out.println();
// Дополнительные ошибки при обращении к очереди smallQ
            System.out.print("Contents of smallQ: ");
            for (i = 0; i < 5; i++) {
                ch = smallQ.get();
                if (ch != (char) 0) System.out.print(ch);
            }
        }
    }