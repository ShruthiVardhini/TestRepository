import com.learning.protect.ClassWithinASamePackage;
import com.learning.protect.TestSampleProtected;
import com.learning.shruthi.TestJavaClass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static boolean globalVariable=true;
    private static String globalStringVariable="VINOD";

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        String retString = returnString();
        System.out.println(retString);

        //System.out.println(returnString());

        String retStringPrivate = returnStringPrivate();
        System.out.println(retStringPrivate);

        TestJavaClass testJavaClass = new TestJavaClass();
        //testJavaClass.sayHello();

        TestSampleProtected testSampleProtected = new TestSampleProtected();
        //testSampleProtected.sa

        ClassWithinASamePackage classWithinASamePackage = new ClassWithinASamePackage();
        classWithinASamePackage.sayHello();

    }

    public static String returnString() {

        System.out.println(globalVariable);
        System.out.println(globalStringVariable);

        return "Shruthi is Smart";
    }


    private static String returnStringPrivate() {

        System.out.println(globalVariable);
        System.out.println(globalStringVariable);

        return "Shruthi is Smart - Returning from Private Method;";
    }

}