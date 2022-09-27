package enumTask.task2;

public enum PackageSize {
    SMALL(20,60),
    MEDIUM(60,120),
    LARGE(120,250),
    UNKNOWN(0,0);
    private int minSize;
    private int maxSize;


    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int minSize, int maxSize){
        for (PackageSize packageSize : values()){
            if (minSize >= packageSize.minSize && maxSize <= packageSize.maxSize){
                return packageSize;
            }
        }
        return UNKNOWN;
    }
}
