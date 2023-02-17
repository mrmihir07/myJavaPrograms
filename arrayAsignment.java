public class arrayAsignment
{
    public static void main(String[] args) {
        //Problem 1
//        int arr[] = {2,6,-5,-1,0,4,-9};
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]>=0)
//            {
//                System.out.println(arr[i]);
//            }
//        }

        //Problem 2
//        String strArr[] = {"ab","bc","cd","de","ef","gh"};
//        for(int i=0; i<strArr.length; i++){
//            if(i%2!=0){
//                System.out.println(strArr[i]);
//            }
//        }

        //Problem 3
//        int arr[] = {1,2,3,4,5,6,7,8,9};
//        for (int ele: arr) {
//            if(ele%2==0){
//                System.out.println(ele);
//            }
//        }

        //Problem 5
        int arr[] = {1,1,3,4,2,3,5,7,0};
        for(int i = 1; i < arr.length-1; i++)
        {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
