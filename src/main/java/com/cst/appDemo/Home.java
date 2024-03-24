package com.cst.appDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    private static Logger logger = LoggerFactory.getLogger(Home.class);

    @RequestMapping("/")
    public String index() {
        logger.info("An INFO Message");
        return "info logs";
    }

    @RequestMapping("home")
    public String indexError() {
        logger.error("An ERROR Message");

        return "error logs";
    }


}
