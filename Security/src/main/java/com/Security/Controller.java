package com.Security;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    final PasswordEncoder passwordEncoder;


    @PostMapping("/api/member")
    public String saveMember(@RequestBody User memberDto) {
        String password=passwordEncoder.encode(memberDto.getPassword());
        userRepository.save(User.createUser(memberDto.getId(), password));
        return password;
    }
}
