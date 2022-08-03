package cn.rcime.web;

import org.springframework.web.bind.annotation.*;

@RestController

public class DemoController {

    @GetMapping("/a")
    public String getA(@RequestParam(value = "v", defaultValue = "no value") String v) {
        return "get:"+v;
    }

    @PostMapping("/a")
    public String postA(@RequestParam(value = "v", defaultValue = "no value") String v,
                        @RequestBody(required = false) String body) {
        return "post:"+v+", body:"+body;
    }

    @PutMapping("/a")
    public String putA(@RequestParam(value = "v", defaultValue = "no value") String v,
                       @RequestBody(required = false) String body) {
        return "put:"+v+", body:"+body;
    }
}
