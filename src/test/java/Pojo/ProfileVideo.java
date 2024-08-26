package Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileVideo {

    @JsonProperty("Id")
    private int id;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("FileName")
    private String fileName;

    @JsonProperty("FileDownloadName")
    private String fileDownloadName;

    @JsonProperty("FileType")
    private String fileType;

    @JsonProperty("FileSize")
    private int fileSize;

    @JsonProperty("FilePath")
    private String filePath;

    @JsonProperty("Path")
    private String path;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDownloadName() {
        return fileDownloadName;
    }

    public void setFileDownloadName(String fileDownloadName) {
        this.fileDownloadName = fileDownloadName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}