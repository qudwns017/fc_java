package chapter03.ch16.scheduler;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 우선순위가 높고 숙련도가 높은 상담원부터 배정합니다.");
    }
}
