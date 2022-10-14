import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException


class DateValidatorForLocalDate(private val dateFormatter: DateTimeFormatter) {
    fun isValid(dateStr: String?): Boolean {
        try {
            LocalDate.parse(dateStr, dateFormatter)
        } catch (e: DateTimeParseException) {
            return false
        }
        return true
    }
}