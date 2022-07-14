package rest.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spring-rest-api")
public class SpringRestController {

    @GetMapping("/message")
    public ResponseEntity<String> getRestAPIMessage() {
        return new ResponseEntity<>("Response message", HttpStatus.OK);
    }
}
