package peaksoft.repository;

import peaksoft.entities.Region;

import java.util.List;

public interface RegionRe {

    String saveRegion(Region region);
    List<Region> getAllRegions();
    String updateRegion(Long regId, Region region);
}
