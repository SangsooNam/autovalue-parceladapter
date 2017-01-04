package sangsoonam.github.io.autovalue_parceladapter.model.autovalue_parcel_adapter;

import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.ryanharter.auto.value.parcel.ParcelAdapter;

import java.util.List;

@AutoValue
public abstract class Album implements Parcelable {

    @NonNull public abstract String title();
    @ParcelAdapter(Artist.ListTypeAdapter.class)
    @NonNull public abstract List<Artist> artists();
    @Nullable public abstract String description();
    @NonNull public abstract String image();

    public static Album create(String title, List<Artist> artists, String description, String image) {
        return new AutoValue_Album(title, artists, description, image);
    }
}
