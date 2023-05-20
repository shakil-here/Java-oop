public class Rectangle {
    private int hight;
    private int width;
    public int getarea(){
        return hight*width;
    }
    public int getHight(){
        return hight;
    }
    public int getWidth(){
        return  width;
    }

    public void setHight(int h){
        this.hight=h;
    }

    public void setWidth(int w) {
        this.width = w;
    }
    public String toString(){
        return ("Width : "+getWidth()+" \nHight : "+getHight());
    }
}
