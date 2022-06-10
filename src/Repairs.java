import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Repairs implements EquipmentRepairs {

        Readingtxt file = new Readingtxt();
         ArrayList<Equipment> equipments = file.returnEquipment();

        public void runReadingTxt(){

        try {
            file.readBallFiles();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Her skjedde det noe feil.");
        }

        try {
            file.readTennisFiles();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Her skjedde det noe feil");
        }
    }


    @Override
    public void printBallsNeedingMoreAir() {

        for (int i = 0; i <equipments.size() ; i++) {
            if (equipments.get(i) instanceof Ball ){
                if (((Ball) equipments.get(i)).isNeedsAir()){
                    System.out.println( "ID: " +  equipments.get(i).getId() + " Location: "  + equipments.get(i).getLocation() +
                            " Replacing: " + equipments.get(i).getNeedReplacing() + " Type: " + ((Ball) equipments.get(i)).getType() +
                            " Needs air: " + ((Ball) equipments.get(i)).isNeedsAir());
                }
            }
        }
    }

    @Override
    public void printEquipmentNeedingToBeReplaced() {

        for (int i = 0; i <equipments.size() ; i++) {
                if (equipments.get(i).getNeedReplacing()){
                    System.out.println( "ID: " +  equipments.get(i).getId() + " Location: "  + equipments.get(i).getLocation() +
                            " Replacing: " + equipments.get(i).getNeedReplacing() );
                }
        }
    }

    @Override
    public void printTableTennisRacketsNeedingNewPad() {

            for (int i = 0; i <equipments.size() ; i++) {
            if (equipments.get(i) instanceof TableTennisRacket ){
                if (((TableTennisRacket) equipments.get(i)).isNeedRepair()){
                    System.out.println( "ID: " +  equipments.get(i).getId() + " Location: "  + equipments.get(i).getLocation() +
                            " Replacing: " + equipments.get(i).getNeedReplacing() +
                            " Needs repair: " + ((TableTennisRacket) equipments.get(i)).isNeedRepair());
                }
            }
        }
    }


}
