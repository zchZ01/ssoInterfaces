package com.share.sso.interfaces.model;

import java.io.Serializable;

/**
 * @类名称：UserDO
 * @类描述：TODO
 * @日期：2019年9月9日
 * @版本：V1.0
 */
public class UserModel implements Serializable {

    /**
     * @字段名：serialVersionUID
     * @字段描述：{todo}
     */
    private static final long serialVersionUID = 2604384087801840403L;

    private Long id;
    private String name;
    private String password;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserModel() {
        super();

    }
    public UserModel(Long id, String name, String password) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
