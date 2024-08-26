package Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceProviderUserQulification {
    @JsonProperty("EducationLevelId")
    private int educationLevelId;

    @JsonProperty("EducationLevelName")
    private String educationLevelName;

    @JsonProperty("InsituteName")
    private String instituteName;

    @JsonProperty("MajorTxt")
    private String majorTxt;

    @JsonProperty("Id")
    private int id;

    @JsonProperty("RowVersion")
    private String rowVersion;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("IsActive")
    private boolean isActive;

    public int getEducationLevelId() {
        return educationLevelId;
    }

    public void setEducationLevelId(int educationLevelId) {
        this.educationLevelId = educationLevelId;
    }

    public String getEducationLevelName() {
        return educationLevelName;
    }

    public void setEducationLevelName(String educationLevelName) {
        this.educationLevelName = educationLevelName;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getMajorTxt() {
        return majorTxt;
    }

    public void setMajorTxt(String majorTxt) {
        this.majorTxt = majorTxt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
