package cn.entertech.traviscitest

import android.util.Log
import org.junit.Test

import org.junit.Assert.*
import org.junit.FixMethodOrder
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.powermock.core.classloader.annotations.PowerMockIgnore
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(PowerMockRunner::class)
@PrepareForTest(Log::class)
@PowerMockIgnore("jdk.internal.reflect.*","javax.net.ssl.*")
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        var testFile = TestFile()
        assertEquals(2, testFile.testMethod(1, 2))
    }
}
