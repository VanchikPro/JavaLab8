import java.util.List;
//поиск максимальной кинетической энергии используя статический метод findMax
public class GenericUtils {
    public static <T extends Comparable<T>> T findMax(List<T> items) {
        T max = items.getFirst();
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
