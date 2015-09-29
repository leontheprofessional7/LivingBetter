package tek.first.livingbetter.habit.model;

/**
 * Created by HAN KE on 2015/8/29.
 */
public class InfoCollectedModel {
    private String name;
    private float rating;
    private int number_comment;
    private String category;
    private String imageUrl;
    private String snippet_text;
    private String address;
    private String phone_number;
    private String mobile_url;
    private double distance;
    private double latitude;
    private double longtitude;

    public InfoCollectedModel(String name, float rating, int number_comment, String category, String imageUrl, String snippet_text, String address, String phone_number, String mobile_url, double distance, double latitude, double longtitude) {
        this.name = name;
        this.rating = rating;
        this.number_comment = number_comment;
        this.category = category;
        this.imageUrl = imageUrl;
        this.snippet_text = snippet_text;
        this.address = address;
        this.phone_number = phone_number;
        this.mobile_url = mobile_url;
        this.distance = distance;
        this.latitude = latitude;
        this.longtitude=longtitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getNumber_comment() {
        return number_comment;
    }

    public void setNumber_comment(int number_comment) {
        this.number_comment = number_comment;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSnippet_text() {
        return snippet_text;
    }

    public void setSnippet_text(String snippet_text) {
        this.snippet_text = snippet_text;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    public double getLatitude() {
        return latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }
}
