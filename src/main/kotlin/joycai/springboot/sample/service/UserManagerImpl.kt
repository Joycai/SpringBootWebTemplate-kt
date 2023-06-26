package joycai.springboot.sample.service

import org.apache.catalina.User
import org.springframework.stereotype.Component

@Component("UserManager")
class UserManagerImpl : UserManager {
    override fun login(user: User) {
        TODO("Not yet implemented")
    }

    override fun loginOut(user: User) {
        TODO("Not yet implemented")
    }
}