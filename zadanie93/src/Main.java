import java.util.*;

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
        //zadanie 3
        System.out.println("poczatek zadania 3");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i <=10; i++){
            items.add(new Item(i, "item"+i));
        }
        List<Item> sublist = items.subList(0, 10);
        HashSet<Item> itemset = new HashSet<>(sublist);

        for (Item item : sublist) {
            item.show();
        }
    }
}