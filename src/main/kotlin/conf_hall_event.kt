import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class conf_hall_event(_d_begin: String, _d_end: String, var event_name: String) {
    var d_begin_str = _d_begin
    var d_end_str = _d_end

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    var d_begin = LocalDateTime.parse(d_begin_str, formatter)
    var d_end = LocalDateTime.parse(d_end_str, formatter)

}