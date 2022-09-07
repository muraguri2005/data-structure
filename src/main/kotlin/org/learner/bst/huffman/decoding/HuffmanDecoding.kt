package org.learner.bst.huffman.decoding


class HuffmanDecoding(var root: Node? = null) {

}

abstract class Node(var frequency: Int, var data: Char? = null, var left: Node? = null, var rightNode: Node? = null) :
    Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return frequency - other.frequency
    }
}

class HumanLeaf(var freq: Int, var char: Char? = null) : Node(frequency = freq, data = char)
class HuffmanNode(var l: Node, var r: Node) : Node(frequency = l.frequency + r.frequency, rightNode = r, left = l)
