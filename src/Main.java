import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandy managerCandy = new ManagerCandy();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị tất cả kẹo có trong list: ");
            System.out.println("2. Thêm 1 viên kẹo vào list:");
            System.out.println("3. Xóa 1 viên kẹo theo id:");
            System.out.println("4. Sửa 1 viên kẹo theo id:");
            System.out.println("5. Hiển thị kẹo theo id:");
            System.out.println("6. Xóa tất cả các viên kẹo có màu được nhập từ bàn phím:");
            System.out.println("7. Hiển thị tất cả các viên kẹo có màu đc nhập từ bàn phím:");
            System.out.println("8. viên kẹo có đơn giá cao nhất:");
            System.out.println("9. giá thành của kẹo và hiển thì dưới dạng tên:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    managerCandy.displayAllCandyList();
                    break;
                case 2:
                    managerCandy.addCandyList();
                    break;
                case 3:
                    managerCandy.deleteCandyById();
                    break;
                case 4:
                    managerCandy.fixCandyById();
                    break;
                case 5:
                    managerCandy.displayCandyById();
                    break;
                case 6:
                    managerCandy.deleteAllCandyByColor();
                    break;
                case 7:
                    managerCandy.displayAllCandyByColor();
                    break;
                case 8:
                    managerCandy.findCandyByMaxPrice();
                    break;
                case 9:
                    managerCandy.displayCountCandyByName();
                    break;
                case 10:
                    managerCandy.displayCountCandyByPrice();
                    break;
            }
        } while (choice != 0);
    }
}
