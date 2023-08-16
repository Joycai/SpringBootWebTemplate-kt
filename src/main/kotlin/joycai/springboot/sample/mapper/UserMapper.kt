package joycai.springboot.sample.mapper

import joycai.springboot.sample.bean.User
import joycai.springboot.sample.bean.UserDTO
import joycai.springboot.sample.db.UserPO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface UserMapper {

    fun toPO(user: User): UserPO
    fun toBO(po: UserPO): User
    fun toDTO(user: User): UserDTO

    fun fromDTO(userDTO: UserDTO): User
}