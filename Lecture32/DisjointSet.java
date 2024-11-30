package Lecture32;
import java.util.HashMap;

public class DisjointSet {

	public class Node {
		int val;
		int rank;
		Node parent;
	}

	HashMap<Integer, Node> map = new HashMap<>();

	public void CreateSet(int v) {
		Node nn = new Node();
		nn.val = v;
		nn.rank = 0;
		nn.parent = nn;
		map.put(v, nn);
	}

	public int find(int v) {
		Node nn = map.get(v);
		return findRootNode(nn).val;
	}

	private Node findRootNode(Node nn) {

		if (nn.parent == nn) {
			return nn;
		}
		Node n = findRootNode(nn.parent);
		nn.parent=n;//path Compression 
		return n;

	}

	public void union(int v1, int v2) {
		Node n1 = map.get(v1);
		Node n2 = map.get(v2);
		Node rn1 = findRootNode(n1);
		Node rn2 = findRootNode(n2);

		if (rn1.rank == rn2.rank) {
			rn1.parent = rn2;
			rn2.rank = rn2.rank + 1;
		} else if (rn1.rank > rn2.rank) {
			rn2.parent = rn1;
		} else {
			rn1.parent = rn2;
		}

	}

}