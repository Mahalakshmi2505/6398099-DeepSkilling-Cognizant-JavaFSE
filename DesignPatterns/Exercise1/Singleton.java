public class SingletonPatternExample{

    static class Logger {
        private static Logger instance;

        private Logger() {
            System.out.println("Logger Created");
        }

        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first log.");
        logger2.log("This is the second log.");

        System.out.println("Are both loggers the same? " + (logger1 == logger2));
    }
}
