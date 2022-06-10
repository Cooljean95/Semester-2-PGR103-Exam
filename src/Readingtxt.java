import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Readingtxt {

    ArrayList<Equipment> Equipments = new ArrayList();

    public void readBallFiles() throws FileNotFoundException {
        File file = new File("equipment.txt");
        Scanner reader = new Scanner(file);


        while (reader.hasNextLine()) {
            if (reader.nextLine().equalsIgnoreCase("Ball")) {
            int id = Integer.parseInt(reader.nextLine());
            String locker = reader.nextLine();
            boolean replaced =  Boolean.parseBoolean(reader.nextLine());
            String type =  reader.nextLine();
            boolean air =  Boolean.parseBoolean(reader.nextLine());

            Ball ball = new Ball(id, locker, replaced, type, air);
            Equipments.add(ball);
            }
        }
        reader.close();

    }

    public void readTennisFiles() throws FileNotFoundException {

        HashSet<TableTennisRacket> Tennis = new HashSet<>();
        File file = new File("equipment.txt");
        Scanner reader = reader = new Scanner(file);

        while(reader.hasNextLine()){
            if(reader.nextLine().equalsIgnoreCase("TableTennisRacket")){
                int id = Integer.parseInt(reader.nextLine());
                String locker = reader.nextLine();
                boolean replaced =  Boolean.parseBoolean(reader.nextLine());
                boolean repair =  Boolean.parseBoolean(reader.nextLine());

                TableTennisRacket racket = new TableTennisRacket(id, locker, replaced, repair);
                Equipments.add(racket);
            }
        }
        reader.close();
    }

   public ArrayList<Equipment> returnEquipment(){
        return Equipments;
    }

}
