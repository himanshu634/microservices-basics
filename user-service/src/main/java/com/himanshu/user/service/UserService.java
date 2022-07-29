package com.himanshu.user.service;

import com.himanshu.user.VO.Department;
import com.himanshu.user.VO.ResponseTemplateVO;
import com.himanshu.user.entity.User;
import com.himanshu.user.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user){
        log.info("In saveUser method of userService");
        return userRepository.save(user);
    }

    public User getUserByUserId(Long id){
        log.info("In get user method of user service class");
        return userRepository.findByUserId(id);
    }

    public ResponseTemplateVO getUserWithDepartment(Long id){
        log.info("in get user with department method of user service class");
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        User user = userRepository.findByUserId(id);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/get/" + user.getDepartmentId(),
                Department.class);

        responseTemplateVO.setDepartment(department);
        responseTemplateVO.setUser(user);
        return  responseTemplateVO;
    }
}
