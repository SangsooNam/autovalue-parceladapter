package io.github.sangsoonam.autovalue_parceladapter.model.autovalue_parcel_adapter;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;
import com.ryanharter.auto.value.parcel.TypeAdapter;

import java.util.List;

@AutoValue
public abstract class Artist implements Parcelable {

    @NonNull public abstract String name();

    public static Artist create(String name) {
        return new AutoValue_Artist(name);
    }

    public static final class ListTypeAdapter implements TypeAdapter<List<Artist>> {
        @Override
        public List<Artist> fromParcel(Parcel in) {
            return in.createTypedArrayList(new Creator<Artist>() {
                @Override
                public Artist createFromParcel(Parcel source) {
                    return AutoValue_Artist.CREATOR.createFromParcel(source);
                }

                @Override
                public Artist[] newArray(int size) {
                    return new Artist[size];
                }
            });
        }

        @Override
        public void toParcel(List<Artist> value, Parcel dest) {
            dest.writeTypedList(value);
        }
    }
}
