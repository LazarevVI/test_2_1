class ConferenceHall {
    var event_list: MutableList<conf_hall_event> = arrayListOf()

    fun addEvent(new_event: conf_hall_event){
        var event_add_f:Boolean = isAvailable(new_event)
        if (event_add_f){
            event_list.add(new_event)
            println("Мероприятие успешно добавлено")
        }
        else{
            println("Дата не добавлена")
        }

        return
    }

    fun isAvailable(new_event: conf_hall_event): Boolean {
        for (event in this.event_list){
            if (new_event.d_begin.isAfter(event.d_end) or new_event.d_end.isBefore(event.d_begin))
                println("Добавляемое мероприятие $")
                return false
        }
        return true
    }
}