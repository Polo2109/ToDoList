public enum Priority{
    LOW("niski"), MODERATE("umiarkowany"), HIGH("wysoki");
    private String description;

    Priority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public static Priority fromDescription(String description) {
        Priority[] values = values();
        for (Priority priority : values) {
            if (priority.getDescription().equals(description))
                return priority;
        }
        return null;
    }


}

