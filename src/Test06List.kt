fun main() {

    val testList = listOf(1,2,3,5,10,88,99,100)
    //反轉List
    println(testList.reversed())

    val allBooks = setOf<String>("book01", "book02", "book03")
    val library = mapOf("The God" to allBooks)
    println(library.any { it.value.contains("book01") })

    var moreBooks = mutableMapOf("King" to "kingBook")

    //若鍵值存在則讀取，不存在則寫入值
    moreBooks.getOrPut("Queen"){"queenBook"}
    moreBooks.getOrPut("Queen"){"queenBook"}//建值存在，故不新增
    println(moreBooks)

}

fun reverseList(list: List<Int>): List<Int>{
    val result: MutableList<Int> = mutableListOf<Int>()
    for(i in list.size downTo 0){
        //取得list的第i個元素，add至result
        result.add(list.get(i))
    }
    return result
}


