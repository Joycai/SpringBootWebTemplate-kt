package joycai.springboot.sample.controller

import joycai.springboot.sample.bean.User
import joycai.springboot.sample.service.UserManager
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
        val userManager: UserManager
) {

    @GetMapping(path = ["hello"])
    fun hello(): ResponseEntity<Any> {
        return ResponseEntity.ok("ok")
    }

    @PostMapping("printUser")
    fun printUser(@RequestBody user: User): ResponseEntity<Any> {
        println(user)
        return ResponseEntity.ok(user)
    }
}