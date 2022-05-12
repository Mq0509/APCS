/**
 * class BST
 * v2:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = n
  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );

    if ( _root == null ) {
      _root = newNode;
     
    }
  }//end insert()


  //~~() );
    System.out.print( currNode.getValue() + " " );
    inOrderTrav( currNode.getRight() );
  }

  //recurse left, recurse right, process root
  public void
   * returns number of leaves in tree
   */
  public int numLeaves()
  {
    return numLeaves( _root );
  }
  public int numLeaves( TreeNode currNode ) {
    int foo = 0;
    if ( currNode == null )
      return 0;
    foo += numLeaves( currNode.getLeft() );
    if ( isLeaf(currNode) )
      foo++;
    foo += numLeaves( currNode.getRight() );
    return foo;
  }




  //main method for testing
  public static void main( String[] args )
  {
    BST arbol = new BST();

    //PROTIP: sketch state of tree after each insertion
    //        ...BEFORE executing these.
    arbol.insert( 4 );
    arbol.insert( 2 );
    arbol.insert( 5 );
    arbol.insert( 6 );
    arbol.insert( 1 );
    arbol.insert( 3 );

    System.out.println( "\n-----------------------------");
    System.out.println( "pre-order traversal:" );
    arbol.preOrderTrav();

    System.out.println( "\n-----------------------------");
    System.out.println( "in-order traversal:" );
    arbol.inOrderTrav();

    System.out.println( "\n-----------------------------");
    System.out.println( "post-order traversal:" );
    arbol.postOrderTrav();

    System.out.println( "\n-----------------------------");

    /**
       EXPECTED OUTPUT for traversals:
       -----------------------------
       pre-order traversal:
       4 2 1 3 5 6 
       -----------------------------
       in-order traversal:
       1 2 3 4 5 6 
       -----------------------------
       post-order traversal:
       1 3 2 6 5 4 
       -----------------------------
    */


    System.out.println("h:\t" + arbol.height());
    System.out.println("nL:\t" + arbol.numLeaves());

    /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      System.out.println("s(1):\t" + arbol.search(1).getValue());
      System.out.println("s(2):\t" + arbol.search(2).getValue());
      System.out.println("s(3):\t" + arbol.search(3).getValue());
      System.out.println("s(4):\t" + arbol.search(4).getValue());
      System.out.println("s(5):\t" + arbol.search(5).getValue());
      System.out.println("s(6):\t" + arbol.search(6).getValue());
      //System.out.println("s(7):\t" + arbol.search(7).getValue());
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/



    //insering in this order will build a linked list to left
    /*
      arbol.insert( 6 );
      arbol.insert( 5 );
      arbol.insert( 3 );
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 1 );
      arbol.insert( 0 );
    */

    System.out.println( "tree after insertions:\n" + arbol );
    System.out.println();

    System.out.println();
    for( int i=-1; i<8; i++ ) {
      System.out.println(" searching for "+i+": " + arbol.search(i) );    
    }

    System.out.println();
    System.out.println( arbol );

    /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


  }

}//end class
