package ngay21thang12;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCandy {
    ArrayList<Candy> candyList;
    Scanner scanner = new Scanner(System.in);
    public ManagerCandy() {
        candyList = new ArrayList<>();
    }
    public void displayAll(){                   //Hiển thị tất cả kẹo có trong list
        for (Candy candy : candyList){
            System.out.println(candy);
        }
    }

    public Candy createCandy(){
        System.out.println("Nhập màu kẹo: ");
        String color = scanner.nextLine();
        System.out.println("Nhập tính chất kẹo: ");
        String property = scanner.nextLine();
        System.out.println("Nhập số lượng kẹo: ");
        int quantity = scanner.nextInt();
        System.out.println("Nhập đơn giá kẹo: ");
        double amount = scanner.nextDouble();
        return new Candy(color, property, quantity, amount);
    }

    public void addCandy(Candy candy) {
        candyList.add(candy);
    }

    public Candy deleteCandy(int id){           //Xóa viên kẹo theo id
        Candy candy = null;
        for (Candy c : candyList){
            if (c.getId() == id){
                candy = c;
            }
        }
        int index = candyList.indexOf(candy);
        return candyList.remove(index);
    }
    public Candy editCandy(int id) {             //Sửa viên kẹo theo id
        Candy candy = null;
        for (Candy c : candyList){
            if (c.getId() == id){
                candy = c;
            }
        }
        if (candy != null){
            int index = candyList.indexOf(candy);
            System.out.println("Nhập màu mới: ");
            String color = scanner.nextLine();
            candy.setColor(color);
            System.out.println("Nhập tính chất mới: ");
            String property = scanner.nextLine();
            candy.setProperty(property);
            System.out.println("Nhập số lượng mới: ");
            int quantity = scanner.nextInt();
            candy.setQuantity(quantity);
            System.out.println("Nhập đơn giá mới: ");
            double amount = scanner.nextDouble();
            candy.setAmount(amount);
            candy.set(index, candy);
        }
        return candy;
    }

    public void displayCandy(int id) {         //Hiển thị kẹo theo id
        Candy candy = null;
        for (Candy c : candyList){
            if (c.getId() == id){
                candy = c;
            }
        }
        if (candy != null) {
            System.out.println(candy);
        } else {
            System.out.println("không có viên kẹo có id tương ứng!");
        }
    }

    public ArrayList<Candy> deleteCandyListByColor(String color){     //Xóa kẹo theo màu trong danh sách
        ArrayList<Candy> candy = new ArrayList<>();
        for (Candy c : candyList){
            if (c.getColor().equals(color)){
                candy.add(c);
            }
        }
        candyList.removeAll(candy);
        return candy;
    }

    public ArrayList<Candy> displayCandyListByColor(String color) {    //hiển thị kẹo theo màu trong danh sách
        ArrayList<Candy> candy = new ArrayList<>();
        for (Candy c : candyList){
            if (c.getColor().equals(color)){
                candy.add(c);
            }
        }
        return candy;
    }

    public ArrayList<Candy> searchByPrice(){                    //tìm theo kẹo theo đơn giá
        ArrayList<Candy> candy = new ArrayList<>();
        double max = candyList.get(0).getAmount();
        for (Candy c : candyList){
            if (c.getAmount() > max){
                max = c.getAmount();
            }
        }
        for (Candy c : candyList){
            if (c.getAmount() == max){
                candy.add(c);
            }
        }
        return candy;
    }

    public void displayCandyListAndTotalPrice(){                //Tính giá thành của kẹo và hiển thị dưới dạng tên- giá thành
        for (Candy c : candyList){
            System.out.println(c.getId() + "---" + (c.getAmount() * c.getQuantity()));
        }
    }
}

