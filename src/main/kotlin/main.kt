fun main(){
    println("==프로그램 시작==")

//    print("숫자(띄어쓰기로 구분) : ")
//    val numbers = readLine()!!.split(" ").map{it.toInt()}.toMutableList()
//
//    for(b in 0 until numbers.size) {
//        for (a in 0 until numbers.size) {
//            if (numbers[b] < numbers[a]) {
//                numbers[b] = numbers[a].also {
//                    numbers[a] = numbers[b]
//                }
//            }
//        }
//    }
//    numbers.forEach{
//        print(it)
//    }
//    println(" ")

//    for(i in numbers.indices){
//        for(x in numbers.indices){
//            if(numbers[i] < numbers[x]){
//                numbers[x] = numbers[i].also{
//                    numbers[i] = numbers[x]
//                }
//            }
//        }
//    }

    print("회원 수 : ")
    val memberCount = readLine()!!.trim().toInt()
    val members : Array<Member> = Array<Member?>(memberCount){null} as Array<Member>

    println("$memberCount 명의 회원 정보를 입력합니다.")
    for(i in 0 until memberCount){
        val id = i+1
        print("${i+1}번째 회원의 이름 : ")
        val name = readLine()!!.trim()
        print("${i+1}번째 회원의 나이 : ")
        val age = readLine()!!.trim().toInt()
        print("${i+1}번째 회원의 성별(M/W) : ")
        val gender = readLine()!!.trim()[0]

        val member = Member(id, name, age, gender)
        members[i] = member
    }
    for(member in members){
        println("${member.id} / ${member.name} / ${member.age} / ${member.getGender()}")
    }

    println("==프로그램 끝==")
}

data class Member(
    val id : Int,
    val name : String,
    val age : Int,
    val gender : Char
){
    fun getGender() : String = when(gender){
        'w' -> "여자"
        else -> "남자"
    }

}