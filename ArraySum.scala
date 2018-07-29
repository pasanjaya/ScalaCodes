object ArraySum{
    def sum(array:Array[Int]){
        var tot:Int = 0
        for(i <-array){
            tot += i
        }
        println(tot)
    }
    
    def main(args: Array[String]): Unit = {
        val n:Array[Int] = Array(45,67,23,90)
        sum(n)
    }
}