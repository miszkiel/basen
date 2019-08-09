package exercises;

public class Book {

       private String nazwa;
       private int iloscStron;

       public Book(String nazwa, int iloscStron){
           this.nazwa = nazwa;
           this.iloscStron = iloscStron;

       }
       public String getNazwa(){
           return nazwa;
       }
       public void setNazwa(String nazwa){
           this.nazwa = nazwa;
       }

       public int getIloscStron(){
           return iloscStron;
       }
       public void setIloscStron(int iloscStron){
           this.iloscStron = iloscStron;

       }

}
