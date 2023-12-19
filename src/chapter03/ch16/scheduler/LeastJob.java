package chapter03.ch16.scheduler;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 대기가 적은 상담원을 우선하여 배정합니다.");
    }
}
