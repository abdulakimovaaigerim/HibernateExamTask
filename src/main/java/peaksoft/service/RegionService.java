package peaksoft.service;

import peaksoft.entities.Region;

import java.util.List;

public interface RegionService {
    String saveRegion(Region region);

    List<Region> getAllRegions();

    String updateRegion(Long regId, Region region);
}
