import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



class Jobs{

	int task;
	int deadline;
	int profit;

	public Jobs(int task,int deadline,int profit) {

		this.task=task;
		this.deadline=deadline;
		this.profit=profit;

	}
}

class ProfitComparator implements Comparator{  
	public int compare(Object o1,Object o2){  
		Jobs j1=(Jobs)o1;  
		Jobs j2=(Jobs)o2;  

		if(j2.profit>j1.profit)
			return 1;
		else 
			return -1;


	} 
}
public class JobSequencing {

	public static void schedulingJob(List<Jobs> job,int maxDeadline) {

		int slot[]=new int[maxDeadline];

		int profit=0;
		Arrays.fill(slot,-1);

		for(Jobs al:job) {

			for(int i=al.deadline-1;i>=0;i--) {

				if(slot[i]==-1) {

					slot[i]=al.task;
					profit=profit+al.profit;
					break;
				}
			}
		}
		Arrays.stream(slot).filter(val->val!=-1).forEach(x-> System.out.println(x));
		System.out.println("Total Profit:"+profit);
	}


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<Jobs> job=new ArrayList<Jobs>(); 
		job.add(new Jobs(1,9, 15));
		job.add(new Jobs(3,5, 18));
		job.add(new Jobs(5,4, 25));
		job.add(new Jobs(7,5, 8));
		job.add(new Jobs(9,4, 12));
		job.add(new Jobs(2,2, 2));
		job.add(new Jobs(4,7,1));
		job.add(new Jobs(6,2, 20));
		job.add(new Jobs(8,7,10));
		job.add(new Jobs(10,3, 5));

		Collections.sort(job, new ProfitComparator());

		Iterator<Jobs> itr2=job.iterator();  
		System.out.println("After Sorting:");
		while(itr2.hasNext()){  
			Jobs st=(Jobs)itr2.next();  
			System.out.println(st.task+" "+st.deadline+" "+st.profit); 

		}

		System.out.println("----------------------");
		schedulingJob(job,9);

	}
}
