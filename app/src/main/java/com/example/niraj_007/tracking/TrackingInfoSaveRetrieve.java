package com.example.niraj_007.tracking;

class TrackingInfoSaveRetrieve {

    private String ownerUID;
    private String customerUID;
    private String driverUID;
    private String tripID;
    private double latitude;
    private double longitude;
    private String extraAttr;

    public TrackingInfoSaveRetrieve(){

    }

    public TrackingInfoSaveRetrieve(String ownerUID,String customerUID, String driverUID, String tripID, double latitude, double longitude,String extraAttr) {
        this.ownerUID = ownerUID;
        this.customerUID = customerUID;
        this.driverUID = driverUID;
        this.tripID = tripID;
        this.latitude = latitude;
        this.longitude = longitude;
        this.extraAttr = extraAttr;
    }

    public String getOwnerUID() {
        return ownerUID;
    }

    public void setOwnerUID(String ownerUID) {
        this.ownerUID = ownerUID;
    }

    public String getCustomerUID() {
        return customerUID;
    }

    public void setCustomerUID(String customerUID) {
        this.customerUID = customerUID;
    }

    public String getDriverUID() {
        return driverUID;
    }

    public void setDriverUID(String driverUID) {
        this.driverUID = driverUID;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getExtraAttr() {
        return extraAttr;
    }

    public void setExtraAttr(String extraAttr) {
        this.extraAttr = extraAttr;
    }
}
