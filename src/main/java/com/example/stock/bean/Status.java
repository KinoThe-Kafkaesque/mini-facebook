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
		private String loginUserSourceString;
		private String contenu;
		private long totalJaime;
		private long totalCommentaire;
		private String dateStatuString;
	
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
		
		public String getCodeString() {
			return code;
		}
		
		public void setCodeString(String codeString) {
			this.code = codeString;
		}
		
		public String getLoginUserSourceString() {
			return loginUserSourceString;
		}
		
		public void setLoginUserSourceString(String loginUserSourceString) {
			this.loginUserSourceString = loginUserSourceString;
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
		
		public String getDateStatuString() {
			return dateStatuString;
		}
		
		public void setDateStatuString(String dateStatuString) {
			this.dateStatuString = dateStatuString;
		}
		
		@Override
		public String toString() {
			return "Status [id=" + id + ", code=" + code + ", loginUserSourceString="
					+ loginUserSourceString + ", contenu=" + contenu + ", totalJaime=" + totalJaime
					+ ", totalCommentaire=" + totalCommentaire + ", dateStatuString=" + dateStatuString + "]";
		}
		
		public Status() {
			super();
		}
		
		public Status(long id, String codeString, String loginUserSourceString, String contenu, long totalJaime,
				long totalCommentaire, String dateStatuString, String code) {
			super();
			this.id = id;
			this.code = code;
			this.loginUserSourceString = loginUserSourceString;
			this.contenu = contenu;
			this.totalJaime = totalJaime;
			this.totalCommentaire = totalCommentaire;
			this.dateStatuString = dateStatuString;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((code == null) ? 0 : code.hashCode());
			result = prime * result + ((contenu == null) ? 0 : contenu.hashCode());
			result = prime * result + ((dateStatuString == null) ? 0 : dateStatuString.hashCode());
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + ((loginUserSourceString == null) ? 0 : loginUserSourceString.hashCode());
			result = prime * result + (int) (totalCommentaire ^ (totalCommentaire >>> 32));
			result = prime * result + (int) (totalJaime ^ (totalJaime >>> 32));
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Status other = (Status) obj;
			if (code == null) {
				if (other.code != null)
					return false;
			} else if (!code.equals(other.code))
				return false;
			if (contenu == null) {
				if (other.contenu != null)
					return false;
			} else if (!contenu.equals(other.contenu))
				return false;
			if (dateStatuString == null) {
				if (other.dateStatuString != null)
					return false;
			} else if (!dateStatuString.equals(other.dateStatuString))
				return false;
			if (id != other.id)
				return false;
			if (loginUserSourceString == null) {
				if (other.loginUserSourceString != null)
					return false;
			} else if (!loginUserSourceString.equals(other.loginUserSourceString))
				return false;
			if (totalCommentaire != other.totalCommentaire)
				return false;
			if (totalJaime != other.totalJaime)
				return false;
			return true;
		}
		
}
