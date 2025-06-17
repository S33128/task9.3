import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "Mlotek"));
        items.add(new Item(2, "Wiertarka"));
        items.add(new Item(3, "Wkretarka"));
        items.add(new Item(4, "Srubokret"));
        items.add(new Item(5, "Lopata"));

        for (int i=0; i<items.size(); i++) {
            items.get(i).show();
        }
        HashMap<Integer, String> map = new HashMap<>();
        for (Item item : items) {
            map.put(item.id, item.name);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("ID: "+entry.getKey()+ ", Name: "+entry.getValue());
        }
    }
}