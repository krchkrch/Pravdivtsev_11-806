package Task03;

import java.io.*;

public class Main
{
    public static void main (String args[]) throws InterruptedException
    {
        Copywriter copywriter = new Copywriter (
                "text1.txt",
                "text2.txt",
                4096);
        System.out.println(copywriter.start().join().getTotalCounter());
    }

    public static class Copywriter
    {
        private int bufferCount;
        private long totalCounter;
        private final Thread readingThread;
        private final Thread writingThread;
        private byte[] buffer;

        public Copywriter (final String inputFile, final String outputFile, int bufferSize)
        {
            buffer = new byte[bufferSize];
            readingThread = new Thread(new Runnable() {
                @Override
                public void run ()
                {
                    try {
                        FileInputStream fis = new FileInputStream(inputFile);
                        try {
                            for (;;) {
                                synchronized (Copywriter.this) {
                                    if (bufferCount == 0) {
                                        bufferCount = fis.read(buffer);
                                    }
                                    if (bufferCount == -1) {
                                        break;
                                    }
                                }
                            }
                        }
                        finally {
                            fis.close();
                        }
                    }
                    catch (IOException ex) {
                        bufferCount = -1;
                        ex.printStackTrace();
                    }
                }
            });
            writingThread = new Thread(new Runnable() {
                @Override
                public void run ()
                {
                    try {
                        FileOutputStream fos = new FileOutputStream(outputFile);
                        try {
                            for (;;) {
                                synchronized (Copywriter.this) {
                                    if (bufferCount > 0) {
                                        fos.write(buffer, 0, bufferCount);
                                        totalCounter += bufferCount;
                                        bufferCount = 0;
                                    }
                                    if (bufferCount == -1) {
                                        break;
                                    }
                                }
                            }
                        }
                        finally {
                            fos.close();
                        }
                    }
                    catch (IOException ex) {
                        bufferCount = -1;
                        ex.printStackTrace();
                    }
                }
            });
        }

        public Copywriter start ()
        {
            readingThread.start();
            writingThread.start();
            return this;
        }

        public Copywriter join () throws InterruptedException
        {
            readingThread.join();
            writingThread.join();
            return this;
        }

        public long getTotalCounter ()
        {
            return totalCounter;
        }
    }
}