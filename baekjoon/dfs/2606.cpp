// 백준 2606번 바이러스
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> graph[102];
int infected[102];

int find_worm(int cur) {
    int count = 1;
    
    // Check for infected PC
    infected[cur] = 1;
    
    for (int i = 0; i < (int)graph[cur].size(); i++) {
        int next = graph[cur][i];
        if (infected[next] == 0){ // Infected PC, but not checked
            count += find_worm(next);
        }
    }
    
    // cout << "cur : " << cur << " count : " << count <<"\n";
    return count;
}

int main(void) {
    int num_pc; cin >> num_pc; 
    int network; cin >> network;
    
    for (int i = 0; i < network; i++) {
        int pc1, pc2; cin >> pc1 >> pc2;
        
        // Undirected graph
        graph[pc1].push_back(pc2);
        graph[pc2].push_back(pc1);
    } 
    cout << find_worm(1) - 1; 
    return 0;
}
