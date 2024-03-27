package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
public class CarsController {
    private CarsService carsService = new CarsService();

    @GetMapping("/cars")
    public String getCars(@RequestParam(required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carsService.getCars(count));
        return "cars_mod";
    }
}
