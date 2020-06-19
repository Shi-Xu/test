package com.xt.feedback.common.base;

public enum FbQtype {
	SINGLE((byte)1,"单选题"),MULTIPLE((byte)2,"多选提");
	
	private String name;
	private byte qtypeId;
	
	private FbQtype(byte qtypeId,String name) {
		this.name=name;
		this.qtypeId=qtypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getQtypeId() {
		return qtypeId;
	}

	public void setQtypeId(byte qtypeId) {
		this.qtypeId = qtypeId;
	}
	
}
