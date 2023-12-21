import java.lang.StringBuilder

class Day01(private val input: List<String>){

    fun solvePart1() {
        //day01-part01
        print( input.sumOf { calibrationValue(it) })
        //day01-part2
        solvePart2(input)
    }


        val numberMap = mapOf(
            "one" to 1, "two" to 2, "three" to 3, "four" to 4,
            "five" to 5, "six" to 6, "seven" to 7, "eight" to 8,
            "nine" to 9
        )


    fun solvePart2(input: List<String>): Int {
        var values = 0
        for (line in input) {
            val nums: MutableList<Int> = mutableListOf()
            var i = 0
            for (char in line) {
                val slice = line.slice(i..<line.length)
                for((key, value) in numberMap) {
                    if(slice.startsWith(key)) {
                        nums.add(value.toInt())
                    }
                }
                if (char.isDigit()) {
                    nums.add(char.digitToInt())
                }
                i++
            }
            values += (nums[0] * 10 + nums[nums.size-1])
        }
        println(values)
        return values
    }




    fun calibrationValue(input : String):Int{
        return "${input.first { it.isDigit() }}${input.last { it.isDigit() }}".toInt()
    }

}

