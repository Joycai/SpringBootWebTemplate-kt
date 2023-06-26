package joycai.springboot.sample.mapper

import joycai.springboot.sample.bean.User
import joycai.springboot.sample.db.UserPO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface UserMapper {

    fun toPO(user: User): UserPO
    fun toDTO(po: UserPO): User
}