package cn.sp.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 2YSP on 2018/4/6.
 */
@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String sex;

}
