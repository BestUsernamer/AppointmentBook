import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static int read() throws FileNotFoundException {
        int meetings = 0;
        File f = new File("Schedules.txt");
        Scanner s = new Scanner(f);
        String schedule ="";
        while (s.hasNext()) {
            while (s.hasNextBoolean()) {
    schedule += s.nextBoolean() + " ";
                AppointmentBook a = new AppointmentBook(readSchedule(schedule));

                if (a.makeAppointment(s.nextInt(), s.nextInt(), s.nextInt()))
                    meetings++;
            }

        }
        schedule = "";
        return meetings;
    }
public static boolean[][] readSchedule(String lines) {
        Scanner s = new Scanner(lines);
        boolean [][] schedule = new boolean[8][60];
        for (int i = 0; i < schedule.length; i++) {
            for (int j = 0; j < schedule [i].length; j++) {
                schedule[i][j] = s.nextBoolean();
            }
        }
        return schedule;
}

    public static void main(String[] args) throws IOException {
System.out.println(read());


//        boolean[][] schedule = new boolean[8][60];
//        AppointmentBook a = new AppointmentBook(schedule);
//        //test cases 1
//        for(int i = 10; i < 15; i++) schedule [2][i] = true;
//        for(int i = 30; i < 45; i++) schedule [2][i] = true;
//        for(int i = 50; i < 60; i++) schedule [2][i] = true;
//        a.printPeriod(2);
//
//
//
//        //test cases 2
//
//        AppointmentBook b = new AppointmentBook(schedule);
//        for(int i = 25; i < 30; i++) schedule [1][i] = true;
//        for(int i = 0; i < 15; i++) schedule [2][i] = true;
//        for(int i = 41; i < 60; i++) schedule [2][i] = true;
//        for(int i = 5; i < 30; i++) schedule [3][i] = true;
//        for(int i = 44; i < 60; i++) schedule [3][i] = true;
//        int period = 2;
//        while   (period <5) {
//            System.out.println("Period: " + period);
//            b.printPeriod(period);
//            period++;
//        }
//
//            //test cases 3
//
//            AppointmentBook c = new AppointmentBook(schedule);
//            for(int i = 25; i < 30; i++) schedule [2][i] = true;
//            for(int i = 3; i < 15; i++) schedule [3][i] = true;
//            for(int i = 41; i < 60; i++) schedule [3][i] = true;
//            for(int i = 27; i < 29; i++) schedule [4][i] = true;
//            for(int i = 44; i < 60; i++) schedule [4][i] = true;
//            c.printPeriod(period);
//
//
//        System.out.println(c.makeAppointment(2, 4, 22));

    }

}

