import kotlin.random.Random

class RandomNumberGenerator: NumberGenerator() {
private val random: Random = Random
private var num: Int = 0

    override fun getNumber(): Int{
        return num
    }

    override fun execute(){
        for(i in 1..20) {
            num = random.nextInt(50            )
            notifyObservers()
        }
    }
}