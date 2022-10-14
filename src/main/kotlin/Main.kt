import java.time.format.DateTimeFormatter

fun addEvent(_event_list:MutableList<conf_hall_event>, _new_event: conf_hall_event){
    var event_add_f:Boolean = true
    for (event in _event_list){
        if (_new_event.d_begin.isAfter(event.d_end) or _new_event.d_end.isBefore(event.d_begin))
            //println(event.d_begin.format(DateTimeFormatter.ofPattern("d/M/y H:m")))
            event_add_f = false
            break
    }

    if (event_add_f){
        println("Мероприятие успешно добавлено")
    }
    else{
        println("Дата не добавлена")
    }

    return
}

fun main() {
    var event_list: MutableList<conf_hall_event> = arrayListOf()
    var input_string: String

    input_string = readLine()!!
    val dateFormatter = DateTimeFormatter.BASIC_ISO_DATE
    val validator = DateValidatorForLocalDate(dateFormatter)

    println(validator.isValid("20190228"))

//    var new_event: conf_hall_event = conf_hall_event()
//
//    event_list.add(new_event)
//
//    addEvent(event_list, new_event)
}