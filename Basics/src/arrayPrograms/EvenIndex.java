package arrayPrograms;

public class EvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 2, 4, 5, 6 };
        for(int i=0;i<a.length;i++){
        	if(i%2==0){
        		System.out.println(a[i]);
        	}
        }
	}

}
