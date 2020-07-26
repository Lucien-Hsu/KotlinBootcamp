//常量，最多書本數
const val MAX_NUMBER_BOOKS = 3

fun main() {
    //建立Book
    val myBook = Book("Kotlin", "Lucien", 1988)
    //取出每個值
    val (t, a, y) = myBook.getTitleAuthorYear()
    println("Here is your book $t written by $a in $y.")

    val bookTitleAuthorYear = myBook.getTitleAuthorYear()
    //照排列順序取值
    println("Here is your book ${bookTitleAuthorYear.first} " +
            "written by ${bookTitleAuthorYear.second} in ${bookTitleAuthorYear.third}")
}

object Constants{
    const val BASE_URL = "http://www.turtlecare.net/"
}

class Book(val title: String, val author: String, val year: Int, val pages: Int = 0){
    //回傳Pair
    fun getTitleAuthor(): Pair<String, String>{
        return (title to author)
    }

    //回傳Triple
    fun getTitleAuthorYear(): Triple<String, String, Int>{
        return Triple(title, author, year)
    }

    //伴隨物件
    companion object {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    //確認可借閱
    fun canBorrow(hasBook: Int): Boolean{
        return (hasBook < MAX_NUMBER_BOOKS)
    }

    //印出伴隨物件組合成的URL
    fun printUrl(){
        println("${BASE_URL}book01.html")
    }
}

fun Book.weight(): Double = (pages * 1.5)
fun Book.tornPages(torn: Double): Double{return (pages - torn)}
