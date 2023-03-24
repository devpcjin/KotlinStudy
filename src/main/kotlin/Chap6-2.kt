enum class WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    val lowerCaseName get() = name.lowercase()

    fun isWorkDay() = this == SATURDAY || this == SUNDAY
}

class NormalPerson(val firstName: String, val familyName: String, val age: Int)

data class DataPerson(val firstName: String, val familyName: String, val age: Int)

// EX3
data class DataPerson3(val firstName: String, val familyName: String) {
    var age = 0
}

fun main(){
    println(WeekDay.MONDAY.lowerCaseName)
    println(WeekDay.FRIDAY.isWorkDay())
    println(WeekDay.SUNDAY.isWorkDay())

    /**
     * data class 예제
     * - data를 저장하기 위한 목적으로 주로 쓰이는 클래스
     * - 컴파일러가 동등성을 비교하거나 String으로 변환하는 등의 기본 연산 구현 자동 생성
     *  - 내용을 바탕으로 동등성 구현
     *  - 주생성자의 파라미터에서 선언한 프로퍼티만 적용 (ex3)
     */
    // EX1 일반 class 데이터 비교
    val normalPerson1 = NormalPerson("cj", "park", 27)
    val normalPerson2 = NormalPerson("cj", "park", 27)
    val normalPerson3 = normalPerson1

    println(normalPerson1 == normalPerson2) // false -> 서로 다른 객체
    println(normalPerson1 == normalPerson3) // true

    // EX2 data class 비교
    val dataPerson1 = DataPerson("cj", "park", 27)
    val dataPerson2 = DataPerson("cj", "park", 27)
    val dataPerson3 = dataPerson1

    println(dataPerson1 == dataPerson2) // true
    println(dataPerson1 == dataPerson3) // true

    // EX3 주 생성자에 대해서만 동등성비교하고 나머지 값은 달라고 동등하다.
    val personEx1 = DataPerson3("Jone", "Doe").apply { age = 25 }
    val personEx2 = DataPerson3("Jone", "Doe").apply { age = 26 }

    println(personEx1 == personEx2)

    // 구조 분해 선언
    val (firstName, familyName, age) = DataPerson("cj", "park", 27)
    println("$firstName $familyName: $age")

    val (name) = DataPerson("cj", "park", 27)
    println(name)

    val (_, name2) = DataPerson("cj", "park", 27)
    println(name2)
    
}