package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TextTest {

    @Test
    public void testGetNumberOfCharacters(){

        //Arrange
        TextCounter myText = new TextCounter();

        //Act
        int actual = myText.getNumberOfCharacters();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfRows(){

        //Arrange
        TextCounter myText = new TextCounter();

        //Act
        int actual = myText.getNumberOfRows();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddRows(){

        //Arrange
        TextCounter myText = new TextCounter();

        //Act
        myText.addRows();
        int actual = myText.getNumberOfRows();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddTwoRows(){

        //Arrange
        TextCounter myText = new TextCounter();

        //Act
        myText.addRows();
        myText.addRows();
        int actual = myText.getNumberOfRows();

        //Assert
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharacters(){

        //Arrange
        TextCounter myText = new TextCounter();

        //Act
        myText.addCharacters("Hej");
        int actual = myText.getNumberOfCharacters();

        //Assert
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddTwoCharacters(){

        //Arrange
        TextCounter myText = new TextCounter();

        //Act
        myText.addCharacters("Hej");
        myText.addCharacters("Hejdå");
        int actual = myText.getNumberOfCharacters();

        //Assert
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEndWord(){

        //Arrange
        TextCounter myText = new TextCounter();

        //Act
        myText.endWord("Stop");
        boolean actual = myText.getEndWord();

        //Assert
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetNoEndWord(){

        //Arrange
        TextCounter myText = new TextCounter();

        //Act
        myText.endWord("Hej");
        boolean actual = myText.getEndWord();

        //Assert
        boolean expected = true;

        assertEquals(expected, actual);
    }
}
