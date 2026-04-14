public class Rectangle implements Comparable<Rectangle> {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    /**
     * So sánh hai hình chữ nhật theo diện tích tăng dần.
     *
     * @param other hình chữ nhật dùng để so sánh
     * @return số âm nếu nhỏ hơn,
     *         0 nếu bằng nhau,
     *         số dương nếu lớn hơn
     */
    @Override
    public int compareTo(Rectangle other) {
        // TODO
        return 0;
    }

    @Override
    public String toString() {
        return String.format("(%.1f x %.1f, area=%.1f)", 
                width, height, getArea());
    }
}