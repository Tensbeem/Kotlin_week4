fun testWhileLoop(){
    var i = 1
    var sum = 0
    while(i <= 5){
        sum += i
        println("Line $1")
        ++i
    }
    println("Sum = $sum")
}