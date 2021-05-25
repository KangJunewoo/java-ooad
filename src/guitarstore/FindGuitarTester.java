package guitarstore;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatCustomerLike = new Guitar(
                "", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
        Guitar guitar = inventory.search(whatCustomerLike);

        if (guitar != null) {
            System.out.println("찾았다~~");
        } else {
            System.out.println("못찾았다 ㅜㅜ.");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        System.out.println("기타인벤토리 초기화");
    }
}
