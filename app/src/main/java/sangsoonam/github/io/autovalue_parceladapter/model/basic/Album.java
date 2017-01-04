package sangsoonam.github.io.autovalue_parceladapter.model.basic;

public class Album {

    private String mTitle;
    private String mArtist;
    private String mDescription;
    private String mImage;

    public Album(String title, String artist, String description, String image) {
        mTitle = title;
        mArtist = artist;
        mDescription = description;
        mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getImage() {
        return mImage;
    }
}
