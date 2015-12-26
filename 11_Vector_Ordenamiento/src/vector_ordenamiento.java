
public class vector_ordenamiento {

	public static void main(String[] args) {

		int[] vector = {4,9,8,954,546,879,546,0,3,2,1,5,4,7,8,5,6,45,9,1,36,2,20,65,15};
		int i, j, aux;
		
		for (i=0; i<vector.length; i++){
			for (j=i+1; j<vector.length; j++){
				if (vector[j]<vector[i]){
					aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}			
		}
		
		for (i=0; i<vector.length; i++){
			System.out.print(vector[i]);
			if (i!=vector.length-1) System.out.print(",");
		}

	}

}
