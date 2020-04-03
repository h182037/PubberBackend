package backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final Calculator cal = new Calculator();

    @GetMapping("/getBeers")
    public int getBeers(){
        return cal.getNum_beers();
    }
}
