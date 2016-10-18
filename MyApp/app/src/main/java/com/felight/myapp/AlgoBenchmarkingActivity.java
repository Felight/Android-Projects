package com.felight.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.felight.myapp.utils.Calculator;
import com.felight.myapp.utils.SortingAlgos;

import java.util.Arrays;

public class AlgoBenchmarkingActivity extends AppCompatActivity {

    private RadioGroup rgComplexity;
    private EditText etArraySize;
    private TextView tvArrayStatus;

    private TextView tvBubbleSortTimeTaken;
    private TextView tvSelectionSortTimeTaken;
    private TextView tvMergeSortTimeTaken;
    private TextView tvInsertionSortTimeTaken;
    private TextView tvHeapSortTimeTaken;
    private TextView tvQuickSortTimeTaken;

    private GridLayout glAlgos;


    private static int[] array;

    public void doSort(View view) {

        switch (view.getId()) {
            case R.id.btnBubbleSort:

                doBubbleSort();

                break;

            case R.id.btnSelctionSort:
                doSelectionSort();
                break;

            case R.id.btnInsertionSort:
                doInsertionSort();
                break;

            case R.id.btnHeapSort:
                doHeapSort();
                break;

            case R.id.btnQuickSort:
                doQuickSort();
                break;


            case R.id.btnMergeSort:
                doMergeSort();
                break;

            case R.id.btnSortAll:
                doBubbleSort();
                doHeapSort();
                doInsertionSort();
                doMergeSort();
                doQuickSort();
                doSelectionSort();
        }
    }

    private void doMergeSort() {
        int[] newArray = Arrays.copyOf(array,array.length);
        long start = System.currentTimeMillis();
        SortingAlgos.mergeSort(newArray, 0, array.length-1);
        long end = System.currentTimeMillis();

        tvMergeSortTimeTaken.setText(""+(end-start));

    }

    private void doQuickSort() {
        int[] newArray = Arrays.copyOf(array,array.length);
        //SortingAlgos.
    }

    private void doHeapSort() {
        int[] newArray = Arrays.copyOf(array,array.length);
        long start = System.currentTimeMillis();
        SortingAlgos.heapSort(newArray);
        long end = System.currentTimeMillis();
        tvHeapSortTimeTaken.setText(""+(end-start));
    }

    private void doInsertionSort() {
        int[] newArray = Arrays.copyOf(array,array.length);
        long start = System.currentTimeMillis();
        SortingAlgos.insertionSort(newArray);
        long end = System.currentTimeMillis();
        tvInsertionSortTimeTaken.setText(""+(end-start));
    }

    private void doSelectionSort() {
        int[] newArray = Arrays.copyOf(array,array.length);
        long start = System.currentTimeMillis();
        SortingAlgos.selectionSort(newArray);
        long end = System.currentTimeMillis();
        tvSelectionSortTimeTaken.setText(""+(end-start));
    }


    private void doBubbleSort() {
        int[] newArray = Arrays.copyOf(array,array.length);
        long start = System.currentTimeMillis();
        SortingAlgos.bubbleSort(newArray);
        long end = System.currentTimeMillis();
        tvBubbleSortTimeTaken.setText(""+(end-start));
    }


    public void generateArray(View view) {

        int size = Integer.parseInt(etArraySize.getText().toString());
        glAlgos.setVisibility(View.VISIBLE);
        switch (rgComplexity.getCheckedRadioButtonId()) {

            case R.id.rbBestCase:
                array = Calculator.generateSortedArray(size);
                tvArrayStatus.setText("Array of size " + size + " generated for " + "Best Case");
                break;

            case R.id.rbAverageCase:
                array = Calculator.generateRandomArray(size);
                tvArrayStatus.setText("Array of size " + size + " generated for " + "Average Case");
                break;

            case R.id.rbWorstCase:
                array = Calculator.generateSortedArrayDesc(size);
                tvArrayStatus.setText("Array of size " + size + " generated for " + "Worst Case");
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo_benchmarking);
        rgComplexity = (RadioGroup) findViewById(R.id.rgComplexity);
        etArraySize = (EditText) findViewById(R.id.etArraySize);
        tvArrayStatus = (TextView) findViewById(R.id.tvArrayStatus);

        tvBubbleSortTimeTaken = (TextView) findViewById(R.id.tvBubbleSortTimeTaken);
        tvSelectionSortTimeTaken = (TextView) findViewById(R.id.tvSelectionSortTimeTaken);
        tvMergeSortTimeTaken = (TextView) findViewById(R.id.tvMergeSortTimeTaken);
        tvInsertionSortTimeTaken = (TextView) findViewById(R.id.tvInsertionSortTimeTaken);
        tvHeapSortTimeTaken = (TextView) findViewById(R.id.tvHeapSortTimeTaken);
        tvQuickSortTimeTaken = (TextView) findViewById(R.id.tvQuickSortTimeTaken);

        glAlgos = (GridLayout) findViewById(R.id.glAlgos);

        glAlgos.setVisibility(View.INVISIBLE);
    }
}
