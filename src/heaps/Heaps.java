package heaps;

import java.util.ArrayList;

public class Heaps {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) > arr.get(par)) {

                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek() {
            return arr.getFirst();
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;


            if (left < arr.size() && arr.get(minIdx) < arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) < arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {

                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }

        } 


        public int remove() {
            int data = arr.getFirst();

            int temp = arr.getFirst();
            arr.set(0, arr.getLast());
            arr.set(arr.size() - 1, temp);

            arr.removeLast();

            heapify(0);

            return data;

        }

        public boolean isEmpty() {

            return arr.isEmpty();
        }

    }

    public static void main(String[] args) {

        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(2);
        

        while(!h.isEmpty()){
            System.out.print(h.peek());
            h.remove();
        }
    }

}