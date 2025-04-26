import java.util.Scanner;

public class TimeCalculatorV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        long totalSeconds = scanner.nextLong();
        String result = convertSecondsToTimeFormat(totalSeconds);
        System.out.println(result);
    }

    public static String convertSecondsToTimeFormat(long totalSeconds) {
        if (totalSeconds < 0) {
            return "Некорректное значение секунд.";
        }

        long years = totalSeconds / (365 * 24 * 3600);
        totalSeconds %= (365 * 24 * 3600);
        
        long months = totalSeconds / (30 * 24 * 3600); // Приблизительно, 1 месяц = 30 дней
        totalSeconds %= (30 * 24 * 3600);
        
        long weeks = totalSeconds / (7 * 24 * 3600);
        totalSeconds %= (7 * 24 * 3600);
        
        long days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);
        
        long hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        StringBuilder timeString = new StringBuilder();

        if (years > 0) {
            timeString.append(years).append(" ").append(getYearLabel(years));
        }
        if (months > 0) {
            if (timeString.length() > 0) {
                timeString.append(", ");
            }
            timeString.append(months).append(" ").append(getMonthLabel(months));
        }
        if (weeks > 0) {
            if (timeString.length() > 0) {
                timeString.append(", ");
            }
            timeString.append(weeks).append(" ").append(getWeekLabel(weeks));
        }
        if (days > 0) {
            if (timeString.length() > 0) {
                timeString.append(", ");
            }
            timeString.append(days).append(" ").append(getDayLabel(days));
        }
        if (hours > 0) {
            if (timeString.length() > 0) {
                timeString.append(", ");
            }
            timeString.append(hours).append(" ").append(getHourLabel(hours));
        }
        if (minutes > 0) {
            if (timeString.length() > 0) {
                timeString.append(", ");
            }
            timeString.append(minutes).append(" ").append(getMinuteLabel(minutes));
        }
        if (seconds > 0 || timeString.length() == 0) { // Добавляем секунды, если нет других единиц
            if (timeString.length() > 0) {
                timeString.append(" и ");
            }
            timeString.append(seconds).append(" ").append(getSecondLabel(seconds));
        }

        return timeString.toString();
    }

    private static String getYearLabel(long years) {
        return years == 1 ? "год" : "года";
    }

    private static String getMonthLabel(long months) {
        return months == 1 ? "месяц" : "месяца";
    }

    private static String getWeekLabel(long weeks) {
        return weeks == 1 ? "неделя" : "недели";
    }

    private static String getDayLabel(long days) {
        return days == 1 ? "день" : "дня";
    }

    private static String getHourLabel(long hours) {
        return hours == 1 ? "час" : "часа";
    }

    private static String getMinuteLabel(long minutes) {
        if (minutes % 10 == 1 && minutes % 100 != 11) {
            return "минуту";
        } else if (minutes % 10 >= 2 && minutes % 10 <= 4 && (minutes % 100 < 10 || minutes % 100 >= 20)) {
            return "минуты";
        } else {
            return "минут";
        }
    }

    private static String getSecondLabel(long seconds) {
        if (seconds % 10 == 1 && seconds % 100 != 11) {
            return "секунду";
        } else if (seconds % 10 >= 2 && seconds % 10 <= 4 && (seconds % 100 < 10 || seconds % 100 >= 20)) {
            return "секунды";
        } else {
            return "секунд";
        }
    }
}

