package typingsSlinky.unistUtilVisit

import typingsSlinky.unist.mod.Node
import typingsSlinky.unist.mod.Parent
import typingsSlinky.unistUtilIs.mod.Test
import typingsSlinky.unistUtilVisitParents.mod.Action
import typingsSlinky.unistUtilVisitParents.mod.ActionTuple
import typingsSlinky.unistUtilVisitParents.mod.Continue
import typingsSlinky.unistUtilVisitParents.mod.Exit
import typingsSlinky.unistUtilVisitParents.mod.Index
import typingsSlinky.unistUtilVisitParents.mod.Skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("unist-util-visit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Visit children of a tree
    *
    * @param tree abstract syntax tree to visit
    * @param visitor function to run for each node
    * @param reverse visit the tree in reverse, defaults to false
    */
  def apply(tree: Node, visitor: Visitor[Node]): Unit = js.native
  def apply(tree: Node, visitor: Visitor[Node], reverse: Boolean): Unit = js.native
  def apply[V /* <: Node */](tree: Node, test: js.Array[Test[_]], visitor: Visitor[V]): Unit = js.native
  def apply[V /* <: Node */](tree: Node, test: js.Array[Test[_]], visitor: Visitor[V], reverse: Boolean): Unit = js.native
  /**
    * Visit children of tree which pass a test
    *
    * @param tree abstract syntax tree to visit
    * @param test test node
    * @param visitor function to run for each node
    * @param reverse visit the tree in reverse, defaults to false
    * @typeParam T tree node
    * @typeParam V node type found
    */
  def apply[V /* <: Node */](tree: Node, test: Test[V], visitor: Visitor[V]): Unit = js.native
  def apply[V /* <: Node */](tree: Node, test: Test[V], visitor: Visitor[V], reverse: Boolean): Unit = js.native
  
  /**
    * Continue traversing as normal
    */
  var CONTINUE: Continue = js.native
  
  /**
    * Stop traversing immediately
    */
  var EXIT: Exit = js.native
  
  /**
    * Do not traverse this node’s children
    */
  var SKIP: Skip = js.native
  
  /**
    * Invoked when a node (matching test, if given) is found.
    * Visitors are free to transform node.
    * They can also transform the parent of node.
    * Replacing node itself, if visit.SKIP is not returned, still causes its descendants to be visited.
    * If adding or removing previous siblings (or next siblings, in case of reverse) of node,
    * visitor should return a new index (number) to specify the sibling to traverse after node is traversed.
    * Adding or removing next siblings of node (or previous siblings, in case of reverse)
    * is handled as expected without needing to return a new index.
    * Removing the children property of the parent still result in them being traversed.
    *
    * @param node Found node
    * @param index Position of found node within Parent
    * @param parent Parent of found node
    * @paramType V node type found
    * @returns
    * When Action is passed, treated as a tuple of [Action]
    * When Index is passed, treated as a tuple of [CONTINUE, Index]
    * When ActionTuple is passed,
    *   Note that passing a tuple only makes sense if the action is SKIP.
    *   If the action is EXIT, that action can be returned.
    *   If the action is CONTINUE, index can be returned.
    */
  type Visitor[V /* <: Node */] = js.Function3[
    /* node */ V, 
    /* index */ Double, 
    /* parent */ js.UndefOr[Parent], 
    Unit | Action | Index | ActionTuple
  ]
}
