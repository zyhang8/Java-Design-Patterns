public class TriangleProxy implements Geometry{ 
    double sideA,sideB,sideC; 
     Triangle triangle;
    public  void setABC(double a,double b,double c) {
            sideA=a;
            sideB=b;
            sideC=c;
     }
     public double  getArea(){ 
            if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideB+sideC>sideA){
                 triangle=new Triangle(sideA,sideB,sideC);
                 double area=triangle.getArea();         //��������Ķ������getArea()����
                 return area;
            }
            else
                return -1;
    }
} 