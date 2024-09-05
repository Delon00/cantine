package ci.ada.cantine.controllers;

import ci.ada.cantine.models.Menu;
import ci.ada.cantine.services.MenuService;
import ci.ada.cantine.services.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/menus")
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public String showMenuPage(Model model){

        final List<MenuDTO> finalMenu = menuService.findAll();
        model.addAttribute("menus", finalMenu);
        model.addAttribute("menu", new MenuDTO());

        long menuCount = menuService.countMenu();
        model.addAttribute("countMenu", menuCount);

        return "menu/menus";
    }

    @GetMapping("/formMenu")
    public String showFormMenu(Model model){

        model.addAttribute("menu", new MenuDTO());
        return "forms/formMenu";
    }
}
