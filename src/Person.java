public class Person {
    String name;
    int age;
    int height;   //inaltimea
    int stamina;

    public void run() {              // cream metoda RUN de alergare
        stamina -- ;
    }

    public void sleep() {           // cream metoda SLEEP de dormit
        stamina += 12 ;
    }

    /*public boolean isMajor () {     // intrebam persoana daca este majora sau nu
        if(age >= 18) {
            return true ;
        } else {
            return false;
        }
    }*/
    // SAU
    public boolean isMajor() {
      /*  return age >= 18 ? true : false; // SAU */
        return age >=18;
    }

    public String whatsYourName () {
        return name;
    }

    public int getAge() {
        return age;
    }


}
