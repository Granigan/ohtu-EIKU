package linkkivinkki.dao;

import java.util.ArrayList;
import java.util.List;

import linkkivinkki.domain.Item;

public class InMemoryDao implements Dao {

    private List<Item> items;

    public InMemoryDao() {
        items = new ArrayList<Item>();
    }

    @Override
    public boolean add(Item i) {
        return items.add(i);
    }

    @Override
    public boolean delete(int id) {
        return true;
    }

    @Override
    public List<Item> findAll() {
        return items;
    }

    public Item findOne(int id) {
        return items.get(id);
    }

    public boolean update(Item i) {
        // Replaces the previous item - could also be set to replace parameters
        items.set(i.getId(), i);
        return true;
    }

}