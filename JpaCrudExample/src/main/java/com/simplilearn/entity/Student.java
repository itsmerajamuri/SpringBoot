package com.simplilearn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="studenttable123")
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="studentId")
	int studentId;
	
	String studentName;
	
	String studentEmail;
	
	int studentAge;

}
