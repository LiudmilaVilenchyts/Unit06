package Task1;

public class CounterDemo {
    public static void main(String[] args) {
        Counter res = new Counter(56, 77,77);
        System.out.println("Увеличиваем значение счетчика на 1: " + res.increaseCount());
        System.out.println("Уменьшаем значение счетчика на 1: " + res.decreaseCount());
        System.out.println("Текущее значение счетчика: " + res.getCount());
        System.out.println("Минимальный предел диапазона счетчика: " + res.getMinLimit());
        System.out.println("Максимальный предел диапазина счетчика: " + res.getMaxLimit());

    }
}
