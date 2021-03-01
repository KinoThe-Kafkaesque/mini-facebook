package com.example.stock.dao;


import com.example.stock.bean.CommentaireStatus;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentaireStatusDao extends JpaRepository<CommentaireStatus, Long> {

    CommentaireStatus findByCodeStatus(String codeStatus);
    
    List<CommentaireStatus> findByLoginUser(String loginUser);

    int deleteByCodeStatus(String codeStatus);


}