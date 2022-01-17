package com.example.gitflows;

public class DataLoader {
    private String buttonData, topText, bottomText;

    DataLoader(){

    }

    DataLoader(String buttonData, String topText, String bottomText){
        this.buttonData=buttonData;
        this.topText= topText;
        this.bottomText=bottomText;
    }

    public String getButtonData() {
        return buttonData;
    }

    public void setButtonData(String buttonData) {
        this.buttonData = buttonData;
    }

    public String getTopText() {
        return topText;
    }

    public void setTopText(String topText) {
        this.topText = topText;
    }

    public String getBottomText() {
        return bottomText;
    }

    public void setBottomText(String bottomText) {
        this.bottomText = bottomText;
    }
}
