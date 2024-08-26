package Pojo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Majors {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("MajorPhotoId")
    private String majorPhotoId;

    @JsonProperty("MajorPhoto")
    private Object majorPhoto; // Assuming majorPhoto is complex, using Object. Replace with specific type if known.

    @JsonProperty("NameAr")
    private String nameAr;

    @JsonProperty("NameEn")
    private String nameEn;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("RowVersion")
    private String rowVersion;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("IsActive")
    private String isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajorPhotoId() {
        return majorPhotoId;
    }

    public void setMajorPhotoId(String majorPhotoId) {
        this.majorPhotoId = majorPhotoId;
    }

    public Object getMajorPhoto() {
        return majorPhoto;
    }

    public void setMajorPhoto(Object majorPhoto) {
        this.majorPhoto = majorPhoto;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(String rowVersion) {
        this.rowVersion = rowVersion;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
}
