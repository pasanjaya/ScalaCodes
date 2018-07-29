object Recursive{

    var i:Int = 5

    def printNum(n:Int){
        
        if(i > n) return
        else {
            println(i)
            i += 5
            printNum(n)
        }
    }
    
    def main(args: Array[String]): Unit = {
        printNum(103)
    }
}