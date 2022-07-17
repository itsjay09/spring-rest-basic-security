package rest.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest-resources")
public class SpringRestController {

    @GetMapping("/user")
    public ResponseEntity<String> getUserMessage() {
        return new ResponseEntity<>("Response message from user", HttpStatus.OK);
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdminMessage() {
        return new ResponseEntity<>("Response message from admin", HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<String> getDefaultMessage() {
        return new ResponseEntity<>("Default Response message", HttpStatus.OK);
    }
}
