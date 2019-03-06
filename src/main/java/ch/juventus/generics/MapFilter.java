package ch.juventus.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFilter {

    /**
     * Variante, bei der die übergebene Map manipuliert wird.
     *
     * Durch das Iterieren mit Iterator können Elemente der Map während der Iteration entfernt werden.
     *
     * <b>Bad practice</b>, da die übergebene Map manipuliert wird.
     *
     * @param mapToFilter
     * @param value
     * @param <K>
     * @param <V>
     * @return
     */
    public <K, V> Map<K, V> filterWithIteratorOnArgument(Map<K, V> mapToFilter, V value) {
        Iterator<Map.Entry<K, V>> iterator = mapToFilter.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> next = iterator.next();
            if (next.getValue().equals(value)) {
                iterator.remove();
            }
        }
        return mapToFilter;
    }

    /**
     * Variante mit for-loop, bei der passende Elemente in einer neuen Map gesammelt werden.
     * @param mapToFilter
     * @param value
     * @param <K>
     * @param <V>
     * @return
     */
    public <K, V> Map<K, V> filterWithForLoop(Map<K, V> mapToFilter, V value) {
        Map<K, V> resultMap = new HashMap<>();
        for (Map.Entry<K, V> entry : mapToFilter.entrySet()) {
            if (!entry.getValue().equals(value)) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
        }
        return resultMap;
    }

    /**
     * Java 8 - Variante mit Stream, filter und collect
     * @param mapToFilter
     * @param value
     * @param <K>
     * @param <V>
     * @return
     */
    public <K, V> Map<K, V> filterWithLambdas(Map<K, V> mapToFilter, V value) {
        return mapToFilter.entrySet().stream()
            .filter(e -> !e.getValue().equals(value))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
