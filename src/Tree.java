import java.util.ArrayList;

public class Tree {
    /*A recursive tree data structure, which provides services required of the
       MultiSet ADT. See TreeMultiSet, which is the next class defined.

       This is a simplified version of the Tree data structure
       adapted from CSC148.
    """
            # === Private Attributes ===
            # The item stored at this tree's root, or None if the tree is empty.
    */
    private Integer root;
   //The list of all subtrees of this tree.
   private ArrayList<Tree> subtrees;

   public Tree(Integer root) {
      this.root = root;
      this.subtrees = new ArrayList<>();
   }

   public Tree(Integer root, ArrayList<Tree> subtrees) {
      this.subtrees = subtrees;
      this.root = root;
   }
   public boolean is_empty(){
      return root == null;
   }

   public Integer len(){
      Integer length = 0;
      if (!this.is_empty()){
         length = 1;
         for (Tree subtree: this.subtrees){
            length += subtree.len();
         }
      }
      return length;
   }
   /*
            # === Representation Invariants ===
            # - If self._root is None then self._subtrees is an empty list.
    #   This setting of attributes represents an empty tree.
            #
            #   Note: self._subtrees may be empty when self._root is not None.
            #   This setting of attributes represents a tree consisting of just one
    #   node.
     */

}
