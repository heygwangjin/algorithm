// 백준 1966번 프린터 큐
#include <iostream>
#include <queue>

using namespace std;

int main(void) {
    int test_case; cin >> test_case; 

    for (int i = 0; i < test_case; i++) {
        int num_doc, seq_in_queue;
        cin >> num_doc >> seq_in_queue;

        // 문서 정보
        queue<pair<int, int> > docList;

        // 가장 높은 중요도를 파악할 수 있도록 우선순위 큐 사용
        priority_queue<int> pq;

        // 인쇄 횟수
        int print_count = 0;

        // 데이터 입력
        for (int i = 0; i < num_doc; i++) {
            int priority;
            cin >> priority;

            docList.push(make_pair(i, priority));
            pq.push(priority);
        }

        // 인쇄 시작
        while (!docList.empty()) {
            int index = docList.front().first;
            int priority = docList.front().second;

            // 중요도가 더 높은 문서가 있을 경우 맨 뒤로
            if (pq.top() > priority) {
                docList.push(docList.front());
                docList.pop();
            }
            // 없을 경우 인쇄
            else {
                docList.pop();
                pq.pop();
                print_count++;

                // 궁금한 문서가 인쇄 됐을 경우
                if (index == seq_in_queue) {
                    cout << print_count << "\n";
                    break;
                } 
            }
        }
    } 
    return 0;
}
