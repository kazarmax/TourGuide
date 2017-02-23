package com.example.android.tourguide;

public class Tour {

    private final String mName;
    private final String mShortDescription;
    private final String mAddress;
    private final String mPhone;
    private final String mMetro;
    private final int mImageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Tour(final String name, final String shortDescription, final String address,
               final String phone, final String metro, final int imageResourceId) {
        this.mName = name;
        this.mShortDescription = shortDescription;
        this.mAddress = address;
        this.mPhone = phone;
        this.mMetro = metro;
        this.mImageResourceId = imageResourceId;
    }

    public Tour(final String name, final String shortDescription, final String address,
                final String phone, final String metro) {
        this(name, shortDescription, address, phone, metro, NO_IMAGE_PROVIDED);
    }

    public String getName() {
        return mName;
    }

    public String getShortDescription() {
        return mShortDescription;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getMetro() {
        return mMetro;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "mName='" + mName + '\'' +
                ", mShortDescription='" + mShortDescription + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mMetro='" + mMetro + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

}
