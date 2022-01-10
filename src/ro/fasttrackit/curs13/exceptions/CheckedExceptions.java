package ro.fasttrackit.curs13.exceptions;

import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {
        try { //CATCH
            System.out.println("Start algo");
            myLogic();
            System.out.println(args.length);
            javaCheckedExceptions();
            System.out.println("After exception");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Fisierul nu exista " + fnfe.getMessage());
//            fnfe.printStackTrace();
            System.err.println("Nu e oprita aplicatia");
        } catch (MyException my) {
            System.out.println("Exceptia mea a fost aruncata " + my.getMessage());
        } catch (Throwable thr) {
            System.out.println("generic");
        } finally {
            System.out.println("se executa tot timpul");
        }

        System.out.println("In afara");
    }

    private static void javaCheckedExceptions() throws FileNotFoundException { //SPECIFY
//        FileReader test = new FileReader("test");
    }

    private static void myLogic() throws MyException {

//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new MyException("The time is even");
//        } else {
//            throw new ArrayIndexOutOfBoundsException();
//        }
    }
}
