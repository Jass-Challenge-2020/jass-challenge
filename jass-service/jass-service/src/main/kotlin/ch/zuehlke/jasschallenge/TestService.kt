package ch.zuehlke.jasschallenge

import ch.zuehlke.jasschallange.TestDto
import com.surfshop.service.waterlevel.TestServiceApi
import org.springframework.web.bind.annotation.RestController

@RestController
class TestService : TestServiceApi {
    override fun getTest(): TestDto {
        return TestDto(123);
    }
}