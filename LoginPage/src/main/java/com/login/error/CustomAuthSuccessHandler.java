package com.login.error;

import com.login.entity.Repository.ERole;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

public class CustomAuthSuccessHandler implements AuthenticationSuccessHandler {
    private RequestCache requestCache = new HttpSessionRequestCache();
    private RedirectStrategy redirectStratgy = new DefaultRedirectStrategy();
    private final String DEFAULT_LOGIN_SUCCESS_URL = "/home";


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //< clear authentication error
        clearAuthenticationAttributes(request);
        //< redirect page
        redirectStrategy(request, response, authentication);
    }

    ////////////////////////////////////////////////////////////////////////////////
    //< private functions

    private void clearAuthenticationAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if(session != null) {
            session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
        }
    }

    private void redirectStrategy(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //< get the saved request
        SavedRequest savedRequest = requestCache.getRequest(request, response);
        if(savedRequest == null) {
            redirectStratgy.sendRedirect(request, response, DEFAULT_LOGIN_SUCCESS_URL);
        }
        else {
            //< get the authorities
            Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
            if(roles.contains(ERole.ADMIN.getValue())) {
                redirectStratgy.sendRedirect(request, response, "/home/admin");
            }
            else if(roles.contains(ERole.MANAGER.getValue())) {
                redirectStratgy.sendRedirect(request, response, "/home/user");
            }
            else {
                redirectStratgy.sendRedirect(request, response, "/home/guest");
            }
        }
    }
}
