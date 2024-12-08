package Q15;

class ThisKeyword {
    int x;

    ThisKeyword(int x) {
        this.x = x;  // 'this' refers to the instance variable
    }

    void display() {
        System.out.println("Value of x: " + this.x);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(10);
        obj.display();
    }
}

