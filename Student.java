
package Grade;

public class Student {
    
     String Name;
    int ID;
    
    double []Grads= new double[3];
     
    int add(int[]arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

}
