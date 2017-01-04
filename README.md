# AutoValue, Parcelable and ParcelAdapter

This repository contains examples of AutoValue, Parcelable and ParcelAdapter. For Android, Parcelable is introduced to store data efficiently. AutoValue parcel extension allows you to implement Parcelable easily. By default, parcel extension uses generic methods such as `writeList` or `writeParcelable`. That is okay but it writes a full class path information to construct an object later. There are type specific methods, `writeTypedList` and `writeTypedObject`. By using those methods, you can store the data much smaller. For example, 344 bytes vs 44 bytes for the same data. Run unit tests if you want to see. `@ParcelAdapter` allows us to use those type specfic methods. 

Check this post. http://sangsoonam.github.io/2017/01/01/autovalue-parceladapter.html
