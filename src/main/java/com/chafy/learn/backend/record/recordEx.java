package com.chafy.learn.backend.record;

public class recordEx {

    public static void main(String[] args) {
        // record 클래스 생성
        record footBallTeam(String name, int rank) {
        }
        ;

        // record 클래스 타입의 객체 생성
        footBallTeam team = new footBallTeam("Liverpool FC", 1);

        // 이전의 방식이 었다면 getName(), getRank()와 같이 빈 클래스를 따로 생성해야 했다면
        // record의 등장으로 record 클래스의 인수로 있는 name이나 rank를 바로 사용할 수가 있다.
        System.out.println(team.name());
        System.out.println(team.rank());

        // 그 외 toString(), equals(), hashCode() 등을 자동으로 만들어준다.
        System.out.println(team.toString());
        System.out.println(team.name().equals("ManUTD"));
        System.out.println(team.hashCode());
    }
}
