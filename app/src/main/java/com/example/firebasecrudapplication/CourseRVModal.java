package com.example.firebasecrudapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class CourseRVModal implements Parcelable {
    private String courseName;
    private String courseDes;
    private String coursePrice;
    private String bestSuitedFor;
    private String courseImg;
    private String courseLink;
    private String courseId;


    public String getCourseID(){
        return courseId;
    }
    public String setCourseID(String courseID){
        return courseId;
    }


    public CourseRVModal(){
        //empty constructor
    }

    protected CourseRVModal(Parcel in) {
        courseName = in.readString();
        courseDes = in.readString();
        coursePrice = in.readString();
        bestSuitedFor = in.readString();
        courseImg = in.readString();
        courseLink = in.readString();
        courseId = in.readString();
    }

    public static final Creator<CourseRVModal> CREATOR = new Creator<CourseRVModal>() {
        @Override
        public CourseRVModal createFromParcel(Parcel in) {
            return new CourseRVModal(in);
        }

        @Override
        public CourseRVModal[] newArray(int size) {
            return new CourseRVModal[size];
        }
    };

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDes() {
        return courseDes;
    }

    public void setCourseDes(String courseDes) {
        this.courseDes = courseDes;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getBestSuitedFor() {
        return bestSuitedFor;
    }

    public void setBestSuitedFor(String bestSuitedFor) {
        this.bestSuitedFor = bestSuitedFor;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public String getCourseLink() {
        return courseLink;
    }

    public void setCourseLink(String courseLink) {
        this.courseLink = courseLink;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public CourseRVModal(String courseName, String courseDes, String coursePrice, String bestSuitedFor, String courseImg, String courseLink, String courseId) {
        this.courseName = courseName;
        this.courseDes = courseDes;
        this.coursePrice = coursePrice;
        this.bestSuitedFor = bestSuitedFor;
        this.courseImg = courseImg;
        this.courseLink = courseLink;
        this.courseId = courseId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(courseName);
        parcel.writeString(courseDes);
        parcel.writeString(coursePrice);
        parcel.writeString(bestSuitedFor);
        parcel.writeString(courseImg);
        parcel.writeString(courseLink);
        parcel.writeString(courseId);
    }
}
