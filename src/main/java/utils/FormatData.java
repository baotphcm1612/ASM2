package utils;

public class FormatData {
    public static String optimizeName(String name) {
        StringBuilder optimizedName = new StringBuilder();
        String[] splitName = name.trim().toLowerCase().split(" ");
        for (String temp : splitName) {
            optimizedName.append(temp.substring(0, 1).toUpperCase()).append(temp.substring(1)).append(" ");
        }
        return optimizedName.toString().trim();
    }

    public static boolean isEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public static boolean isPhone(String phone) {
        String regex = "^(?:\\+\\d{1,14}|\\d{1,14})$";
        return phone.matches(regex);
    }
}
