#include <iostream>
#include <string>
#include <queue>

using namespace std;

int main() {
    /* 
        C++ 의 cin, cout과 endl은 출력 버퍼를 flush하는 느린 연산이다. 따라서 endl 대신 "\n"을 사용하고, main 함수의 첫 줄에 아래의 코드를 작성해 주면 출력 속도가 상승한다. 
     */
    cin.tie(NULL);ios::sync_with_stdio(false);
    int num; cin >> num;
    queue<int> q;
    for (int i = 0; i < num; i++) {
        string cmd; cin >> cmd;     
        if (cmd == "push") {
            int x; cin >> x;
            q.push(x);
        }
        else if (cmd == "pop") {
            if (q.empty()) cout << -1 << "\n";
            else {
                cout << q.front() << "\n";
                q.pop();
            }
        }
        else if (cmd == "size") {
            cout << q.size() << "\n";
        }
        else if (cmd == "empty") {
            if (q.empty()) cout << 1 << "\n";
            else cout << 0 << "\n";
        }
        else if (cmd == "front") {
            if(q.empty()) cout << -1 << "\n";
            else cout << q.front() << "\n";
        }
        else if (cmd == "back") {
            if(q.empty()) cout << -1 << "\n";
            else cout << q.back() << "\n";
        } 
    }
    return 0;
}
