package com.Jsoup.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;



// 입력
// URL = https://www.twitch.tv/sunbaking/clip/ResilientRealCrabOptimizePrime-BKpnFTJWnUSuvILX
// 예상 결과
// video = https://production.assets.clips.twitchcdn.net/AT-cm%7C961017907.mp4?sig=f0c39f625ef97bde419c4355197b477dcca745ba&token=%7B%22authorization%22%3A%7B%22forbidden%22%3Afalse%2C%22reason%22%3A%22%22%7D%2C%22clip_uri%22%3A%22https%3A%2F%2Fproduction.assets.clips.twitchcdn.net%2FAT-cm%257C961017907.mp4%22%2C%22device_id%22%3A%22xpbeyEFIk62oDNvxTW59daQ8kIT5XwdL%22%2C%22expires%22%3A1626955689%2C%22user_id%22%3A%22%22%2C%22version%22%3A2%7D
// 다운 경로 파싱해서 저장 하면 될듯



public class TestControllerTest {

    @Test
    public void Parsing() throws IOException {
        String blogUrl = "https://www.twitch.tv/sunbaking/clip/ResilientRealCrabOptimizePrime-BKpnFTJWnUSuvILX";
        Document doc = Jsoup.connect(blogUrl).get();
        Elements img = doc.select("div.root-scrollable scrollable-area scrollable-area--suppress-scroll-x");
       // String video = img.attr("src");


        System.out.println(img);
    }
}