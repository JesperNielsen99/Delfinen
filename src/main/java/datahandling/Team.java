package datahandling;

import member.Member;

import java.util.ArrayList;

public class Team {

    String trainerName;
    ArrayList<Member> teamMembers = new ArrayList<>();

    public Team(String trainerName) {
        this.trainerName = trainerName;
    }

    public void addMemberToTeam(Member member){
        teamMembers.add(member);
    }

    public ArrayList<Member> getTeamMembers() {
        return teamMembers;
    }
}