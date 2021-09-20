package wildlifeDao;

import models.EndangeredAnimals;

import java.util.HashMap;
import java.util.List;

public interface Dao {
    List<EndangeredAnimals> findAll();
    void add(EndangeredAnimals endangeredAnimals);
    EndangeredAnimals findById(int id);
    void update(String newEndangered, int id);
    void deleteAll();
    void deleteById(int id);
}
