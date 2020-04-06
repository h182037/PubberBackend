package backend;

import model.Bar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class CalculatorController {
    private final Calculator cal = new Calculator();

    @GetMapping("/calculate")
    public Bar calculate(){
        if(cal.getBarlist().isEmpty())
            cal.addDummies();
        ArrayList<Bar> bars = new ArrayList<Bar>();
        bars = cal.calculate(4, 300);
        return bars.get(0);
    }
}
