import java.io.FileNotFoundException;

public class Program {

        public void PrintAllObjects(){
            Readingtxt read = new Readingtxt();

            try {
                read.readBallFiles();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            try {
                read.readTennisFiles();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            System.out.println(read.returnEquipment());
            System.out.println("\n");
        }

        public void PrintOutMaintenance(){
            Repairs r1 = new Repairs();
            r1.runReadingTxt();

            System.out.println("Balls that need air");
            System.out.println("*******************************************");
            r1.printBallsNeedingMoreAir();
            System.out.println("\n");

            System.out.println("Equipment that needs to be replaced");
            System.out.println("********************************************");
            r1.printEquipmentNeedingToBeReplaced();
            System.out.println("\n");

            System.out.println("Tennis racket that needs repairing");
            System.out.println("*********************************************");
            r1.printTableTennisRacketsNeedingNewPad();
        }
}
