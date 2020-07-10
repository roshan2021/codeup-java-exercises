package HackerRank;

//import java.io.*;
//import java.time.LocalDate;
//
//
//public class CalendarDay {
//
//
//        public  String getDay(String day, String month, String year) {
//            int y = Integer.parseInt(year);
//            int m = Integer.parseInt(month);
//            int d = Integer.parseInt(day);
//
//            LocalDate lt = LocalDate.of(y, m, d);
//
//            return lt.getDayOfWeek().name();
//        }
//
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            int month = Integer.parseInt(firstMultipleInput[0]);
//
//            int day = Integer.parseInt(firstMultipleInput[1]);
//
//            int year = Integer.parseInt(firstMultipleInput[2]);
//
//            String res = findDay(month, day, year);
//
//            bufferedWriter.write(res);
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }
//
//
//}
