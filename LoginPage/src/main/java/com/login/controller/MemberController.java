package com.login.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import com.login.entity.Account;
import com.login.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

    protected Logger log = LoggerFactory.getLogger(this.getClass());
    @Resource(name = "userServiceImpl")
    private UserService userService;


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String createNewUser(Model model, @Valid Account account, BindingResult bindingResult) {
        try {
            //< check the user name already exist or not
            Account userExists = userService.getUserByUsername(account.getUsername());
            if(userExists != null) {
                bindingResult.rejectValue("username", "error.user", "There is already a user registered with the user name provided");
            }

            //< check the password
            if(!account.getPassword().equals(account.getConfirmPassword())) {
                bindingResult.rejectValue("confirmPassword", "error.user", "Password not matched");
            }

            if(bindingResult.hasErrors()) {
                log.error("[ykson] : " + bindingResult.getFieldError().toString());
            }
            else {
                //< save the user information
                userService.setUser(account);

                //< set the user information
                model.addAttribute("user", new Account());
                model.addAttribute("successMessage", "User has been registered successfully");
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            model.addAttribute("successMessage", "FAIL : " + e.getMessage());
        }

        return "/auth/registration";
    }

    /**
     * Common home
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Account account = null;
        try {
            account = userService.getUserByUsername(auth.getName());
        } catch (Exception e) {
            log.error("[ykson]" + e.getMessage());
        }

        model.addAttribute("username", "" + account.getUsername() + "(" + account.getEmail() + ")");
        model.addAttribute("adminMessage", "Content Available Only for Users with Admin Role");

        return "/index";
    }

    @RequestMapping(value = {"/", "/login"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String login(Model model) {
        return "/auth/login";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("account", new Account());
        return "/auth/registration";
    }

    @RequestMapping(value = "/home/admin", method = RequestMethod.GET)
    public String adminHome(Model model) {
        return "/home/admin";
    }


    @RequestMapping(value = "/home/user", method = RequestMethod.GET)
    public String userHome(Model model) {
        return "/home/user";
    }


    @RequestMapping(value = "/home/guest", method = RequestMethod.GET)
    public String guestHome(Model model) {
        return "/home/guest";
    }
}
