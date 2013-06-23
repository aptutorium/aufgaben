/* Rekursive Traversierung - statisch */

public static void preOrder(TreeNode n) {
	if(n == null) return;
	System.out.println(n.value);
	preOrder(n.left);
	preOrder(n.right);
}

public static void inOrder(TreeNode n) {
	if(n == null) return;
	inOrder(n.left);
	System.out.println(n.value);
	inOrder(n.right);
}

public static void postOrder(TreeNode n){
	if(n == null) return;
	postOrder(n.left);
	postOrder(n.right);
	System.out.println(n.value);
}

/* Rekursive Traversierung - Objektorientiert */

public void preOrder() {
	System.out.println(this.value);
	if (this.left != null) this.left.preOrder();
	if (this.right != null) this.right.preOrder();
}

public void inOrder() {
	if (this.left != null) this.left.inOrder();
	System.out.println(this.value);
	if (this.right != null) this.right.inOrder();
}

public void postOrder() {
	if (this.left != null) this.left.postOrder();
	if (this.right != null) this.right.postOrder();
	System.out.println(this.value);
}

/* Ebenenweise Traversieren */

public void levelOrder() {
	Queue<Node> q = new ListQueue<Node>();
	q.put(this);
	while (!q.isEmpty()) {
		Node p =	q.get();
		System.out.println(p.toString());
		if (p.left != null) q.put(p.left);
		if (p.right != null) q.put(p.right);
	}
}

/* Anzahl aller Knoten ermitteln */

public static int nodeCount(TreeNode p) {
	return p == null ? 0 : 1 + nodeCount(p.left) + nodeCount(p.right);
}

/* Hoehe ermitteln */

public int height() {
	int l = 0, r = 0;
	if (this.left != null) l = this.left.height() + 1;
	if (this.right != null) r = this.right.height() + 1;
	return Math.max(l, r);
}

/* Suche in sortiertem Suchbaum */

public static Node findNode(Node p, String key) {
	if (key.compareTo(p.key) == 0)
		return p;
	else
		key.compareTo(p.key) < 0 ? findNode(p.left, key) : findNode(p.right, key);
}

/* Objekt in Suchbaum einfügen */

public static enterNode(Node node, String key, Object value) {
	if (node == null) {
		node = new Node (key, value);
	} else {
		int cmp = key.compareTo(node.key);
		if (cmp == 0)
			node.value = value;
		else if (cmp < 0)
			node.left = enterNode(node.left, key, value);
		else
			node.right = enterNode(node.right, key, value);
	}
	return node;
}
