package org.example.task_one;

import java.util.ArrayList;
import java.util.List;

public class ArraySurfer {
    List<Object> array = new ArrayList<>();

    public List<Object> arrayAdd(Object value) {
        array.add(value);
        return array;
    }

    public List<Object> arrayDelete(int ID) {
        array.remove(ID);
        return array;
    }

    public List<Object> arrayReplace(Object value, int ID) {
        array.set(ID, value);
        return array;
    }
}
