package peaksoft.repository.impl;

import jakarta.persistence.EntityManager;
import peaksoft.config.Config;
import peaksoft.entities.Region;
import peaksoft.repository.RegionRe;

import java.util.List;

public class RegionReImpl implements RegionRe {
    private final EntityManager entityManager = Config.getEntityManager();

    @Override
    public String saveRegion(Region region) {
        entityManager.getTransaction().begin();
        entityManager.persist(region);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "Successfully saved on database";
    }

    @Override
    public List<Region> getAllRegions() {
        entityManager.getTransaction().begin();
        List<Region> regions = entityManager.createQuery("select c from Region c", Region.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();

        return regions;
    }

    @Override
    public String updateRegion(Long regId, Region region) {
        entityManager.getTransaction().begin();
        Region region1 = entityManager.find(Region.class, regId);
        region1.setRegionName(region.getRegionName());
        entityManager.persist(region1);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "Successfully updated";
    }
}
