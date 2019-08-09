package interfejsy;

public enum WeekDays {

    PONIEDZIAŁEK,
    WTOREK,
    SRODA,
    CZWARTEK,
    PIATEK,
    SOBOTA,
    NIEDZIELA;



    @Override
    public String toString(){
        String poprzedniaNazwa = super.toString();
        String nowaNazwa = poprzedniaNazwa.toLowerCase();
        return nowaNazwa;
    }


}
