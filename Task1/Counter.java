package Task1;

//счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
public class Counter {
    private int count;
    private int minLimit;
    private int maxLimit;


    public Counter() {
        minLimit = 3;
        maxLimit = 99;
        count = minLimit;
    }

    public Counter(int _minLimit, int _maxLimit) {
        if (_minLimit >= _maxLimit) {
            throw new RuntimeException("Number beyond counter limits");
        }
        minLimit = _minLimit;
        maxLimit = _maxLimit;
        count = _minLimit;
    }

    public Counter(int _minLimit, int _maxLimit, int initialNumber) {
        if (_minLimit >= _maxLimit) {
            throw new RuntimeException("Number beyond counter limits");
        }
        minLimit = _minLimit;
        maxLimit = _maxLimit;
        count = initialNumber;
    }

    // метод увеличения состояния
    public int increaseCount() {
        if (count == maxLimit) {
            System.out.println("Больше увеличивать низя");
        } else {
            int increase = count++;
        }

        return count;

    }

    // метод уменьшения состояния
    public int decreaseCount() {
        if (count == minLimit) {
            throw new RuntimeException("Дальше не уменьшается");
        }
        count--;
        return count;
    }

    // метод получения текущего состояния
    public int getCount() {
        return count;
    }

    public int getMinLimit() {
        return minLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

}
