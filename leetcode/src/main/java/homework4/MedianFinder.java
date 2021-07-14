package homework4;

import java.util.PriorityQueue;

class MedianFinder {

    /** initialize your data structure here.需要两个堆，最大堆，最小堆。 */

    PriorityQueue<Integer> maxheap;
    PriorityQueue<Integer> minheap;

    int size = 0;

    public MedianFinder() {
        maxheap = new PriorityQueue<>((x, y) -> y - x);
        minheap = new PriorityQueue<>();

    }

    public void addNum(int num) {


        if(size%2==0){
            minheap.add(num);
        }else{

            int tmp = minheap.poll();

            if(tmp>num){

                minheap.add(tmp);
                maxheap.add(num);

            }
            else{
                minheap.add(num);
                maxheap.add(tmp);
            }
        }

        size ++;



    }

    public double findMedian() {

        if(size%2==0){

            return (double) (maxheap.peek()+minheap.peek())/2.0;
        }

        return minheap.peek();

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
