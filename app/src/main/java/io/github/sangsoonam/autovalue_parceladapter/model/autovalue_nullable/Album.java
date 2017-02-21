package io.github.sangsoonam.autovalue_parceladapter.model.autovalue_nullable;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Album {

    @NonNull public abstract String title();
    @NonNull public abstract String artist();
    @Nullable public abstract String description();
    @NonNull public abstract String image();

    public static Album create(String title, String artist, String description, String image) {
        return new AutoValue_Album(title, artist, description, image);
    }
}
