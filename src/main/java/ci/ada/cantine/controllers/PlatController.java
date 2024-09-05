package ci.ada.cantine.controllers;


import ci.ada.cantine.services.PlatService;


import ci.ada.cantine.services.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/plats")
public class PlatController {

    public final PlatService platService;

    @GetMapping
    public String showPlatPage(Model model){

        final List<PlatDTO> finalPlat = platService.findAll();
        model.addAttribute("plats", finalPlat);
        model.addAttribute("plat", new PlatDTO());

        long platCount = platService.countPlat();
        model.addAttribute("platCount", platCount);


        return "plats/plats";
    }

    @GetMapping("/formPlat")
    public String showFormMenu(Model model){

        model.addAttribute("plat", new PlatDTO());
        return "forms/formPlat";
    }

    @PostMapping
    public String savePlat(Model model,PlatDTO platDTO){
        log.debug("Request to save plat");
        platService.save(platDTO);
        model.addAttribute("message", "Plat ajouté avec succès!");

        return "redirect:/plats/formPlat";
    }

    @GetMapping("/delete/{id}")
    public String deletePlat(@PathVariable("id") Long id, Model model){
        platService.delete(id);
        model.addAttribute("message", "Plat supprimé avec succès!");

        return "redirect:/plats";
    }

}
