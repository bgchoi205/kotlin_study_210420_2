fun main() {
    println("==프로그램 시작==")
//    print("숫자 입력(띄어쓰기로 구분) : ")
//    val numbers = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
//
//
//    bubbleSort(numbers)
//
//    numbers.forEach {
//        print(it)
//    }
//    println(" ")


    print("회원 수 : ")
    val memberCount = readLine()!!.trim().toInt()
    val members : Array<Member> = Array<Member?>(memberCount){ null } as Array<Member>

    for(i in 0 until memberCount){
        val id = i+1
        print("${i+1}번째 회원의 이름 : ")
        val name = readLine()!!.trim()
        print("${i+1}번째 회원의 나이 : ")
        val age = readLine()!!.trim().toInt()
        print("${i+1}번째 회원의 성별(M/W) : ")
        val gender = readLine()!!.trim()

        val member = Member(id, name, age, gender)
        members[i] = member
        println("${i+1}번째 회원의 정보가 등록되었습니다.")
    }

    for(member in members){
        println("${member.id} / ${member.name} / ${member.age} / ${member.getGender}")
    }

    println("==프로그램 끝==")

}

data class Member(
    val id : Int,
    val name : String,
    val age : Int,
    val gender : String
){
    val getGender = when(gender){
        "w" -> "여자"
        else -> "남자"
    }

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
