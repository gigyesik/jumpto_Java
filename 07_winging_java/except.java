class FoolException extends Exception {

}

public class except {
    /*
    public void shouldBeRun() {
        System.out.println("ok thanks");
    }

    public static void main(String[] args) {
        except exception = new except();
        // try ... catch
        int c;
        try {
            c = 4 / 0;
            exception.shouldBeRun();
        } catch (ArithmeticException e) {
            c = -1; // c = -1
        }

        // finally
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            exception.shouldBeRun(); // ok thanks
        }
    }
    */

    /*
    // RuntimeException , Exception
    public void sayNick(String nick) {
        try {
            if ("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("your nick is " + nick);
        } catch (FoolException e) {
            System.out.println("FoolException");
        }
    }

    public static void main(String[] args) {
        except exception = new except();
        exception.sayNick("fool"); // FoolException
        exception.sayNick("genius"); // your nick is genius
    }
     */

    // throws
    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("your nick is " + nick);
    }

    public static void main(String[] args) {
        except exception = new except();
        try {
            exception.sayNick("fool"); // FoolException
            exception.sayNick("genius"); // not run
        } catch (FoolException e) {
            System.err.println("FoolException");
        }
    }

    // Transaction

}
