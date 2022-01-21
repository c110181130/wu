package superfamily ;
abstract class defaultSet {
    abstract void hight() ;
    abstract void power() ;

    public void cloth (){
        System.out.println("衣服:red");
    }
    public void mask (){
        System.out.println("面具:black");
    }
}

        class Dad extends defaultSet {
        @Override
            public void power() {
                System.out.println("能力:開車");
            }

            public void hight() {
                System.out.println("身高:比媽媽高");
            }
        }

        class Mom extends defaultSet {
            @Override
            public void power() {
                System.out.println("能力:煮飯");
            }

            public void hight() {
                System.out.println("比小孩都高");
            }
        }

        class Firstkid extends defaultSet {
            @Override
            public void power() {
                System.out.println("能力:當老大");
            }

            public void hight() {
                System.out.println("比弟弟們都高");
            }
        }

        class Secondkid extends defaultSet {
            @Override
            public void power() {

                System.out.println("能力:當奴隸");
            }

            public void hight() {

                System.out.println("算是偏矮");
            }
        }

        class littlebro extends defaultSet {
            @Override
            public void power() {
                System.out.println("能力:搞破壞");
            }

            public void hight() {
                System.out.println("不知道");
            }
        }
public class superfamily {
    public static void main(String[] args) {
        Dad Bob = new Dad();
        Mom Helen = new Mom();
        Firstkid F = new Firstkid() ;
        Secondkid S = new Secondkid() ;
        littlebro L= new littlebro() ;
        Bob.power();
        Bob.hight();
        Bob.cloth();
        Bob.mask();
        System.out.println("===================");
        Helen.power();
        Helen.hight();
        Helen.cloth();
        Helen.mask();
        System.out.println("===================");
        F.power();
        F.hight();
        F.cloth();
        F.mask();
        System.out.println("===================");
        S.power();
        S.hight();
        S.cloth();
        S.mask();
        System.out.println("===================");
        L.power();
        L.hight();
        L.cloth();
        L.mask();
        System.out.println("===================");
    }
}