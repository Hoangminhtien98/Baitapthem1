package ngay22thang12;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Human> humans = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAll() {
        for (Human human : humans){
            System.out.println(human);
        }
    }

    public Human createHuman(){
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        return new Human(name, gender, age, address);
    }

    public void addHuman(Human human){
        humans.add(human);
    }

    public Human deleteHuman(String name){
        Human human = null;
        for (Human h : humans){
            if (h.getName() == name){
                human = h;
            }
        }
        int index = humans.indexOf(human);
        return humans.remove(index);
    }
    public Human editHuman(String name){
        Human human = null;
        for (Human h : humans){
            if (h.getName() == name){
                human = h;
            }
        }

        if (human != null){
            int index = humans.indexOf(human);
            System.out.println("Nhập tên mới: ");
            String name1 = scanner.nextLine();
            human.setName(name1);
            System.out.println("Nhập giới tính: ");
            String gender = scanner.nextLine();
            human.setGender(gender);
            System.out.println("Nhập tuổi: ");
            int age = scanner.nextInt();
            human.setAge(age);
            System.out.println("Nhập địa chỉ: ");
            String address = scanner.nextLine();
            human.setAddress(address);
            human.set(index, human);
        }
        return human;
    }

    public void displayHuman(String name){
        Human human = null;
        for (Human h : humans){
            if (h.getName() == name){
                human = h;
            }
        }
        if (human != null) {
            System.out.println(human);
        } else {
            System.out.println("Không có tên người này");
        }
    }


}
