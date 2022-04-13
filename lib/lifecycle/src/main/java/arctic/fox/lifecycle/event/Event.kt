package arctic.fox.lifecycle.event

class Event {

    private var hasBeenHandles = false

    fun getEventIfNoHandled(): Boolean =
        if (hasBeenHandles){
            false
        }else{
            hasBeenHandles = true
            true
        }
}