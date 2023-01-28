package transport;

public enum CapacityBus {
    especiallySmall(0, 10),
    small(0, 25),
    average(40, 50),
    big(60, 80),
    extraLarge(100, 120);
    private int minCapacity, maxCapacity;


    CapacityBus(int minCapacity, int maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }

    public int getMinCapacity() {
        return minCapacity;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMinCapacity(int minCapacity) {
        this.minCapacity = minCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    }
