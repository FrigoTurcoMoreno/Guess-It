import kotlin.random.Random

fun main(){
    println("Welcome to Guess It! \n" +
            "Are you ready to find the random number generated in a range between 1 and 100? \n" +
            "You have 10 attempts to guess it!")

    //empty line
    println()

    //generate the random number
    val randomNumber: Int = Random.nextInt(1, 100)

    //variable for the inserted number
    var insertedNumber: Int

    //for loop to control the flow of the attempts
    //you can use a do-while loop to ensure you don’t lose any attempts
    for (i in 10 downTo 1){

        println("Attempts left: $i")
        print("Insert a number: ")

        //manage the exception if u don't insert a valid number
        try {
            insertedNumber = readln().toInt()
        } catch (e: Exception){
            //skip the attempt
            println("You didn't insert a valid number, you lost an attempt.")
            continue
        }

        //main logic of the guess it application
        if (insertedNumber > randomNumber) {
            println("Your number is larger than the generated one.")
        }
        else if (insertedNumber < randomNumber){
            println("Your number is smaller than the generated one.")
        } else {
            //you won and skip it to the end
            println("You guessed the number!")
            break
        }

        //empty line
        println()
    }

    println("Game finished.")
}