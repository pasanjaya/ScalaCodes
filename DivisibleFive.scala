object DivisibleFive {
    def main(args: Array[String]): Unit = {
        for(i <- 1 to 100){
           if(i%5 == 0) println(i)
        }
    }
}