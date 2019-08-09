package interfejsy;

public class MainWeekdays{
    public static void main(String[] args){

        WeekDays wd1 = WeekDays.PONIEDZIAŁEK;
        WeekDays wd2 = WeekDays.WTOREK;
        WeekDays wd3 = WeekDays.SRODA;
        WeekDays wd4 = WeekDays.CZWARTEK;
        WeekDays wd5 = WeekDays.PIATEK;
        WeekDays wd6 = WeekDays.SOBOTA;
        WeekDays wd7 = WeekDays.NIEDZIELA;

        System.out.println("Dni tygodnia: ");

        //Zamiana wielkich liter na małe
        for (WeekDays wd : WeekDays.values()) {
            String powiedzDzien = wd.toString();

            System.out.println(powiedzDzien);
        }

    }
}
