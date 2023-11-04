public class Square {
    int width;
        public Square(){
           
        }
        public Square(int w){
              this.width = w;
        }
        public void setWidth(int w) {
              this.width = w;
        }

        public int getWidth() {
            return width;
        }

        public int calArea() {
            return width * width ;
        }

        public int calPerimeter() {
           return width * 4 ;
        }

        public String toString() {
            return "Square Width: " + width + ", Area = " + calArea() + ", Perimeter = " + calPerimeter();

        }
















}
