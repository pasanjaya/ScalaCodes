import scala.math._

object Volume{
    def main(args: Array[String]): Unit = {
        val r:Double = 5
        val h:Double = 10
        var vol:Double = (1/3.0)*Pi*pow(r,2)*h
        println(vol)
    }
}
