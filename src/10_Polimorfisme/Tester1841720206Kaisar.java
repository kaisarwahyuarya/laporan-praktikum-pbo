package Jobsheet10;

public class Tester1841720206Kaisar {
    public static void main(String[] args) {
        WalkingZombie1841720206Kaisar wz = new WalkingZombie1841720206Kaisar(100, 1);
        JumpingZombie1841720206Kaisar jz = new JumpingZombie1841720206Kaisar(100, 2);
        Barrier1841720206Kaisar b = new Barrier1841720206Kaisar(100);
        Plant1841720206Kaisar p = new Plant1841720206Kaisar();
        System.out.println(""+wz.getZombieInfoKaisar());
        System.out.println(""+jz.getZombieInfoKaisar());
        System.out.println(""+b.getBarrierInfoKaisar());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroyKaisar(wz);
            p.doDestroyKaisar(jz);
            p.doDestroyKaisar(b);
        }
        System.out.println(""+wz.getZombieInfoKaisar());
        System.out.println(""+jz.getZombieInfoKaisar());
        System.out.println(""+b.getBarrierInfoKaisar());
    }
}
