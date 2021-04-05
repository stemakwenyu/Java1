
package udemy;

class Methods{
String animal;
int value;
int month;

void run(){
    System.out.println("Running");
    for(int i=0; i<4; i++){
    System.out.println("My " + animal + " " + "is " + value + " " + "years old.");
}
}
int calMonToBirthday(){
    int monthsLeft =12 - month;
    System.out.println(monthsLeft);
    return monthsLeft;
}
}
public class Classes {
    public static void main(String[]args){
        Methods name = new Methods();
        name.animal = "Cat";
        name.value = 9;
        //name.run();
        name.month = 7;
        //name.calMonToBirthday();
        int months = name.calMonToBirthday();
        
        System.out.println("Months untill bd " + months);
    }
    }


