//принимает обобщенный тип <T> и предоставляет метод для генерации объекта типа <T>
public interface Sample<T> {
    T createSample();
}