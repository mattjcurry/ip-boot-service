package com.mattjcurry.dns;

/**
 * Created by mcurx on 11/11/16.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class DnsController {



    @RequestMapping("/dns")
    public DnsRecord greeting() {
        RestTemplate restTemplate = new RestTemplate();
        IpAddress ipAddress = restTemplate.getForObject("https://api.ipify.org?format=json", IpAddress.class);
        DnsRecord record = restTemplate.getForObject("http://ip-api.com/json/" + ipAddress.getIp(), DnsRecord.class);

        return record;
    }
}
