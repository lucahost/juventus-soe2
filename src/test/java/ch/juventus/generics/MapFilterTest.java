package ch.juventus.generics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapFilterTest {

    private Map<Integer, String> mapToFilter = new HashMap<>();

    @BeforeEach
    void prepareMap() {
        mapToFilter = new HashMap<>(4);
        mapToFilter.put(1001, "Horse");
        mapToFilter.put(1002, "Bird");
        mapToFilter.put(1003, "Dog");
        mapToFilter.put(1004, "Elephant");
    }


    @Test
    void filterWithIteratorOnArgument() {
        MapFilter mf = new MapFilter();
        Map<Integer, String> filteredMap = mf.filterWithIteratorOnArgument(mapToFilter, "Bird");
        assertEquals(3, filteredMap.size());
        assertFalse(filteredMap.containsValue("Bird"));
    }

    @Test
    void filterWithForLoop() {
        MapFilter mf = new MapFilter();
        Map<Integer, String> filteredMap = mf.filterWithForLoop(mapToFilter, "Bird");
        assertEquals(3, filteredMap.size());
        assertFalse(filteredMap.containsValue("Bird"));
    }

    @Test
    void filterWithLambdas() {
        MapFilter mf = new MapFilter();
        Map<Integer, String> filteredMap = mf.filterWithLambdas(mapToFilter, "Bird");
        assertEquals(3, filteredMap.size());
        assertFalse(filteredMap.containsValue("Bird"));
    }
}
