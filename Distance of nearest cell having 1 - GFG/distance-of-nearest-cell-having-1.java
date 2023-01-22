//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    class Triplet{
        int row;
        int col;
        int dis;
        Triplet(int r,int c,int d){
            this.row=r;
            this.col=c;
            this.dis=d;
        }
    }
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        int rows=grid.length;
        int cols=grid[0].length;
        int vis[][]=new int[rows][cols];
        int ans[][]=new int[rows][cols];
        
        Queue<Triplet>q=new LinkedList<>();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    q.add(new Triplet(i,j,0));
                    vis[i][j]=1;
                }
            }
        }
        
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        
        
        while(!q.isEmpty()){
            Triplet triplet=q.remove();
            int row=triplet.row;
            int col=triplet.col;
            int dis=triplet.dis;
            
            ans[row][col]=dis;
            
            
            for(int i=0;i<4;i++){
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];
                
                if(nrow>=0 && nrow<rows &&
                ncol>=0 && ncol<cols &&
                vis[nrow][ncol]==0){
                    q.add(new Triplet(nrow,ncol,dis+1));
                    vis[nrow][ncol]=1;
                }
            }
        }
        return ans;
    }
}