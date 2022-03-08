package com.algo.binaryTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTree {

	Node root;

	public BinaryTree() {
		this.root = null;
	}

	public void topView (BinaryTree binaryTree) {

		if (binaryTree.root == null) {
			return;
		}

		class QueueObj {
			Node node;
			//vertical height
			int vht;

			public QueueObj(Node node, int vht) {
				this.node = node;
				this.vht = vht;
			}
		}
		Queue<QueueObj> queue = new LinkedList<>();
		Map<Integer, Node> sortedMap = new TreeMap<>();
		queue.add(new QueueObj(binaryTree.root, 0));
		while (!queue.isEmpty()) {
			QueueObj tempQueueObj = queue.poll();
			if (!sortedMap.containsKey(tempQueueObj.vht)) {
				sortedMap.put(tempQueueObj.vht, tempQueueObj.node);
			}
			if (tempQueueObj.node.left != null) {
				queue.add(new QueueObj(tempQueueObj.node.left, tempQueueObj.vht - 1));
			}
			if (tempQueueObj.node.right != null) {
				queue.add(new QueueObj(tempQueueObj.node.right, tempQueueObj.vht + 1));
			}
		}

		System.out.println(sortedMap);

		for (int key : sortedMap.keySet()) {
			System.out.println(sortedMap.get(key).key);
		}


	}
}
