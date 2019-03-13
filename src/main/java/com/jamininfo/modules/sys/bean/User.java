package com.jamininfo.modules.sys.bean;

import com.jamininfo.common.persistence.DataEntity;

/**
 * 用户信息
 * @author jamin
 */
public class User extends DataEntity<User>{
	private String id;
	private String version;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
