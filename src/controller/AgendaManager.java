package controller;

import java.util.ArrayList;
import model.AgendaItem;

public class AgendaManager {

    private ArrayList<AgendaItem> listAgenda = new ArrayList<>();

    public void tambahAgenda(AgendaItem item) {
        listAgenda.add(item);
    }

    public void updateAgenda(int index, AgendaItem itemBaru) {
        if (index >= 0 && index < listAgenda.size()) {
            listAgenda.set(index, itemBaru);
        }
    }

    public void hapusAgenda(int index) {
        if (index >= 0 && index < listAgenda.size()) {
            listAgenda.remove(index);
        }
    }

    public ArrayList<AgendaItem> getSemuaAgenda() {
        return listAgenda;
    }
    
    public void clearAll() {
        listAgenda.clear();
    }

}
