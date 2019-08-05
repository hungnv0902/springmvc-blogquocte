package com.codegym.controller;

        import com.codegym.model.Credential;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.servlet.ModelAndView;

@Controller
public class I18nController {
    private Credential credential;

    @GetMapping("/")
    public ModelAndView login() {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("credential",credential);
        return modelAndView;
    }


}
