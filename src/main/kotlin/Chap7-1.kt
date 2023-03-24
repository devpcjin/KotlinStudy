import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

fun main () {
    /**
     * ArrayList
     * - 중복 허용
     */
    val list = ArrayList<String?>()
    list.add("red")
    list.add("green")
    list.add("red")
    println(list) // [red, green, red]

    /**
     * HashSet
     * - 중복 비허용
      */
    val set = HashSet<Int>()
    set.add(12)
    set.add(21)
    set.add(12)
    println(set) // [21, 12]

    /**
     * TreeMap
     * - Key : Value로 구성
     */
    val map = TreeMap<Int, String>()
    map[20] = "Twenty"
    map[10] = "Ten"
    println(map) // {10=Ten, 20=Twenty}

    var emptyList = emptyList<String?>()
    println(emptyList)

    emptyList = list

    println(emptyList)




}