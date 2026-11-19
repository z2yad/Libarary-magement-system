public class Publisher {
    private int publisherId;
    private String publisherName;
    private String publisherAddress;
    private String pNumber;


   public Publisher(int publisherId, String publisherName, String publisherAddress, String PNumber) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
        this.pNumber = pNumber;
    }
    public Publisher(int publisherId,String publisherName) {
       this.publisherId = publisherId;
       this.publisherName = publisherName;
    }
    public int getPublisherId() {
       return publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }
    public String getPublisherAddress() {
       return publisherAddress;
    }
    public String getpNumber() {
       return pNumber;
    }
    @Override
    public String toString() {
       return "Publisher ID: " + publisherId+
               ", Publisher Name: " + publisherName +
               ", Publisher Address: " + publisherAddress +
               ", Phone:" + pNumber;
    }

}
