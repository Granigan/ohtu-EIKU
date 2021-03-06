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
        System.out.println("adding ");
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

    @Override
    public Item findOne(int id) {
        for (Item i: items) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    @Override
    public boolean update(Item i) {
        // Replaces the previous item - could also be set to replace parameters
        
        for (Item item: items) {
            if (item.getId() == i.getId()) {
                items.remove(item);
                items.add(i);
                return true;
            }
        }
        return false;
    }

}