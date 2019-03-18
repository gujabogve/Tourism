package Repositories;

import java.util.HashMap;
import java.util.Map;

public class CountryRepository {

    private Map<Integer, String> list = new HashMap<>();

    public String find(Integer id) {

        return this.list.get(id);
    }
}
