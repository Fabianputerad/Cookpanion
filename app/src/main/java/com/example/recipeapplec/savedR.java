package com.example.recipeapplec;

public class savedR {

    String foodname, foodDesc, calorie, image;
    String uid;

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public savedR(String foodname, String foodDesc, String calorie, String image, String id) {
        this.foodname = foodname;
        this.foodDesc = foodDesc;
        this.calorie = calorie;
        this.image = image;
        this.uid = id;
    }
}
