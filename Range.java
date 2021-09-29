public class Range{
    public static void main(String args[]) {
    int arr[]= new int[100];
    arr[0]=42;
    arr[1]=91;
    arr[2]=75;
    arr[3]=29;
    arr[4]=32;
    int counta=0, countb=0, countc=0, countd=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>=81&&arr[i]<=100){
            counta++;
        }
        if(arr[i]>=61&&arr[i]<=80){
            countb++;
        }
        if(arr[i]>=41&&arr[i]<=60){
            countc++;
        }
        if(arr[i]>=0&&arr[i]<=40){
            countd++;
        }
    }
    System.out.println(counta+" "+countb+" "+countc+" "+countd);
    }
}