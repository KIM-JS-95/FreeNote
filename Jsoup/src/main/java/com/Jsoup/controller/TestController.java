package com.Jsoup.controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;



// https://production.assets.clips.twitchcdn.net/AT-cm%7C961017907.mp4?sig=f0c39f625ef97bde419c4355197b477dcca745ba&token=%7B%22authorization%22%3A%7B%22forbidden%22%3Afalse%2C%22reason%22%3A%22%22%7D%2C%22clip_uri%22%3A%22https%3A%2F%2Fproduction.assets.clips.twitchcdn.net%2FAT-cm%257C961017907.mp4%22%2C%22device_id%22%3A%22xpbeyEFIk62oDNvxTW59daQ8kIT5XwdL%22%2C%22expires%22%3A1626955689%2C%22user_id%22%3A%22%22%2C%22version%22%3A2%7D
// 다운 경로 파싱해서 저장 하면 될듯

@Controller
public class TestController {


}
