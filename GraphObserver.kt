class GraphObserver: Observer {
    override fun update(generator: NumberGenerator){
        print("GraphObserver:")
        val count: Int = generator.getNumber()
        for(i in 1..count){
            print("*")
        }
        println("")
        Thread.sleep(100)
    }
}