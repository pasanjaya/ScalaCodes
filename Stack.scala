object Stack {
    var stack:List[Int] = Nil

    def isEmpty(): Boolean = {
        return stack.isEmpty
    }

    def push(item:Int):Unit = {
        stack = item :: stack
        println(stack.toString)
    }

    def pop():Int = {
        val top:Int = stack.head
        stack = stack.tail
        return top
    }

    def print():Unit = {
        while(!isEmpty()){
            println(pop())
        }
    }


    def main(args: Array[String]): Unit = {
        println(isEmpty())
        push(14)
        push(25)
        push(34)
        push(768)
        push(23)
        // println(pop())
        // println(pop())
        print()
    }
}