fun main() {
    println("==프로그램 시작==")
    print("숫자 입력(띄어쓰기로 구분) : ")
    val numbers = readLine()!!.split(" ").map { it.toInt() }.toMutableList()



//    for (x in 0 until numbers.size - 1) {
//
//        if (numbers[x] > numbers[x + 1]) {
//            numbers[x] = numbers[x + 1].also {
//                numbers[x + 1] = numbers[x]
//            }
//        }
//    }

    bubbleSort(numbers)

    numbers.forEach {
        print(it)
    }
    println(" ")

    println("==프로그램 끝==")
}


fun bubbleSort(numbers : MutableList<Int>) {
    val maxDepth = numbers.size - 1

    for(depth in maxDepth downTo 0){

        for(i in 0 until depth){
            if(numbers[i] > numbers[i+1]){
                numbers[i] = numbers[i+1].also{numbers[i+1] = numbers[i]}
            }
        }
    }
}
