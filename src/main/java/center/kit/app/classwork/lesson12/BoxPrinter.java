package center.kit.app.classwork.lesson12;

class BoxPrinter<T> {

    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";

    }

    public T getValue() {
        return val;
    }
}