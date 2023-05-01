public class PaintJob {
    public static void main(String[] args) {
        getBucketCount(3.26, 0.75);
        getBucketCount(3.4, 2.1, 1.5);
        getBucketCount(3.4, 2.1, 1.5, 2 );
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(areaPerBucket <= 0 || area <= 0) {
            return -1;
        }
        double totalPaintRequired = area /areaPerBucket;
        int bucketsRequired = (int) Math.ceil(totalPaintRequired);
        System.out.println(bucketsRequired);
        return bucketsRequired;
    }
    public static int getBucketCount( double width, double height, double areaPerBucket){
        if(height <= 0 || width <= 0 || areaPerBucket <= 0) {
            System.out.println("Invalid");
            return -1;
        }
        double wallArea = width * height;
        double totalPaintRequired = wallArea / areaPerBucket;
        int bucketsRequired = (int) Math.ceil(totalPaintRequired);
        System.out.println(bucketsRequired);
        return bucketsRequired;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(height <= 0 || width <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            System.out.println("Invalid");
            return -1;
        }
            double wallArea = width * height;
            double totalPaintRequired = wallArea / areaPerBucket;
            int bucketsRequired = (int) Math.ceil(totalPaintRequired - extraBuckets);
            System.out.println(bucketsRequired);
            return bucketsRequired;
    }
}
