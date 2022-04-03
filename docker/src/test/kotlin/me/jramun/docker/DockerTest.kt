package me.jramun.docker

import com.github.junit5docker.Docker
import com.github.junit5docker.Environment
import com.github.junit5docker.Port
import com.github.junit5docker.WaitFor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.sql.DriverManager



@Docker(
    image = "mysql",
    ports = [Port(exposed = 8080, inner = 3306)],
    environments = [Environment(key = "MYSQL_ROOT_PASSWORD", value = "root"), Environment(
        key = "MYSQL_DATABASE", value = ""
    ), Environment(key = "MYSQL_USER", value = ""), Environment(key = "MYSQL_PASSWORD", value = "")],
    waitFor = WaitFor("mysqld: ready for connections")
)
internal class DockerTest {

    @Disabled
    @Test
    @Throws(Exception::class)
    fun test() {
        Class.forName("com.mysql.jdbc.Driver")
        val connection = DriverManager.getConnection(
            "", "", ""
        )
        Assertions.assertFalse(connection.isClosed)
        connection.close()
    }
}