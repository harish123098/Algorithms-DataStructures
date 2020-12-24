
public class Binarysearch {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        for (int i = 0; i < 1; i++) {
            numbers[i] = i;
            System.out.println("number inserted is " + i);
        }
        Binarysearch bs = new Binarysearch();

        int searchElement = 0;

        int lowerBound = 0;
        int upperBound = numbers.length - 1;
        int result = bs.binarySearch(searchElement, lowerBound, upperBound ,numbers);
        System.out.println("found element in the index: "+ result);

    }

    int binarySearch(int searchElement, int lowerBound, int upperBound,int[] numbers) {
         int index = -1 ;
        System.out.println("Lower bound "+lowerBound  +" and lower bound value " +numbers[lowerBound]);
        System.out.println("upper bound "+upperBound  +" and upper bound value " +numbers[upperBound]);

        int mid = (lowerBound + upperBound)/2 ;

        if (searchElement == numbers[lowerBound]){
            return lowerBound;
        }
        else if(searchElement == numbers[upperBound]){
            return upperBound;
        }else if (searchElement > numbers[upperBound] || searchElement < numbers[lowerBound]){
            System.out.println("search element not present in th given array");
            return -1;
        }

        System.out.println("mid is " +mid + "values of mid " + numbers[mid]);

        if (numbers[mid] == searchElement ) {
            return mid;
        }

        System.out.println("search element "+ searchElement + " and mid value" + numbers[mid]);

        if (searchElement < numbers[mid]) {
           upperBound = mid + 1;
            index = binarySearch(searchElement,lowerBound,upperBound,numbers);
        }
        else if(searchElement > numbers[mid]) {
            System.out.println("search element "+ searchElement + "and mid value " +numbers[mid]);
            lowerBound = mid -1;
            index =  binarySearch(searchElement, lowerBound, upperBound, numbers);
        }

        if(lowerBound == upperBound){
            System.out.println("search element not present ");
            return -1;
        }
        return index;
    }


}

