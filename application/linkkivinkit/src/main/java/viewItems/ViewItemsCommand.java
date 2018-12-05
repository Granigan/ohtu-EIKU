package viewItems;

import java.util.List;
import linkkivinkki.dao.Dao;
import linkkivinkki.domain.Item;
import userInput.Command;

public abstract class ViewItemsCommand implements Command {

    private final Dao dao;

    public ViewItemsCommand(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Item> getItems() {
        return dao.findAll();
    }

}
