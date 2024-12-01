import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C_Schedule {
    // Ques: 207
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            //Creating Sorted List, indegree array & adjacency list
            List<Integer>[] adjList= new List[numCourses];
            int[] indegree= new int[numCourses];
            List<Integer> ans= new ArrayList<>();
    
            //Populating the Adj List & Indegree array
            for(int[] pair: prerequisites){
                int course= pair[0];
                int preq= pair[1];
    
                if(adjList[preq]==null)
                    adjList[preq]= new ArrayList<>();
                
                adjList[preq].add(course);
                indegree[course]++;
            }
    
            // Apply Kahn's Algo till queue is empty
            // 1. Add 0 valued indices to the queue
            // 2. Remove from queue, add to ans and Reduce indegree
    
            Queue<Integer> q= new LinkedList<>();
            for(int i=0;i<numCourses;i++)
                if(indegree[i]==0)
                    q.offer(i);
    
            while(!q.isEmpty()){
                int current = q.poll();
                ans.add(current);
    
                if(adjList[current]!= null){
                    for(int i: adjList[current]){
                        indegree[i]--;
                        if(indegree[i]==0)
                            q.offer(i);
                    }
                }
            }
    
            return ans.size()== numCourses;
        }
    
}
