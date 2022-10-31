package com.libFirstApi.Lib.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Token {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tokenId;
	private String tokenNum;
	public Token() {
		
	}
	
	public Token(Long tokenId, String tokenNum) {
		super();
		this.tokenId = tokenId;
		this.tokenNum = tokenNum;
	}
	

	public Long getTokenId() {
		return tokenId;
	}
	public void setTokenId(Long tokenId) {
		this.tokenId = tokenId;
	}
	public String getTokenNum() {
		return tokenNum;
	}
	public void setTokenNum(String tokenNum) {
		this.tokenNum = tokenNum;
	}
	@Override
	public String toString() {
		return "Token [tokenId=" + tokenId + ", tokenNum=" + tokenNum + "]";
	}
	
}
