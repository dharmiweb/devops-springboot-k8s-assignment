@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Spring Boot is running inside Docker 🚀";
    }
}