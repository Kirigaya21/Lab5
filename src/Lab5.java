public class Lab5 {
    public static  class Vector {
        double x, y;

        public Vector() {
            setX(0);
            setY(0);
        }

        public Vector(double x, double y) {
            this.setX(x);
            this.setY(y);

        }

        public double lengtht() {
            return Math.sqrt(x * x + y * y);
        }
        public double angle() {
            return Math.atan(y/x);
        }
        public Vector addVector(Vector v) {
            return new Vector(getX() + v.getX(), getY() + v.getY());
        }

        public Vector minusVector(Vector v) {
            return new Vector(getX() - v.getX(), getY() - v.getY());
        }
        public Vector mul(int k) {
            return new Vector(x*k, y*k);
        }
        public double scalary(Vector v) {
            return (v.x*x+v.y*y);
        }
        public double angle2(Vector v, Vector k) {
            return (k.scalary(v)/(v.lengtht()+k.lengtht()));
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            long temp;
            temp = Double.doubleToLongBits(x);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(y);
            result = prime * result + (int) (temp ^ (temp >>> 32));

            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Vector other = (Vector) obj;
            if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
                return false;
            if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
                return false;

            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Vector [x=");
            builder.append(x);
            builder.append(", y=");
            builder.append(y);
            builder.append("]");
            return builder.toString();
        }
    }
    public static void main(String[] args){

        Vector p=new Vector(4,5);
        Vector k=new Vector(2,3);
        System.out.println(p.lengtht());
        System.out.println(k.mul(5));
        System.out.println(k.scalary(p));
        System.out.println(k.addVector(p));
        System.out.println(p.minusVector(k));
        System.out.println(k.angle2(p,k));
        System.out.println(k.angle());
    }
}
