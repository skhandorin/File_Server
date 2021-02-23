package client;

public class ServerResponse {
    private int responseCode;
    private Integer fileId;     // может быть null

    public ServerResponse(int responseCode, Integer fileId) {
        this.responseCode = responseCode;
        this.fileId = fileId;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public int getFileId() {
        return fileId;
    }
}
