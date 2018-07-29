import scala.math._

object ListFactors{

    def factors(n:Int){
        var m:Int = n
        var x:List[Int] = List()
        var i:Int = 2
        while(i <= scala.math.floor(scala.math.sqrt(n))){
            if(m%i == 0){
                m /=i
                x = x ::: List(i)
                println(x.toString)
            }
            if(i == scala.math.floor(scala.math.sqrt(n))) x = x::: List(m)
            i += 1
        }
        if(x.isEmpty) println(List(1,n).toString)
        else println(x.toString)
    }

    def main(args: Array[String]): Unit = {
        factors(16)
    }
}