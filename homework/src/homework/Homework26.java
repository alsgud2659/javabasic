package homework;

import java.util.LinkedList;
import java.util.Queue;

public class Homework26 {

	public static void main(String[] args) {
		// #45

	}
	public static int bfs(int n, int m, int[][] maps) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(1,1));
		int[] xArr = {-1,0,1,0};
		int[] yArr = {0,1,0,-1};
		isVisit[1][1] = 1;
		return -1;
	}
}

class Node{
	int row;
	int col;
	public Node(int row, int col) {
		this.row = row;
		this.col = col;
	}
}