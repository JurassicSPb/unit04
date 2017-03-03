package com.epam.java.se.task1_task2;

import org.junit.Test;

/**
 * Created by Мария on 02.03.2017.
 */
public class InputOutputWorkerTest {
    @Test
    public void arrayOfKeysTest() throws Exception{
        InputOutputWorker worker = new InputOutputWorker();

        worker.getArrayOfKeysFromFileWithByteReader();
//        worker.printKeys();
//        worker.getFileWithJavaCodeToStringWithByteReader();

        System.out.println(worker.getKeyWordsAndTheirCountFromFile(worker.getFileWithJavaCodeToStringWithByteReader()));

    }
}
