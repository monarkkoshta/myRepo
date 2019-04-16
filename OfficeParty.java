import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;


public class OfficeParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		//input the no of cakes

		int noOfCakes = scan.nextInt();

		//input the radii
		int rad[]=new int[noOfCakes];

		double[] area = new double[noOfCakes];

		//pi value
		double pi = 3.14159265359;

		for(int i=0;i<noOfCakes;i++){
			rad[i]=scan.nextInt();
			area[i]=pi*rad[i]*rad[i];
		}

		//input the no of person 
		int noOfPerson = scan.nextInt();

		//--------------------------main logic----------------

		Arrays.sort(area);
		double maxArea = 0;
		for(int i=noOfCakes-1;i>=0;i--){
			double curArea = area[i];
			int j=0;
			int count=1;
			int k=1;
			while(j<=noOfCakes-1){
				if(i!=j&&area[j]>=curArea){
					count++;
					if(count==noOfPerson&&maxArea<curArea){
						maxArea = curArea;
						break;
					}
				}
				if(j==noOfCakes-1){
					j=0;
					curArea = area[i]/++k;
					if(curArea<=maxArea){
						break;
					}
					count=k; 
					if(count==noOfPerson&&maxArea<curArea){
						maxArea = curArea;
						break;
					}
					continue;
				}
				j++;
			}

		}
	     DecimalFormat f = new DecimalFormat("##.0000");
	     System.out.println(f.format(maxArea));
	}

}
