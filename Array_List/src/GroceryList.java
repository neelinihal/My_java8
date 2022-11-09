
import java.util.ArrayList;

public class GroceryList {
   private ArrayList<String> groceryList = new ArrayList<>();

   public void addGroceryItem(String item){
       groceryList.add(item);
   }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGrocery(){
       System.out.println("you have "+groceryList.size()+" items in your groseryList");
       for (int i = 0; i < groceryList.size(); i++) {
           System.out.println(i+1+" ."+groceryList.get(i) );
       }
   }

   public void modifyGroceryItem(String currentItem,String newItem){
       int position = findItem(currentItem);
       if (position>=0) {
           modifyGroceryItem(position,newItem);
       }
   }

   private void modifyGroceryItem(int position, String newItem){
       groceryList.set(position,newItem);
       System.out.println("Grocery item "+(position+1)+" has been modified ");
   }

   public void removeGroceryItem(String currentItem){
       int position = findItem(currentItem);
       if ( position>= 0) {
           removeGroceryItem(position);
       }
   }

   private void removeGroceryItem(int position){
       groceryList.remove(position);
   }

//   public int findItem(String searchItem){
//       boolean exists = groceryList.contains(searchItem);
//       int position = groceryList.indexOf(searchItem);
//       if (position >= 0) {
//           return groceryList.get(position);
//       }
//       return null;
//   }


public int findItem(String searchItem) {
    return groceryList.indexOf(searchItem);
    }
}
