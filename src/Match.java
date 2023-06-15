public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    //Constructor metodumuzu oluşturduk


    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){

        if (whoFirst()){
            this.f1=f1;
            this.f2=f2;
        }
        else {
            this.f2=f1;
            this.f1=f2;
        }
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }

    boolean whoFirst(){
        double a=Math.random()*100;
        return a<=50;

    }

    void run(){
    if (isCheck()){

        while (this.f1.health > 0 && this.f2.health > 0){
            System.out.println("--------- YENİ ROUND ---------");
            System.out.println();

        this.f2.health = this.f1.hit(this.f2);
        if (isWin()){
            break;
        }



        this.f1.health = this.f2.hit(this.f1);
        if (isWin()){
            break;
        }
            System.out.println(this.f2.name + " sağlık: "+this.f2.health);
            System.out.println(this.f1.name + " sağlık: "+this.f1.health);
            System.out.println();
        }
    }else {
        System.out.println("Sporcuların sikletleri uymuyor.");
    }
    }

    boolean isCheck(){
     return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı.");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı");
            return true;
        }
        return false;
    }
}
