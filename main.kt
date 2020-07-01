fun main(args: Array<String>){
    val generator = RandomNumberGenerator()
    val observer1: Observer = DigitObserver()
    val observer2: Observer = GraphObserver()
    generator.addObserver(observer1);
    generator.addObserver(observer2);
    generator.execute();
}