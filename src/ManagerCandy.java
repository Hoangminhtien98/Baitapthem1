import java.security.PublicKey;
import java.util.ArrayList;

public class ManagerCandy {
    ArrayList<Candy> candyList;

    public ManagerCandy() {
        candyList = new ArrayList<>();
    }
    public void displayAllCandyList(){
        for (Candy candy : candyList){
            System.out.println(candy);
        }
    }

    public void addCandyList(){
        candyList.add()
    }

    public void deleteCandy(int id){
        boolean check = false;
        for (int i = 0; i < candyList.size(); i++){
            if (candyList.get(i).getId() == id){
                candyList.remove(i);
                check = true;
            }
        }
        if (!check){
            System.out.println("Candy not on this list");
        }
        displayAllCandyList();
    }
    public void editCandy(int id){
        boolean check = false;
        for (int i = 0; i < candyList.size(); i++){
            if (candyList.get(i).getId() == id){
                candyList.set(i, )
            }
        }
    }
    public void displayCandyById(){

    }

    public void deleteAllCandyByColor(){

    }
    public void displayAllCandyByColor(){

    }
    public void findCandyByMaxPrice(){

    }
    public void displayCountCandyByName(){

    }
    public void displayCountCandyByPrice(){

    }
}
