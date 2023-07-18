import java.time.LocalDate;

class Solution {
    public int dayOfYear(String dateString) {
        LocalDate date = LocalDate.parse(dateString);
        return date.getDayOfYear();
    }
}
