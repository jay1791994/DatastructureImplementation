package TreeStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	TreeNode root;

	public void PreorderTraverasal(TreeNode root) {

		TreeNode node = root;

		if (node != null) {
			System.out.print(root.data);
			PreorderTraverasal(root.left);
			PreorderTraverasal(root.right);
		}

	}

	public void InorderTraverasal(TreeNode root) {

		TreeNode node = root;

		if (node != null) {
			InorderTraverasal(root.left);
			System.out.print(root.data + " ");
			InorderTraverasal(root.right);
		}

	}

	public void PostorderTraverasal(TreeNode root) {

		TreeNode node = root;

		if (node != null) {
			InorderTraverasal(root.left);
			InorderTraverasal(root.right);
			System.out.println(root.data);
		}
	}

	public void NonRecursivePreorderTraversal(TreeNode root) {

		Stack<TreeNode> stack = new Stack();
		TreeNode node = root;

		while (node != null) {
			System.out.print(node.data);
			stack.push(node);
			node = node.left;

		}

		if (stack.isEmpty()) {
			System.out.print("traversal finished");
		}

		while (!stack.isEmpty()) {
			node = stack.pop();

			node = node.right;

			while (node != null) {
				System.out.print(node.data);
				stack.push(node);
				node = node.left;
			}
		}

	}

	public void NonRecursiveTraveral(TreeNode root) {

		Stack stack = new Stack<TreeNode>();
		TreeNode node = root;

		while (node != null) {

			stack.push(node);
			node = node.left;
		}

		TreeNode node1;

		while (!stack.isEmpty()) {

			node1 = (TreeNode) stack.pop();
			System.out.println(node1.data);

			if (node1.right != null) {
				node1 = node1.right;
				while (node1 != null) {

					stack.push(node1);
					node1 = node1.left;
				}

			}

		}

	}

	public void levelOrderTraversal(TreeNode node) {

		Queue<TreeNode> q = new LinkedList();
		TreeNode node1;
		q.add(node);

		while (!q.isEmpty()) {

			int size = q.size();

			while (size > 0) {
				node1 = q.peek();
				q.remove();
				System.out.print(node1.data);
				if (node1.left != null) {
					q.add(node1.left);
				}
				if (node1.right != null) {
					q.add(node1.right);
				}
				size--;
			}
			System.out.println();
		}

	}

	public int TreeHeight(TreeNode node) {

		Queue<TreeNode> q = new LinkedList();
		TreeNode node1;
		q.add(node);
		int count = 0;

		while (!q.isEmpty()) {

			int size = q.size();

			while (size > 0) {
				node1 = q.peek();
				q.remove();

				if (node1.left != null) {
					q.add(node1.left);
				}
				if (node1.right != null) {
					q.add(node1.right);
				}
				size--;
			}
			count++;

		}

		return count - 1;
	}

	public boolean isBalanced(TreeNode root) {

		int hl, hr;
		TreeNode node = root;

		hl = TreeHeight(node.left);
		hr = TreeHeight(node.right);

		if ((Math.max(hl, hr) - Math.min(hl, hr)) > 1) {
			return false;
		} else
			return true;

	}

	public Stack<TreeNode> findTrack(TreeNode root, int i) {

		System.out.println("track of node " + i);
		int flag = 0;
		TreeNode node = root;
		Stack track = new Stack<TreeNode>();
		int p = 0;

		while (node != null) {
			track.push(node);
			if (node.data == i) {
				p = 1;
				break;
			}
			node = node.left;
		}

		while (!track.isEmpty() && p == 0) {

			node = (TreeNode) track.peek();
			if (node.right != null) {
				node = node.right;
				track.push(node);
				if (node != null) {
					if (node.data == i) {
						p = 1;
						break;
					}

				}
				if (node.left != null) {
					while (node != null) {
						if (node.data == i) {
							p = 1;
							break;
						}
						node = node.left;
						if (node != null) {
							if (node.data == i) {
								p = 1;
								break;
							}
							track.push(node);
						}
					}
				}
			}

			TreeNode node2 = (TreeNode) track.pop();
			System.out.println("node2 data is " + node2.data);
			if (node2.right == null && node2.left == null && flag == 0 && p == 0) {

				TreeNode Parent = (TreeNode) track.peek();

				if (Parent.right == node2) {
					while (!track.isEmpty()) {
						track.pop();
					}

					System.out.println("after making track empty" + track.size());
					track.push(root);
					flag = 1;
				}

			}
		}
		System.out.println("tack of i is ");
		Iterator itr = track.iterator();

		while (itr.hasNext()) {
			TreeNode node2 = (TreeNode) itr.next();
			System.out.println(node2.data);
		}
		return track;

	}

	public TreeNode findAncetor(TreeNode root, int i, int k) {

		Stack<TreeNode> track1 = this.findTrack(root, i);
		Stack<TreeNode> track2 = this.findTrack(root, k);
		TreeNode node = null;

		int s1 = track1.size();
		int s2 = track2.size();
		int dif = s1 - s2;
		System.out.println("difference is " + dif);
		if (s1 > s2) {
			while (dif > 0) {
				track1.pop();
				dif--;
			}
		} else {
			while (dif > 0) {
				track2.pop();
				dif--;
			}
		}

		while (!track1.isEmpty() && !track2.isEmpty()) {

			TreeNode node1 = (TreeNode) track1.pop();
			TreeNode node2 = (TreeNode) track2.pop();

			if (node1 == node2) {
				node = node1;
				System.out.println("the common ancetor is " + node1.data);
				break;
			}

		}

		return node;

	}

	public void MorrisOrderTraversal(TreeNode root) {

		if (root == null) {
			System.out.println("Empty Tree");
		}

		TreeNode current, pre;
		current = root;

		while (current != null) {

			if (current.left != null) {
				pre = current.left;
				while (pre.right != null && pre.right != current) {
					pre = pre.right;
				}

				if (pre.right == null) {
					pre.right = current;
					current = current.left;
				} else {

					pre.right = null;
					System.out.print(current.data + " ");
					current = current.right;
				}

			} else {
				System.out.print(current.data + " ");
				current = current.right;
			}

		}

	}

	void LevelLinkedList(TreeNode root) {

		Queue<TreeNode> q = new LinkedList<>();
		ArrayList<LinkedList<TreeNode>> arrayList = new ArrayList<>();
		q.add(root);

		while (!q.isEmpty()) {

			int size = q.size();
			LinkedList<TreeNode> list = new LinkedList<>();

			while (size > 0) {

				TreeNode node = q.remove();
				list.add(node);
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}

				size--;
			}

			arrayList.add(list);
		}
        System.out.println("Number of level in tree are " + arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {

			LinkedList<TreeNode> ls = arrayList.get(i);

			System.out.println();
			for (TreeNode node : ls) {

				System.out.print(node.data + " ");

			}

		}

	}
}
