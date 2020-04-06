package backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final Calculator cal = new Calculator();

    @GetMapping("/calculate")
    public int calculate(){
        if(cal.getBarlist().isEmpty())
            cal.addDummies();

        return cal.calculate(4, 300);
    }
}
