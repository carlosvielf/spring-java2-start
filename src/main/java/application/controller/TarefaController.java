package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; // <-- LINHA ADICIONADA

@Controller
@RequestMapping("/tarefas") // Define o prefixo da URL para todos os métodos da classe
public class TarefaController {
    
    @RequestMapping("/list") // Mapeia o endpoint /tarefa/list
    public String list() {
        // Retorna o nome do arquivo de template (ex: list.html)
        return "list"; 
    }
}