object CollatzConjecture {

    def seq(n:Int){
        if(n > 1){
            if(n%2 == 0)
                seq(n/2)
            else 
                seq((n * 3) + 1)
        }
        println(n)
    }

    def main(args: Array[String]): Unit = {
        seq(10)
    }
}