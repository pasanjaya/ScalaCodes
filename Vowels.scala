object Vowels {
    def main(args: Array[String]): Unit = {
        for( c <- args(0)){
            if(c == 'a') println("a")
            if(c == 'e') println("e")
            if(c == 'i') println("i")
            if(c == 'o') println("o")
            if(c == 'u') println("u")
        }
    }
}
