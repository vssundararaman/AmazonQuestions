package fundamental.enumpack;

public class EnumTest {

    Day day;

    public EnumTest(Day day){
        this.day = day;
    }

    public void testLikeThis(){
        switch(day){
            case MONDAY:
                System.out.println("It is Monday");
                break;
            case TUESTDAY:
                System.out.println("It is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("It is Wednesday");
                break;
            case THURSDAY:
                System.out.println("It is Thursday");
                break;
            case FRIDAY:
                System.out.println("It is Friday");
                break;
            case SATURDAY:
                System.out.println("It is Saturday");
                break;
            case SUNDAY:
                System.out.println("It is Sunday");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.testLikeThis();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.testLikeThis();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.testLikeThis();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.testLikeThis();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.testLikeThis();
    }
}

