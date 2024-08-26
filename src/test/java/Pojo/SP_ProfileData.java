package Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class SP_ProfileData {

    @JsonProperty("ProfilePhotoId")
    private String profilePhotoId;

    @JsonProperty("ProfilePhoto")
    private UserProfilePhoto profilePhoto;

    @JsonProperty("ProfileVideoId")
    private String ProfileVideoId;

    @JsonProperty("ProfileVideo")
    private  ProfileVideo profileVideo;

    @JsonProperty("Bio")
    private String bio;

    @JsonProperty("NationalityId")
    private String nationalityId;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Gender")
    private String gender;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("FirstNameAr")
    private String firstNameAr;

    @JsonProperty("FirstNameEn")
    private String firstNameEn;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("LastNameAr")
    private String lastNameAr;

    @JsonProperty("LastNameEn")
    private String lastNameEn;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("FullName")
    private String fullName;

    @JsonProperty("FullNameAr")
    private String fullNameAr;

    @JsonProperty("FullNameEn")
    private String fullNameEn;

    @JsonProperty("NationalID")
    private String nationalID;

    @JsonProperty("ResidenceCountryId")
    private String residenceCountryId;

    @JsonProperty("UserApprovalStatus")
    private String userApprovalStatus;

    @JsonProperty("CityId")
    private String cityId;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("MobileNumber")
    private String mobileNumber;

    @JsonProperty("BankName")
    private String bankName;

    @JsonProperty("IBAN")
    private String iban;

    @JsonProperty("SwiftNumber")
    private String swiftNumber;

    @JsonProperty("ServiceProviderUserQulification")
    private List<ServiceProviderUserQulification> serviceProviderUserQualification;

    @JsonProperty("Majors")
    private List<Majors> majors;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("PriceConsultationSession30")
    private String priceConsultationSession30;

    @JsonProperty("PriceTreatmentSession30")
    private String priceTreatmentSession30;

    @JsonProperty("PriceConsultationSession45")
    private String priceConsultationSession45;

    @JsonProperty("PriceTreatmentSession45")
    private String priceTreatmentSession45;

    @JsonProperty("PriceConsultationSession60")
    private String priceConsultationSession60;

    @JsonProperty("PriceTreatmentSession60")
    private String priceTreatmentSession60;

    @JsonProperty("CVId")
    private String cvId;

    @JsonProperty("CV")
    private CV cv;

    @JsonProperty("PhoneKeyId")
    private String phoneKeyId;

    @JsonProperty("Certificates")
    private List<Object> certificates;

    @JsonProperty("NationalityName")
    private String nationalityName;

    @JsonProperty("ResidenceCountryName")
    private String residenceCountryName;

    @JsonProperty("CityName")
    private String cityName;

    @JsonProperty("EducationLevelName")
    private String educationLevelName;

    @JsonProperty("ProvidedServiceName")
    private List<ProvidedServiceName> providedServiceName;

    @JsonProperty("MajorName")
    private String majorName;

    @JsonProperty("Occupation")
    private String occupation;

    @JsonProperty("RejectReason")
    private String rejectReason;

    @JsonProperty("ServiceProviderName")
    private String serviceProviderName;

    @JsonProperty("CreatedDate")
    private String createdDate;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("CityOther")
    private String cityOther;

    @JsonProperty("IsChooseCityOther")
    private boolean isChooseCityOther;

    @JsonProperty("SessionType")
    private String sessionType;

    @JsonProperty("AddedBy")
    private String addedBy;

    @JsonProperty("UserType")
    private String userType;

    @JsonProperty("IsTreatmentSession")
    private String isTreatmentSession;

    @JsonProperty("IsConsultationSession")
    private String isConsultationSession;

    @JsonProperty("Latitude")
    private String latitude;

    @JsonProperty("Longitude")
    private String longitude;

    @JsonProperty("Rate")
    private double rate;

    @JsonProperty("RateData")
    private String rateData;

    @JsonProperty("RateDetail")
    private String rateDetail;

    @JsonProperty("ServiceProviderTitle")
    private String serviceProviderTitle;

    @JsonProperty("ServiceProviderTitleAr")
    private String serviceProviderTitleAr;

    @JsonProperty("ServiceProviderTitleEn")
    private String serviceProviderTitleEn;

    @JsonProperty("ServiceProviderTitleId")
    private String serviceProviderTitleId;

    @JsonProperty("Percentage")
    private String percentage;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("RowVersion")
    private String rowVersion;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("IsActive")
    private String isActive;

    // Getters and Setters for all fields


    public String getProfilePhotoId() {
        return profilePhotoId;
    }

    public void setProfilePhotoId(String profilePhotoId) {
        this.profilePhotoId = profilePhotoId;
    }

    public UserProfilePhoto getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(UserProfilePhoto profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getProfileVideoId() {
        return ProfileVideoId;
    }

    public void setProfileVideoId(String profileVideoId) {
        this.ProfileVideoId = profileVideoId;
    }

    public ProfileVideo getProfileVideo() {
        return profileVideo;
    }

    public void setProfileVideo(ProfileVideo profileVideo) {
        this.profileVideo = profileVideo;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstNameAr() {
        return firstNameAr;
    }

    public void setFirstNameAr(String firstNameAr) {
        this.firstNameAr = firstNameAr;
    }

    public String getFirstNameEn() {
        return firstNameEn;
    }

    public void setFirstNameEn(String firstNameEn) {
        this.firstNameEn = firstNameEn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNameAr() {
        return lastNameAr;
    }

    public void setLastNameAr(String lastNameAr) {
        this.lastNameAr = lastNameAr;
    }

    public String getLastNameEn() {
        return lastNameEn;
    }

    public void setLastNameEn(String lastNameEn) {
        this.lastNameEn = lastNameEn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullNameAr() {
        return fullNameAr;
    }

    public void setFullNameAr(String fullNameAr) {
        this.fullNameAr = fullNameAr;
    }

    public String getFullNameEn() {
        return fullNameEn;
    }

    public void setFullNameEn(String fullNameEn) {
        this.fullNameEn = fullNameEn;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getResidenceCountryId() {
        return residenceCountryId;
    }

    public void setResidenceCountryId(String residenceCountryId) {
        this.residenceCountryId = residenceCountryId;
    }

    public String getUserApprovalStatus() {
        return userApprovalStatus;
    }

    public void setUserApprovalStatus(String userApprovalStatus) {
        this.userApprovalStatus = userApprovalStatus;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSwiftNumber() {
        return swiftNumber;
    }

    public void setSwiftNumber(String swiftNumber) {
        this.swiftNumber = swiftNumber;
    }

    public List<ServiceProviderUserQulification> getServiceProviderUserQualification() {
        return serviceProviderUserQualification;
    }

    public void setServiceProviderUserQualification(List<ServiceProviderUserQulification> serviceProviderUserQualification) {
        this.serviceProviderUserQualification = serviceProviderUserQualification;
    }

    public List<Majors> getMajors() {
        return majors;
    }

    public void setMajors(List<Majors> majors) {
        this.majors = majors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceConsultationSession30() {
        return priceConsultationSession30;
    }

    public void setPriceConsultationSession30(String priceConsultationSession30) {
        this.priceConsultationSession30 = priceConsultationSession30;
    }

    public String getPriceTreatmentSession30() {
        return priceTreatmentSession30;
    }

    public void setPriceTreatmentSession30(String priceTreatmentSession30) {
        this.priceTreatmentSession30 = priceTreatmentSession30;
    }

    public String getPriceConsultationSession45() {
        return priceConsultationSession45;
    }

    public void setPriceConsultationSession45(String priceConsultationSession45) {
        this.priceConsultationSession45 = priceConsultationSession45;
    }

    public String getPriceTreatmentSession45() {
        return priceTreatmentSession45;
    }

    public void setPriceTreatmentSession45(String priceTreatmentSession45) {
        this.priceTreatmentSession45 = priceTreatmentSession45;
    }

    public String getPriceConsultationSession60() {
        return priceConsultationSession60;
    }

    public void setPriceConsultationSession60(String priceConsultationSession60) {
        this.priceConsultationSession60 = priceConsultationSession60;
    }

    public String getPriceTreatmentSession60() {
        return priceTreatmentSession60;
    }

    public void setPriceTreatmentSession60(String priceTreatmentSession60) {
        this.priceTreatmentSession60 = priceTreatmentSession60;
    }

    public String getCvId() {
        return cvId;
    }

    public void setCvId(String cvId) {
        this.cvId = cvId;
    }

    public CV getCv() {
        return cv;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }

    public String getPhoneKeyId() {
        return phoneKeyId;
    }

    public void setPhoneKeyId(String phoneKeyId) {
        this.phoneKeyId = phoneKeyId;
    }

    public List<Object> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Object> certificates) {
        this.certificates = certificates;
    }

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }

    public String getResidenceCountryName() {
        return residenceCountryName;
    }

    public void setResidenceCountryName(String residenceCountryName) {
        this.residenceCountryName = residenceCountryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getEducationLevelName() {
        return educationLevelName;
    }

    public void setEducationLevelName(String educationLevelName) {
        this.educationLevelName = educationLevelName;
    }

    public List<ProvidedServiceName> getProvidedServiceName() {
        return providedServiceName;
    }

    public void setProvidedServiceName(List<ProvidedServiceName> providedServiceName) {
        this.providedServiceName = providedServiceName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCityOther() {
        return cityOther;
    }

    public void setCityOther(String cityOther) {
        this.cityOther = cityOther;
    }

    public boolean isChooseCityOther() {
        return isChooseCityOther;
    }

    public void setChooseCityOther(boolean chooseCityOther) {
        isChooseCityOther = chooseCityOther;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getIsTreatmentSession() {
        return isTreatmentSession;
    }

    public void setIsTreatmentSession(String isTreatmentSession) {
        this.isTreatmentSession = isTreatmentSession;
    }

    public String getIsConsultationSession() {
        return isConsultationSession;
    }

    public void setIsConsultationSession(String isConsultationSession) {
        this.isConsultationSession = isConsultationSession;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getRateData() {
        return rateData;
    }

    public void setRateData(String rateData) {
        this.rateData = rateData;
    }

    public String getRateDetail() {
        return rateDetail;
    }

    public void setRateDetail(String rateDetail) {
        this.rateDetail = rateDetail;
    }

    public String getServiceProviderTitle() {
        return serviceProviderTitle;
    }

    public void setServiceProviderTitle(String serviceProviderTitle) {
        this.serviceProviderTitle = serviceProviderTitle;
    }

    public String getServiceProviderTitleAr() {
        return serviceProviderTitleAr;
    }

    public void setServiceProviderTitleAr(String serviceProviderTitleAr) {
        this.serviceProviderTitleAr = serviceProviderTitleAr;
    }

    public String getServiceProviderTitleEn() {
        return serviceProviderTitleEn;
    }

    public void setServiceProviderTitleEn(String serviceProviderTitleEn) {
        this.serviceProviderTitleEn = serviceProviderTitleEn;
    }

    public String getServiceProviderTitleId() {
        return serviceProviderTitleId;
    }

    public void setServiceProviderTitleId(String serviceProviderTitleId) {
        this.serviceProviderTitleId = serviceProviderTitleId;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
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