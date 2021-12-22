package ngay21thang12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandy managerCandy = new ManagerCandy();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị tất cả kẹo ");
            System.out.println("2. Thêm kẹo");
            System.out.println("3. Xóa kẹo theo id");
            System.out.println("4. Sửa kẹo theo id");
            System.out.println("5. Hiển thị kẹo theo id");
            System.out.println("6. Xóa tất cả các viên kẹo có cùng màu nhập vào");
            System.out.println("7. Hiển thị tất cả các viên kẹo có cùng màu nhập vào");
            System.out.println("8. Hiển thị tất cả viên kẹo có đơn giá cao nhất");
            System.out.println("9. Hiển thị tất cả kẹo và tổng giá trị của nó");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    managerCandy.displayAll();
                    break;
                case 2:
                    Candy candy = managerCandy.createCandy();
                    managerCandy.addCandy(candy);
                    break;
                case 3:
                    System.out.println("Input Id: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    Candy candy1 = managerCandy.deleteCandy(deleteId);
                    if (candy1 == null){
                        System.out.println("Không có viên kẹo tương ứng!");
                    } else {
                        System.out.println(candy1);
                    }
                    break;
                case 4:
                    System.out.println("Input Id: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(managerCandy.editCandy(editId));
                    break;
                case 5:
                    System.out.println("Input Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    managerCandy.displayCandy(id);
                    break;
                case 6:
                    System.out.println("Nhập màu muốn xóa: ");
                    scanner.nextLine();
                    String colorDelete = scanner.nextLine();
                    ArrayList<Candy> arrayList1 = managerCandy.deleteCandyListByColor(colorDelete);
                    System.out.println(arrayList1);
                    break;
                case 7:
                    System.out.println("Nhập màu muốn hiển thị: ");
                    scanner.nextLine();
                    String color = scanner.nextLine();
                    ArrayList<Candy> arrayList2 = managerCandy.displayCandyListByColor(color);
                    System.out.println(arrayList2);
                    break;
                case 8:
                    ArrayList<Candy> arrayList3 = managerCandy.searchByPrice();
                    System.out.println(arrayList3);
                    break;
                case 9:
                    managerCandy.displayCandyListAndTotalPrice();
                    break;
            }
        } while (choice != 0);
    }
}
