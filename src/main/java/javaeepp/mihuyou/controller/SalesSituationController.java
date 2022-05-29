package javaeepp.mihuyou.controller;

import javaeepp.mihuyou.entity.SalesSituation;
import javaeepp.mihuyou.service.SalesSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SalesSituationController {
    @Autowired
    SalesSituationService salesSituationService;
    @RequestMapping("yearSold")
    public String YearSoldSit(Model model){
        List<SalesSituation> salesSituations = salesSituationService.getYear();
        model.addAttribute("GoodsSold",salesSituations);
        return "ShowYearsSaleSituation";
    }
    @RequestMapping("monthSold")
    public String monthSold(Model model){
        List<SalesSituation> salesSituationsMon = salesSituationService.getMon();
        model.addAttribute("GoodsSoldMon",salesSituationsMon);
        return "ShowMonSaleSituation";
    }

    @RequestMapping("daySold")
    public String daySold(Model model){
        List<SalesSituation> salesSituationsDay = salesSituationService.getDay();
        model.addAttribute("GoodsSoldDay",salesSituationsDay);
        return "ShowDaySaleSituation";
    }
}
