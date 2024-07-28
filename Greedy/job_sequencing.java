import java.util.*;
public class job_sequencing 
{
    static class job
    {
        int id;
        int deadline;
        int profit;
        public job(int i,int d,int p )
        {
           id = i;
           deadline = d;
           profit = p;
        }


    }
    public static void main(String args[])
    {
        int jobInfo[][] = {{4,20},{1,10},{1,40},{3,30}};

        ArrayList<job> jobs = new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++)
        {
            jobs.add(new job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> ans = new ArrayList<>();
        int time =0;
        for(int i=0;i<jobs.size(); i++)
        {
            job curr = jobs.get(i);
            if(curr.deadline > time)
            {
                time++;
                ans.add(curr.id);
            }
        }

        System.out.println("No of jobs done = " + ans.size());
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i) + " ");
        }

    }
    
}
