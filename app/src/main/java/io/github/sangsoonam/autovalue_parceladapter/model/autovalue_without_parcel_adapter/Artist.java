package io.github.sangsoonam.autovalue_parceladapter.model.autovalue_without_parcel_adapter;

import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Artist implements Parcelable {

    @NonNull public abstract String name();

    public static Artist create(String name) {
        return new AutoValue_Artist(name);
    }
}
