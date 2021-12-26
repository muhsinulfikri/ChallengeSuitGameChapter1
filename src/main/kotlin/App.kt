class App {
    private val hands = arrayListOf("Batu", "Kertas", "Gunting")
    fun run(){
        printHeader()
        printHand()
    }
    private fun printHeader(){
        println("==========================")
        println("Suit Game Terminal Version")
        println("==========================")
    }
    private fun printHand(){
        println("Enter Your Choice : $hands")
        println()
        println("1. Enter Player 1 Hands :")
        val player1 = inputPlayer().lowercase()
        println("2. Enter Player 2 Hands :")
        val player2 = inputPlayer().lowercase()
        judge(player1,player2)
    }
    private fun inputPlayer(): String{
        return try {
            readLine()?: println("").toString()
        } catch (e: Exception){
            println("").toString()
        }
    }
    private fun judge(player1: String, player2: String){
        println("STATUS :")
        when{
            player1 == player2 -> println("Draw")
            player1 == "gunting" && player2 == "kertas" -> println("Player 1 Win")
            player1 == "batu" && player2 == "gunting" -> println("Player 1 Win")
            player1 == "kertas" && player2 == "batu" -> println("Player 1 Win")
            player2 == "gunting" && player1 == "kertas" -> println("Player 2 Win")
            player2 == "batu" && player1 == "gunting" -> println("Player 2 Win")
            player2 == "kertas" && player1 == "batu" -> println("Player 2 Win")
            else -> {
                println("Enter Hand Correctly")
                printHand()
            }
        }
    }
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}
