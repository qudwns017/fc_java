package chapter03.ch16.scheduler;

public class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 대기열에서 순서대로 상담원에게 배정합니다.");
    }
}
