public class characterItem {
    private String itemName;
    private String itemDescription;

    public characterItem(String itemName, String itemDescription){
        this.itemDescription = itemDescription;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

}
