package utils;

public enum SpotStatus {
    AVAILABLE("available"),
    OCCUPIED("occupied"),
    MAINTENANCE("maintenance");
    public final String spotStatus;

    SpotStatus(String spotStatus) {
        this.spotStatus = spotStatus;
    }

    public String getSpotStatus() {
        return spotStatus;
    }
}
