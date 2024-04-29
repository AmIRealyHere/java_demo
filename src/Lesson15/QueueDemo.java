package Lesson15;



public class QueueDemo {
        public static void main(String[] args) {
            // Создать пустую очередь для хранения 10 элементов
            Queue q1 = new Queue(10);

            char name[] = {'Т', 'о', 'm'};
// Создать очередь на основе массива
            Queue q2 = new Queue(name);
            char ch;
            int i;
// Поместить ряд символов в очередь q1
            for(i=0; i < 10; i++)
                q1.put ((char) ( 'A' + i));
// Создать одну очередь на основе другой
            Queue q3 = new Queue(q1);
// Показать очереди
            System.out.print("Content of q1: ");
            for (i=0; i < 10; i++) {
                ch = q1.get();
                System.out.print(ch);
            }
            System.out.println("\n");
            System.out.print("Content of q2: ");
            for (i=0; i < 3; i++) {
                ch = q2.get();
                System.out.print(ch);
            }
            System.out.println("\n");

            System.out.print("Content of qЗ: ");
            for (i=0; i < 10; i++) {
                ch = q3.get();
                System.out.print(ch);
            }
        }
    }
