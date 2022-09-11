import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList<>();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    earnings = 0;
    // Initialize itemList as a new ArrayList
    itemList = new ArrayList<Item>();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if(index >= (itemList.size() - 1) || index < 0) {
        System.out.printf("There are only %d items in the store\n\n", itemList.size());
        return;
    }
    // get Item at index from itemList and add its cost to earnings
    earnings += itemList.get(index).getCost();
    // print statement indicating the sale
    System.out.printf("Purchase Statement\n%s : %.2f\n\n", itemList.get(index).getName(), itemList.get(index).getCost());
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    boolean inStock = false;
    int itemIndex = 0;
    for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getName().equals(name)) {
            inStock = true;
            itemIndex = i;
            break;
        }
    }
    if (!inStock) {
      System.out.printf("The store does not sell %s\n\n", name);
      return;
    }
    // get Item from itemList and add its cost to getEarnings
    earnings += itemList.get(itemIndex).getCost();
    // print statement indicating the sale
    System.out.printf("Purchase Statement\n%s : %.2f\n\n", itemList.get(itemIndex).getName(), itemList.get(itemIndex).getCost());
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    if(!itemList.contains(i)) {
      System.out.printf("The store does not sell that product\n\n");
      return;
    }
    // get Item i from itemList and add its cost to getEarnings
    earnings += itemList.get(itemList.indexOf(i)).getCost();
    // print statement indicating the sale
    System.out.printf("Purchase Statement\n%s : %.2f\n\n", i.getName(), i.getCost());
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("Items with type %s are:\n", type);
    boolean atLeast1 = false;
    for(Item i : itemList) {
      if (i.getType().equals(type)) {
        atLeast1 = true;
        System.out.println(i.getName());
      }
    }
    if (atLeast1) { return; }
    System.out.println("None\n\n");
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("Items with prices less than %s are:\n", maxCost);
    boolean atLeast1 = false;
    for(Item i : itemList) {
      if (i.getCost() <= maxCost) {
        atLeast1 = true;
        System.out.println(i.getName());
      }
    }
    if (atLeast1) { return; }
    System.out.println("None\n\n");
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("Items with prices more than %s are:\n", minCost);
    boolean atLeast1 = false;
    for(Item i : itemList) {
      if (i.getCost() >= minCost) {
        atLeast1 = true;
        System.out.println(i.getName());
      }
    }
    if (atLeast1) { return; }
    System.out.println("None\n\n");
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(Store store : storeList) {
      System.out.printf("%s store earnings: %.2f\n", store.getName(), store.getEarnings());
    }
  }
}
