public class Cart {
    public static final int MAX_NUMBERS_ORDERD = 20;
    private int qtyOrder;
    private DigitalVideoDisc product[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERD];
    private float total_cost;

    public boolean findDVDs(DigitalVideoDisc x) {
        if(this.qtyOrder==0) return false;
        for(int i=0; i<this.qtyOrder; i++) {
            if(this.product[i].equals(x)) return true;
        }
        return false;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(this.qtyOrder == MAX_NUMBERS_ORDERD) {
            System.out.println("Cart is full!");
            return;
        }
        if(this.findDVDs(disc)==true) {
            System.out.println(disc.toString() + "exists in cart");
            return;
        }
        int tmp = this.qtyOrder;
        this.product[tmp] = disc;
        this.qtyOrder = tmp+1;
        this.total_cost += disc.getCost();
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(this.qtyOrder == 0) {
            System.out.println("Cart is empty!");
            return;
        }
        if(this.findDVDs(disc)==false) {
            System.out.println(disc.toString()+" is not found in cart");
            return;
        }
        for(int i=0; i<this.qtyOrder; i++) {
            if(this.product[i].equals(disc)) {
                for(int j=i; j<=this.qtyOrder; i++) {
                    DigitalVideoDisc tmp = this.product[j+1];
                    this.product[j]=tmp;
                }
                this.qtyOrder-=1;
                this.total_cost-= disc.getCost();
            }
        }
    }

    public void print() {
        System.out.println("***********************CART***********************");
        for(int i=0; i<qtyOrder; i++) {
            product[i].toString();
        }
        System.out.println("Total cost:"+total_cost+"\n***************************************************");
    }

    public static void main(String arg[]) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.total_cost);
    }
}
