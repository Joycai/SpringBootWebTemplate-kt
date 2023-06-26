package joycai.springboot.sample.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping(path = ["hello"])
    fun hello(): ResponseEntity<Any> {
        return ResponseEntity.ok("ok")
    }
}