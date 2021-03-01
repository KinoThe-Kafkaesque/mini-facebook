package com.example.stock.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Status implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
		private long id;
		private String code;
		private String loginUserSource;
		private String contenu;
		private long totalJaime;
		private long totalCommentaire;
		private String dateStatus;
	
		@OneToMany (mappedBy = "status" )
		private CommentaireStatus commentaireStatus;
		@ManyToOne 
	    private	User user;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getLoginUserSource() {
			return loginUserSource;
		}
		public void setLoginUserSource(String loginUserSource) {
			this.loginUserSource = loginUserSource;
		}
		public String getContenu() {
			return contenu;
		}
		public void setContenu(String contenu) {
			this.contenu = contenu;
		}
		public long getTotalJaime() {
			return totalJaime;
		}
		public void setTotalJaime(long totalJaime) {
			this.totalJaime = totalJaime;
		}
		public long getTotalCommentaire() {
			return totalCommentaire;
		}
		public void setTotalCommentaire(long totalCommentaire) {
			this.totalCommentaire = totalCommentaire;
		}
		public String getDateStatus() {
			return dateStatus;
		}
		public void setDateStatus(String dateStatus) {
			this.dateStatus = dateStatus;
		}
		public CommentaireStatus getCommentaireStatus() {
			return commentaireStatus;
		}
		public void setCommentaireStatus(CommentaireStatus commentaireStatus) {
			this.commentaireStatus = commentaireStatus;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
	
}
