package com.Security;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@RequiredArgsConstructor
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    final PasswordEncoder passwordEncoder;

    // home page
    @RequestMapping("/")
    public String homePage() {

        return "home-page";
    }

    @PostMapping("/api/member")
    public String saveMember(@RequestBody User memberDto) {
        String password=passwordEncoder.encode(memberDto.getPassword());
        userRepository.save(User.createUser(memberDto.getId(), password));
        return password;
    }
}
