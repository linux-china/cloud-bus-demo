package org.mvnsearch.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user controller
 *
 * @author linux_china
 */
@RequestMapping("/user")
@RestController
@RefreshScope
public class UserController {
    @Value("${user.nick}")
    private String nick;

    @RequestMapping("/show")
    public String show() {
        return nick;
    }
}
