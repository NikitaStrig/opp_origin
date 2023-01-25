package transport;

public enum LoadCapacity {
    N1(0,3.5),
    N2(3.5,12),
    N3(12,999);
    private double loadUp, loadLowe;


    LoadCapacity(double loadLowe, double loadUp) {
        this.loadUp = loadUp;
        this.loadLowe = loadLowe;
    }

    public double getLoadUp() {
        return loadUp;
    }
    public double getLoadLowe() {
        return loadLowe;
    }
}

