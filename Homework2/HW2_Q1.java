public class HW2_Q1 {
    static class Shape{
        protected String name;
        protected String color;
        protected int area;
        protected int perimeter;
        //Constructor 0
        public Shape(){}
        //Constructor 1
        public Shape(String name, String color){
            this.name = name;
            this.color = color;
        }
        //Constructor 2
        public Shape(String name, String color, int perimeter, int area){
            this(name,color);//Using constructor 1
            this.area = area;
            this.perimeter = perimeter;
        }
        //Method 1
        public String  printShape(){
            String result = "The "+name+" has a "+color+" color";
            return result;
        }
        public int getArea(){
            return area;
        }
        public int getPerimeter(){
            return perimeter;
        }
    }

    static class Rectangle extends Shape{
        private int width;
        private int height;
        public Rectangle(String name, String color, int width, int height){
            super(name, color);
            this.width = width;
            this.height = height;
        }
        public Rectangle(int width,int height){
            super();
            this.width = width;
            this.height = height;
        }
        public Rectangle(int side){
            super();
            this.width = side;
            this.height = side;
        }
        @Override
        public int getArea(){
            area = width*height;
            return area;
        }
        @Override
        public int getPerimeter(){
            perimeter = (width+height)*2;
            return perimeter;
        }
    }

    static class Square extends Shape{
        private int side;
        //Constructor 1
        public Square(int side){
            this.side = side;
        }
        //Constructor 2
        public Square(String name, String color, int side){
            super(name,color);
            this.side = side;
        }
        @Override
        public int getArea(){
            area = side*side;
            return area;
        }
        @Override
        public int getPerimeter(){
            perimeter = side * 4;
            return perimeter;
        }
    }
}
