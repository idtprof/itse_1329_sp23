package unit06

fun main() {
    val rooms = arrayOf(
        arrayOf("You are in a dusty castle room.\nPassages lead to the north and south.", "1", "-1", "-1", "2"),
        arrayOf("You are in the armory.\nThere is a room off to the south.", "-1", "0", "-1", "-1"),
        arrayOf("You are in a torch-lit hallway.\nThere are rooms to the east and west.", "-1", "-1", "0", "3"),
        arrayOf("You are in a bedroom. A window overlooks the castle courtyard.\nA hallway is to the west.", "-1", "2", "-1", "-1"),
        arrayOf("You are in the kitchen. It looks like a roast is being made for supper.\nA hallway is to the east.", "-1", "-1", "-1", "2")
    )

    var currentRoom = 0

    while (true) {
        println(rooms[currentRoom][0])
        print("What direction? ")
        val direction = readLine()!!.trim().toLowerCase()

        when (direction) {
            "n" -> {
                if (rooms[currentRoom][1] != "-1") {
                    currentRoom = rooms[currentRoom][1].toInt()
                } else {
                    println("Can't go that way.")
                }
            }
            "e" -> {
                if (rooms[currentRoom][2] != "-1") {
                    currentRoom = rooms[currentRoom][2].toInt()
                } else {
                    println("Can't go that way.")
                }
            }
            "s" -> {
                if (rooms[currentRoom][3] != "-1") {
                    currentRoom = rooms[currentRoom][3].toInt()
                } else {
                    println("Can't go that way.")
                }
            }
            "w" -> {
                if (rooms[currentRoom][4] != "-1") {
                    currentRoom = rooms[currentRoom][4].toInt()
                } else {
                    println("Can't go that way.")
                }
            }
            else -> println("Invalid direction. Please enter 'n', 'e', 's', or 'w'.")
        }
    }
}
