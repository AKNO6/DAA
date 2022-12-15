package _prim_;

public class Prims_Algo {
	static void Prims(int G[][],int V) {
		
		int no_edge=0; 
		int selected[]= {0,0,0,0,0}; 
		selected[0]=1; 
		int x,y;
		while(no_edge<V-1){ 
			int min = 9999; 
			x=0; 
			y=0;
			for(int i=0;i<V;i++){ 
				if(selected[i]==1){
					for(int j=0;j<V;j++){
						if(selected[j]==0&&G[i][j]!=0){ 
							if(min>G[i][j]){ 
								min=G[i][j]; 
								{ 
									x=i; 
									y=j;
								} 
							}
						}
					}
				}
			}
		System.out.println(x + " - " + y + " : " + G[x][y]); 
		selected[y]=1; no_edge++ ; 
		}
	}
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub
		int[][] G = { 	{ 0, 5, 10, 0, 0 }, 
						{ 5, 0, 9, 19, 42 }, 
						{ 10, 9, 0, 51, 66 }, 
						{ 0, 19, 51, 0, 31 }, 
						{ 0, 42, 66, 31, 0 } };
		Prims(G,5);
	}
}
