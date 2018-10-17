package com.gt.mymagicboxapp;

/**
 * Time:{DATE}
 * Author:Gaodi.
 * Description:
 */
class GridItem {

    private String name = "";
    private Integer imgRes;
    private int messageCount;
    private int normalColor;
    private int focusedColor;

    public int getFocusedColor() {
        return focusedColor;
    }

    public void setFocusedColor(int focusedColor) {
        this.focusedColor = focusedColor;
    }

    public int getNormalColor() {
        return normalColor;
    }

    public void setNormalColor(int normalColor) {
        this.normalColor = normalColor;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    public String getName() {
        return name;
    }

    public Integer getImgRes() {
        return imgRes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgRes(Integer imgRes) {
        this.imgRes = imgRes;
    }
}
