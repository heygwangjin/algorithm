#include <iostream>
#include <string>
#include <queue>

using namespace std;

int main() {
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
        else if (cmd == "front") { // queue 의 front의 초기값은 -1 이다. pop 연산이 실행 되면 front++
            if(q.empty()) cout << -1 << "\n";
            else cout << q.front() << "\n";
        }
        else if (cmd == "back") { // queue 의 back의 초기값은 -1 이다. push 연산이 실행 되면 back++
            if(q.empty()) cout << -1 << "\n";
            else cout << q.back() << "\n";
        } 
    }
    return 0;
}
