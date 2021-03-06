package com.example.webdbs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "DuAnBDS")
public class DuAnBDS {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer Id;

	@Column
	private String tenDuAn;
	
	@Column
	private String moTa;

	@Column(name = "linkImage", columnDefinition = "varchar(MAX)")
	private String linkImage;
	
	@Transient
	private MultipartFile file;
	
	@Column
	private boolean flagDelete = false;
}
