package Repositories;

import java.util.HashMap;
import java.util.Map;

public class TypeRepository {
    private Map<Integer, String> list = new HashMap<>();

    public String getType(Integer id) {

        return this.list.get(id);
    }
}
