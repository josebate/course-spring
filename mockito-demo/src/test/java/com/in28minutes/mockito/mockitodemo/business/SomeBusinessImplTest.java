package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplTest {

    @Test
    void findTheGreatestFromAllData_basicScenario1(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }

    /* ----------------------- */

    @Test
    void findTheGreatestFromAllData_basicScenario2(){

        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25,15,5});

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);

    }

    @Test
    void findTheGreatestFromAllData_oneValue1(){

        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(35, result);

    }

    /* ----------------------- */

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData_basicScenario3(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25,15,5});
        assertEquals(25, businessImpl.findTheGreatestFromAllData());

    }

    @Test
    void findTheGreatestFromAllData_oneValue2(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});
        assertEquals(35, businessImpl.findTheGreatestFromAllData());

    }

}

class DataServiceStub implements  DataService{
    @Override
    public int[] retrieveAllData(){
        return new int[] {25,15,5};
    }
}
