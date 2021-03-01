package com.example.stock.service;


import com.example.stock.bean.CommentaireStatus;
import com.example.stock.dao.CommentaireStatusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentaireStatusService {
	
    @Autowired
    private CommentaireStatusDao commentaireStatusDao;

    public CommentaireStatus findByCodeStatus(String codeStatus) {
        return commentaireStatusDao.findByCodeStatus(codeStatus);
    }
    
    public List<CommentaireStatus> findByLoginUser(String loginUser) {
		return commentaireStatusDao.findByLoginUser(loginUser);
	}

    @Transactional
    public int deleteByCodeStatus(String codeStatus) {
        return commentaireStatusDao.deleteByCodeStatus(codeStatus);
    }
    
	public List<CommentaireStatus> findAll() {
        return commentaireStatusDao.findAll();
    }

    public int save(CommentaireStatus commentaireStatus) {
        if (findByCodeStatus(commentaireStatus.getCodeStatus()) != null) {
            return -1;
        } else {
            commentaireStatusDao.save(commentaireStatus);
            return 1;
        }
    }

}