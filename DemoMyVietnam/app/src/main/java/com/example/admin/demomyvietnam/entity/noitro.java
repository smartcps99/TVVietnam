package com.example.admin.demomyvietnam.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class noitro implements Parcelable {
    private int id;
    private String tentro;
    private String giatro;
    private String diachi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTentro() {
        return tentro;
    }

    public void setTentro(String tentro) {
        this.tentro = tentro;
    }

    public String getGiatro() {
        return giatro;
    }

    public void setGiatro(String giatro) {
        this.giatro = giatro;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public static Creator<noitro> getCREATOR() {
        return CREATOR;
    }

    public noitro(int id, String tentro, String giatro, String diachi) {
        this.id = id;
        this.tentro = tentro;
        this.giatro = giatro;
        this.diachi = diachi;
    }

    protected noitro(Parcel in) {
        id = in.readInt();
        tentro = in.readString();
        giatro = in.readString();
        diachi = in.readString();
    }

    public static final Creator<noitro> CREATOR = new Creator<noitro>() {
        @Override
        public noitro createFromParcel(Parcel in) {
            return new noitro(in);
        }

        @Override
        public noitro[] newArray(int size) {
            return new noitro[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(tentro);
        dest.writeString(giatro);
        dest.writeString(diachi);
    }
}
