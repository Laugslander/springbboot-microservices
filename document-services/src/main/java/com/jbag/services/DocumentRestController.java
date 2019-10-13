package com.jbag.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

@RestController
public class DocumentRestController {

    @Value("${server.port}")
    private String serverPort;

    private RestTemplate restTemplate;

    public DocumentRestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/uglyResponse")
    public ResponseEntity<?> getHello() throws UnknownHostException {
        Properties prop = System.getProperties();
        System.out.println("Het werkt: " + " " + InetAddress.getLocalHost().getCanonicalHostName() + " -> " + prop.get("server.port") + " or " + serverPort);
        return new ResponseEntity<>("Het werkt: " + " " + InetAddress.getLocalHost().getCanonicalHostName() + " -> " + prop.get("server.port") + " or " + serverPort, HttpStatus.OK);
    }

//    @GetMapping("/useOtherService")
//    public ResponseEntity<String> storeDocument() {
//        ResponseEntity<Dossier> forEntity = restTemplate.getForEntity("http://DOSSIER-SERVICES/id", Dossier.class);
//
//        return new ResponseEntity<>(forEntity.toString(), HttpStatus.CREATED);
//    }

    @GetMapping("/demo")
    public ResponseEntity<String> getDemoHtml(@RequestParam(defaultValue = "orange") String color) throws UnknownHostException {
        System.out.println("Het werkt: " + " " + InetAddress.getLocalHost().getCanonicalHostName() + " -> " + serverPort);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<htmll>\n" +
                "<body style=\"background-color:");
        stringBuilder.append(color);
        stringBuilder.append(";\">\n" +
                "<h1>This is a testpage!!!</h1>\n" +
                "<h1>HOSTNAME: \t");
        stringBuilder.append(InetAddress.getLocalHost().getCanonicalHostName());
        stringBuilder.append("</h1>\n" +
                "</body>\n" +
                "</html>");
        return new ResponseEntity<>(stringBuilder.toString(), HttpStatus.CREATED);
    }
}

