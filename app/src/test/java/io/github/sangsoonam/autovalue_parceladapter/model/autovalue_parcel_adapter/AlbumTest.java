package io.github.sangsoonam.autovalue_parceladapter.model.autovalue_parcel_adapter;

import android.os.Parcel;

import com.google.common.collect.Lists;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class AlbumTest {

    @Test
    public void testAlbum() throws Exception {
        final Album album = Album.create(
            "TITLE",
            Lists.newArrayList(
                Artist.create("A"),
                Artist.create("B"),
                Artist.create("C")
            ),
            "DESCRIPTION",
            "IMAGE"
        );
        Parcel parcel = Parcel.obtain();
        int beforeSize = parcel.dataSize();
        album.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);
        int afterSize = parcel.dataSize();

        final Album newAlbum = AutoValue_Album.CREATOR.createFromParcel(parcel);
        assertEquals(album, newAlbum);
        assertEquals(beforeSize, afterSize);
    }

    @Test
    public void testAlbumData() throws Exception {
        final Album album = Album.create(
            "TITLE",
            Lists.newArrayList(
                Artist.create("A"),
                Artist.create("B"),
                Artist.create("C")
            ),
            "DESCRIPTION",
            "IMAGE"
        );
        Parcel parcel = Parcel.obtain();
        album.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);
        String data = new String(parcel.marshall(), "UTF-8");
        assertEquals(data, "");
    }
}