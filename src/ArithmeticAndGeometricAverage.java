public class ArithmeticAndGeometricAverage {
    public long calculateArithmeticAverage(int[] numbers){
        int sum = 0;
        int count = 0;
        for (int num:numbers){
            if(num>150){
                sum+=num;
                count++;
            }
        }
        if(count==0){
            System.out.println("There is no element greater than 150");
        }
        return sum/count;
    }
    public long calculateGeometricAverage(int[] numbers){
        int multiple = 1;
        int count = 0;
        for (int num:numbers){
            if(num%2!=0){
                multiple*=num;
                count++;
            }
        }
        return (long) Math.pow(multiple, (double) 1 /count);
    }


}
