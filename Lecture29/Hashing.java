import java.util.ArrayList;

public class Hashing<K,V> {
    public class Node {
		K key;
		V value;
		Node next;

		public Node() {
		}

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private ArrayList<Node> bucketArray;
	
	private int size = 0;

	public Hashing(int x) {
		this.bucketArray = new ArrayList<>();
		for (int i = 0; i < x; i++) 
			this.bucketArray.add(null);
	}

	public Hashing() {
		this(4);
	}

	public void put(K key, V value) {
		int bn = hashfunction(key);
		Node temp = this.bucketArray.get(bn);// 1st Address
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node(key, value);
		temp = this.bucketArray.get(bn);// 1st Address
		nn.next = temp;
		this.bucketArray.set(bn, nn);
		this.size++;
		double lf = (1.0 * this.size) / this.bucketArray.size();
		double thf = 2.0;
		if (lf > thf)
			rehasing();
	}

	private void rehasing() {
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * this.bucketArray.size(); i++)
			nba.add(null);
		ArrayList<Node> oba = this.bucketArray;
		this.bucketArray = nba;
		this.size = 0;
		for (Node node : oba)
			while (node != null) {
				put(node.key, node.value);
				node = node.next;
			}
	}

	public V get(K key) {
		int bn = hashfunction(key);
		Node temp = this.bucketArray.get(bn);// 1st Address
		while (temp != null) {
			if (temp.key.equals(key))
				return temp.value;
			temp = temp.next;
		}
		return null;
	}

	public boolean containsKey(K key) {
		int bn = hashfunction(key);
		Node temp = this.bucketArray.get(bn);// 1st Address
		while (temp != null) {
			if (temp.key.equals(key))
				return true;
			temp = temp.next;
		}
		return false;
	}

	public V remove(K key) {
		int bn = hashfunction(key);
		Node curr = this.bucketArray.get(bn);// 1st Address
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) 
				break;
			prev = curr;
			curr = curr.next;
		}
		if (curr == null)
			return null;
		
		this.size--;
		if (prev == null) {
			this.bucketArray.set(bn, curr.next);
			curr.next = null;
		} else {
			prev.next = curr.next;
			curr.next = null;
		}
		return curr.value;
	}

	public int hashfunction(K key) {
		int bn = key.hashCode() % this.bucketArray.size();
		if (bn < 0) {
			bn += this.bucketArray.size();
		}
		return bn;
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node node : bucketArray)
			while (node != null) {
				s = s + node.key + "=" + node.value + ", ";
				node = node.next;
			}
		s = s + "}";
		return s;
	}
}
