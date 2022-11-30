package uia.uia.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import uia.uia.model.Users;

import java.util.List;

@Mapper
public interface UsersMapper {
    @Select("select * from alumnos")
    List<Users> findAll();
}
