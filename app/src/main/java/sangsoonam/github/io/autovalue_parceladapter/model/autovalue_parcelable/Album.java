package sangsoonam.github.io.autovalue_parceladapter.model.autovalue_parcelable;

import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Album implements Parcelable {

    @NonNull public abstract String title();
    @NonNull public abstract String artist();
    @Nullable public abstract String description();
    @NonNull public abstract String image();

    public static Album create(String title, String artist, String description, String image) {
        return new AutoValue_Album(title, artist, description, image);
    }
}