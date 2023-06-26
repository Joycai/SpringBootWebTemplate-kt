package joycai.springboot.sample.service

import org.apache.catalina.User

interface UserManager {

    fun login(user: User)
    fun loginOut(user: User)
}