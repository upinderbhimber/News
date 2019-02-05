package upindersingh.news;

/**
 * Created by USB on 25-07-2017.
 */

public class News {

    private String mTitle;
    private String mDescription;
    private String mUrl;
    private String mImageUrl;


    public News(String title,String description,String url,String image){
        mDescription=description;
        mTitle=title;
        mUrl=url;
        mImageUrl=image;
    }
    public String getTitle(){
        return mTitle;
    }
    public String getDescription(){
        return mDescription;
    }
    public String getUrl(){
        return mUrl;
    }
    public String getImage(){return mImageUrl;}
}
