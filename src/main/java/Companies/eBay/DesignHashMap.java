package Companies.eBay;

public class DesignHashMap {

    int[] map = new int[1000001];
    public DesignHashMap() {

    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        //   System.out.println(map[key]);
        if(map[key] != -1)
            return map[key];
        else
            return -1;

    }

    public void remove(int key) {
        if(map[key] != -1)
            map[key] = -1;
    }

    public static void main(String[] args){
        DesignHashMap designHashMap = new DesignHashMap();
        designHashMap.put(4, 2);
        designHashMap.put(3, -1);
        designHashMap.put(1, 9);
        designHashMap.put(1, 10);
        System.out.println("designHashMap value ="+designHashMap.get(3));
    }
}
