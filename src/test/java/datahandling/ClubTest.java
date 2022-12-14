package datahandling;

import member.MembershipStatus;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;


class ClubTest {

    Club club;

    //*--------------------------------------------------Setup-------------------------------------------------------*\\
    @BeforeEach
    public void setup(){
        club = new Club();
        club.createMember("Test testen testesten","Himmelbjerget 69","10101010", "test@gmail.com", LocalDate.now(), true, true, MembershipStatus.NONE, true, true);
    }

    //*---------------------------------------------------Test-------------------------------------------------------*\\

    @org.junit.jupiter.api.Test
    void searchMember() {
    //arrange
        String searchTest = "Test";
        club.searchMember(searchTest);

        assertTrue(club.getSearchResult().size() != 0);

    }

    @org.junit.jupiter.api.Test
    void deleteMember() {
        //Arrange
        assertTrue(club.getSizeOfMembers() > 0);

        //Act
        club.deleteMember(club.getCurrentMembers().get(0));
        int expectedSize = 0;

        //Assert (true)
        assertEquals(expectedSize,club.getSizeOfMembers());

    }
}