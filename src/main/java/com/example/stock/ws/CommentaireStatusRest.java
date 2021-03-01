package com.example.stock.ws;


import com.example.stock.bean.CommentaireStatus;
import com.example.stock.service.CommentaireStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("projet-mini-facebook/commentaireStatus")
public class CommentaireStatusRest {
	
    @Autowired
    private CommentaireStatusService commentaireStatusService;
	
    @GetMapping("/codeStatus/{codeStatus}")
    public CommentaireStatus findByCodeStatus(@PathVariable String codeStatus) {
        return commentaireStatusService.findByCodeStatus(codeStatus);
    }
    
    @GetMapping("/loginUser/{loginUser}")
    public List<CommentaireStatus> findByLoginUser(String loginUser) {
		return commentaireStatusService.findByLoginUser(loginUser);
	}

	@DeleteMapping("/codeStatus/{codeStatus}")
    public int deleteByCodeStatus(@PathVariable String codeStatus) {
        return commentaireStatusService.deleteByCodeStatus(codeStatus);
    }

    @GetMapping("/commentaireStatus")
    public List<CommentaireStatus> findAll() {
        return commentaireStatusService.findAll();
    }

    @PostMapping("/commentaireStatus")
    public int save(@RequestBody CommentaireStatus commentaireStatus) {
        return commentaireStatusService.save(commentaireStatus);
    }

}