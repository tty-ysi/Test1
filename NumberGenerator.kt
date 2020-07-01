abstract class NumberGenerator{
    private val observers: ArrayList<Observer> = arrayListOf()
    fun addObserver(observer: Observer){
        observers.add(observer)
    }

    fun deleteObserver(observer: Observer){
        observers.remove(observer)
    }

    fun notifyObservers(){
    val it: Iterator<Observer> = observers.iterator()
        while (it.hasNext()) {
            val o: Observer = it.next()
                o.update(this)
        }
    }


    abstract fun getNumber(): Int
    abstract fun execute()

}