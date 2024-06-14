package com.ong.api.DTOs;

import java.util.List;

public class ReqBodyPresenca {
    List<Long> arrayId;

    public ReqBodyPresenca(List<Long> arrayId) {
        this.arrayId = arrayId;
    }
    public ReqBodyPresenca() {

    }

    public List<Long> getArrayId() {
        return arrayId;
    }

    public void setArrayId(List<Long> arrayId) {
        this.arrayId = arrayId;
    }
}
