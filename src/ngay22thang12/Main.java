package ngay22thang12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        int choice ;
       do {
           System.out.println("Menu");
           System.out.println("1. Hiển thị tất cả người");
           System.out.println("2. thêm người");
           System.out.println("3. xóa người theo tên");
           System.out.println("4. sửa người theo tên");
           System.out.println("5. Hiển thị người dưới 20 tuổi");
           System.out.println("6. Hiển thị tất cả Nam: ");
           System.out.println("7. Hiển thị tất cả Nữ:");
           System.out.println("8. Hiển thị tất cả người theo tên nhập vào");
           System.out.println("Nhập lựa chọn của bạn: ");
           choice = scanner.nextInt();
           switch (choice) {
               case 1:
                   manager.displayAll();
                   break;
               case 2:
                  Human human = manager.createHuman();
                  manager.addHuman(human);
                  break;
               case 3:
                   System.out.println("Nhập tên: ");
                   String deleteName = scanner.nextLine();
                   scanner.nextLine();
                   Human human1 = manager.deleteHuman(deleteName);
                   if (human1 == null){
                       System.out.println("không có tên người tương ứng!");
                   } else {
                       System.out.println(human1);
                   }
                   break;
               case 4:
                   System.out.println("Nhập tên: ");
                   String editName = scanner.nextLine();
                   scanner.nextLine();
                   System.out.println(manager.editHuman(editName));
                   break;
               case 5:

                   break;
               case 6:
                   break;
               case 7:
                   break;
               case 8:
                   break;
           }

        } while (choice != 0);
    }
}
