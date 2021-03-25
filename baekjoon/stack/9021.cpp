// 백준 9021번 괄호
#include <iostream>
#include <stack>
#include <string>

using namespace std;

// 입력 받은 괄호 문자열이 VPS 인지 체크하는 함수
bool is_VPS (string str) {
    int ps_len = str.length(); 
    stack<char> s;

    for (int i = 0; i < ps_len; i++) {
        char c = str[i];
        
        // 열린 괄호만 스택에 저장한다.
        if (c == '(') s.push(c);
        else {
            if (!s.empty()) s.pop(); 
            else return false; 
        }
    }
     
    // 반복문이 끝나고 스택에 괄호가 남아있으면 false, 즉 맨 마지막에 여는 괄호가 스택에 들어간 경우
    return s.empty(); 
}

int main(void) {
    int t; cin >> t;
    
    for (int i = 0; i < t; i++) {
        string ps; cin >> ps;
        if (is_VPS(ps)) cout << "YES" << "\n";
        else cout << "NO" << "\n";
    }
    return 0;    
}
