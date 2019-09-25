/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Get_Median;

/**
 *
 * @author Arif-X
 */
public class Median {

    private int[] arr;
    private int nElement;
    private int median;

    //Array's elements//
    public Median(int size) {
        arr = new int[size];
        nElement = 0;
    }

    //method for inserting value for array's index//
    public void insert(int value) {
        arr[nElement] = value;
        nElement++;
    }

    //displaying array method//
    public void display() {
        for (int i = 0; i < nElement; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    //bubble sort method including swap method return//
    public void BubbleSort() {
        int batas, i;
        for (batas = nElement - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                }
            }
            printNumbers(arr);
        }
        for (int a = 0; a < nElement; a++) {
            System.out.print(arr[a] + " ");
            median = arr[nElement / 2];
        }
    }
    
    public void xMedian() {
        int batas, i;
        for (batas = nElement - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
        for (int a = 0; a < nElement; a++) {
            median = arr[nElement / 2];
        }
        System.out.println("Median : " + median);
    }
    
    //Print number for bubble sort progress//
    private static void printNumbers(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("");
    }

    public void tampil(int data) {
        System.out.println(data);
        data = 0;
    }

    public void tampil(String data) {
        System.out.println(data);
        data = null;
    }

    //swap method for sorting with bubble sort//
    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public static void main(String[] args) {
        int size = 11;
        Median arr = new Median(size);
        arr.insert(40);
        arr.insert(20);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(10);
        arr.insert(90);
        arr.tampil("==========  Data Asli ==========");
        arr.display();
        arr.tampil("==========  Data Sort ==========");
        arr.tampil("==========   Process  ==========");
        arr.BubbleSort();
        arr.tampil("");
        arr.tampil("==========   Median  ==========");
        arr.xMedian();
    }
}
