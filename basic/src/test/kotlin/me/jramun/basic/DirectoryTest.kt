package me.jramun.basic

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files.readAllLines
import java.nio.file.Files.write
import java.nio.file.Path

class DirectoryTest {

    @Test
    fun test(@TempDir path: Path) {
        val file = path.resolve("t.txt")
        val data = listOf("1", "2", "3")
        write(file, data)
        println(readAllLines(file))
        Assertions.assertEquals(data, readAllLines(file))
    }
}