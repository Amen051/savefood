public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(':');
        return logLine.substring(index+1).trim();
    }

    public static String logLevel(String logLine) {
        int debut = logLine.indexOf('[') + 1;
        int fin = logLine.indexOf(']');

        return logLine.substring(debut,fin).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) +")";
    }
}
