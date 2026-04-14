public class Date implements Comparable<Date> {

    private final int day;
    private final String month;
    private final int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    private int monthValue(String month) {
        switch (month) {
            case "January":   return 1;
            case "February":  return 2;
            case "March":     return 3;
            case "April":     return 4;
            case "May":       return 5;
            case "June":      return 6;
            case "July":      return 7;
            case "August":    return 8;
            case "September": return 9;
            case "October":   return 10;
            case "November":  return 11;
            case "December":  return 12;
            default:          return 0;
        }
    }

    /**
     * Trang bị quan hệ thứ tự cho ngày
     * 
     * @param other ngày dùng để so sánh
     * @return giá trị âm nếu ngày này sớm hơn {@code other},
     *         bằng 0 nếu hai ngày là một,
     *         giá trị dương nếu ngày này muộn hơn {@code other}
     */
    @Override
    public int compareTo(Date other) {
        // TODO
        return 0;
    }

    @Override
    public String toString() {
        return day + " " + month + " " + year;
    }
}