package Practice;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
/* Доступ к переменной alpha возможен только с помощью
специально предназначенных для этой цели методов. */
        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());
// Обратиться к переменной alpha так, как показано ниже, нельзя
// ob.alpha = 10; // Ошибка: alpha - закрытая переменная! .

// Следующие обращения вполне допустимы, так как
// переменные beta и gamma являются открытыми
                ob. beta = 88;
        ob.gamma = 99;
    }
}
