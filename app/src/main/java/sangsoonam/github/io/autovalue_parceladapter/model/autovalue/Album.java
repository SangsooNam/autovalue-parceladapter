package sangsoonam.github.io.autovalue_parceladapter.model.autovalue;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Album {

    public abstract String title();
    public abstract String artist();
    public abstract String description();
    public abstract String image();

    public static Album create(String title, String artist, String description, String image) {
        return new AutoValue_Album(title, artist, description, image);
    }
}
