package com.wwwwbo.learning.algorithm.sort;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author wangb
 * @date 2020/12/16 10:11
 **/
@BenchmarkMode({Mode.AverageTime})
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(1)
public class SortBenchmark {

    private BubbleSort bubbleSort;
    private InsertionSort insertionSort;
    private SelectionSort selectionSort;
    private MergeSort mergeSort;


    @State(Scope.Benchmark)
    public static class Data {

        @Param({"100", "1000", "10000"})
        int count;

        int[] data;

        @Setup
        public void setup() {

            data = new int[count];
            Random random = new Random(1234);
            for (int i = 0; i < count; i++) {
                data[i] = random.nextInt(count);
            }
        }
    }

    @Setup
    public void setUp() {
        bubbleSort = new BubbleSort();
        insertionSort = new InsertionSort();
        selectionSort = new SelectionSort();
        mergeSort = new MergeSort();
    }

    @Benchmark
    public int[] insertionSort(Data d) {
        int[] ints = Arrays.copyOf(d.data, d.data.length);
        insertionSort.sort(ints);
        return ints;
    }

    @Benchmark
    public int[] bubbleSort(Data d) {
        int[] ints = Arrays.copyOf(d.data, d.data.length);
        bubbleSort.sort(ints);
        return ints;
    }

    @Benchmark
    public int[] selectionSort(Data d) {
        int[] ints = Arrays.copyOf(d.data, d.data.length);
        selectionSort.sort(ints);
        return ints;
    }

    @Benchmark
    public int[] mergeSort(Data d) {
        int[] ints = Arrays.copyOf(d.data, d.data.length);
        mergeSort.sort(ints);
        return ints;
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(SortBenchmark.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }

}
