package com.gap.scms.domain;

public class GarmentType {
    private final Integer id;
    private final String description;

    public static GarmentType garmentType(Integer id, String description) {
        return new GarmentType(id, description);
    }

    public GarmentType(Integer id, String description) {
        this.id = id;
        this.description = description;
    }
}
