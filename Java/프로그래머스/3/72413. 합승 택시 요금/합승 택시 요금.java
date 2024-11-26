import java.util.*;

/**
 * 출발지점 s
 * 노드가 n
 * 간선의 갯수는 fares.length
 */

class Node {
    int idx;
    int cost;

    // 생성자
    Node(int idx, int cost) {
        this.idx = idx;
        this.cost = cost;
    }
}

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        // 그래프 초기화
        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력
        for (int i = 0; i < fares.length; i++) {
            int start = fares[i][0];
            int end = fares[i][1];
            int cost = fares[i][2];

            graph.get(start).add(new Node(end, cost));
            graph.get(end).add(new Node(start, cost));  // 양방향 그래프 처리
        }

        // 다익스트라 알고리즘
        // 출발점 s에서의 최소 비용을 구하는 함수
        int[] distS = dijkstra(n, s, graph);
        int[] distA = dijkstra(n, a, graph);
        int[] distB = dijkstra(n, b, graph);
        
        // s -> a -> b, s -> b -> a 경로의 비용을 계산
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            // 각 경로는 s에서 i까지의 거리 + i에서 a, b까지의 거리
            int cost = distS[i] + distA[i] + distB[i];
            answer = Math.min(answer, cost);
        };
        return answer;
    }

    // 다익스트라 알고리즘 구현
    public int[] dijkstra(int n, int start, ArrayList<ArrayList<Node>> graph) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);  // 거리 배열 초기화
        dist[start] = 0;

        // 우선순위 큐 (cost, node)
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.cost));
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int node = current.idx;
            int cost = current.cost;

            // 이미 방문한 정점은 건너뛰기
            if (cost > dist[node]) continue;

            // 인접한 노드들에 대해 비용 갱신
            for (Node adj : graph.get(node)) {
                int nextNode = adj.idx;
                int nextCost = adj.cost;

                if (dist[nextNode] > cost + nextCost) {
                    dist[nextNode] = cost + nextCost;
                    pq.add(new Node(nextNode, dist[nextNode]));
                }
            }
        }

        return dist;
    }
}