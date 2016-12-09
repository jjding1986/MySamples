package com.dingjinjin.demo.controller;

import com.dingjinjin.demo.bean.Cat;
import com.dingjinjin.demo.bean.Dog;
import com.dingjinjin.demo.manager.ICatManager;
import com.dingjinjin.demo.manager.IDogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController extends BaseController {
    @Autowired
    private ICatManager catManager;

    @Autowired
    private IDogManager dogManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("cat", catManager.getCat());
        model.addAttribute("dog", dogManager.getDog());
        return "index";
    }

    @RequestMapping(value = "/getCat")
    @ResponseBody
    public Cat getCat() {
        return catManager.getCat();
    }

    @RequestMapping(value = "/getDog")
    @ResponseBody
    public Dog getDog() {
        return dogManager.getDog();
    }
}
