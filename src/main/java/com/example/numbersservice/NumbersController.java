package com.example.numbersservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/numbers")
public class NumbersController {

    private final NumbersService numbersService;
    private import java.util.List;
                private NumbersService numbersService;

        @GetMapping
        public List<Integer> getNumbers(@RequestParam int n) {
            return numbersService.getNumbersDivisibleByThree(n);
        }
    }

    @Autowired
    public NumbersController(NumbersService numbersService) {
        this.numbersService = numbersService;
    }
}
