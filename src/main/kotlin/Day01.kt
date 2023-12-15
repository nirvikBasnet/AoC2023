class Day01(private val input: List<String>){

    fun solvePart1() {
        print( input.sumOf { calibrationValue(it) })
    }


    fun calibrationValue(input : String):Int{
        return "${input.first { it.isDigit() }}${input.last { it.isDigit() }}".toInt()
    }

}