package uia.uia.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uia.uia.mapper.UsersMapper;
import uia.uia.model.Users;

import java.util.List;


@RestController
@RequestMapping("/rest/users")
public class UsersResource {
    private UsersMapper usersMapper;

    public UsersResource(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return usersMapper.findAll();
    }
}
