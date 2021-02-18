package Lessons;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Guest {
    public String name, city, status;
    public Guest (String name, String city, String status){
        this.name = name;
        this.city = city;
        this.status = status;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Guest> guests = new ArrayList<>();
        while(true){
            System.out.println("Будут новые гости? да/нет");
            if(r.readLine().equals("нет"))
                break;
            else{
            System.out.println("Введите имя");
            String name = r.readLine();
            System.out.println("Введите город");
            String city = r.readLine();
            System.out.println("Введите статус");
            String status = r.readLine();
            guests.add(new Guest(name, city, status));}

        }

        for (Guest guest : guests) {
            System.out.println("[Имя - " + guest.name + ", Город - " + guest.city + ", Статус - " + guest.status + "]");

        }
    }
}
