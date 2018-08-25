package com.example.easynotes.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public class Note implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2437338333184831857L;

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank
	    private String title;

	    @NotBlank
	    private String content;

	    @Column(nullable = false, updatable = false)
	    @Temporal(TemporalType.TIMESTAMP)
	    @CreatedDate
	    private Calendar createdAt;

	    @Column(nullable = false)
	    @Temporal(TemporalType.TIMESTAMP)
	    @LastModifiedDate
	    private Calendar updatedAt;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		
		public Calendar getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Calendar createdAt) {
			this.createdAt = createdAt;
		}

		public Calendar getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Calendar updatedAt) {
			this.updatedAt = updatedAt;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	
	
}
