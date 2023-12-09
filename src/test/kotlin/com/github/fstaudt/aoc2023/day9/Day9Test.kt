package com.github.fstaudt.aoc2023.day9

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day9Test {

    companion object {
        private const val EXAMPLE = "example_day9.txt"
    }

    @Test
    fun `part 1 should produce expected result for example`() {
        assertThat(Day9(EXAMPLE).part1()).isEqualTo(114)
    }

    @Test
    fun `part 2 should produce expected result for example`() {
        assertThat(Day9(EXAMPLE).part2()).isEqualTo(2)
    }

    @Test
    fun `part 1 should produce expected result for my input`() {
        assertThat(Day9().part1()).isEqualTo(2105961943)
    }

    @Test
    fun `part 2 should produce expected result for my input`() {
        assertThat(Day9().part2()).isEqualTo(0)
    }
}
