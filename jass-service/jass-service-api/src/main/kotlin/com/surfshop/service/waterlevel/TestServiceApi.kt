package com.surfshop.service.waterlevel

import ch.zuehlke.jasschallange.TestDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "test")
interface TestServiceApi {

    @GetMapping("/test")
    fun getTest(): TestDto

}
