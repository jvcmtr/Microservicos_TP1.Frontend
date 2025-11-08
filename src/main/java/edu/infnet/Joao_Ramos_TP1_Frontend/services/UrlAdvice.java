package edu.infnet.Joao_Ramos_TP1_Frontend.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import io.micrometer.common.util.StringUtils;
import jakarta.annotation.PostConstruct;


@ControllerAdvice
public class UrlAdvice {

    @Value("${Frontend.url}")
    private String FrontEndUrl;


    @ModelAttribute("URL")
    public String rootPath() {
        return FrontEndUrl.replaceAll("/+$", "");
    }
}