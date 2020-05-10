package typingsSlinky.typescriptCollections.bstreekvMod

import typingsSlinky.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BSTreeKV[K, V /* <: K */] extends js.Object {
  var compare: js.Any = js.native
  var nElements: js.Any = js.native
  var root: js.Any = js.native
  /**
    * Adds the specified element to this tree if it is not already present.
    * @param {Object} element the element to insert.
    * @return {boolean} true if this tree did not already contain the specified element.
    */
  def add(element: V): Boolean = js.native
  /**
    * Removes all of the elements from this tree.
    */
  def clear(): Unit = js.native
  /**
    * Returns true if this tree contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this tree contains the specified element,
    * false otherwise.
    */
  def contains(element: K): Boolean = js.native
  /**
    * @private
    */
  /* private */ def createNode(element: js.Any): js.Any = js.native
  /**
    * Executes the provided function once for each element present in this tree in inorder.
    * Equivalent to inorderTraversal.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[V]): Unit = js.native
  /**
    * Returns the height of this tree.
    * @return {number} the height of this tree or -1 if is empty.
    */
  def height(): Double = js.native
  /**
    * @private
    */
  /* private */ def heightAux(node: js.Any): js.Any = js.native
  /**
    * Executes the provided function once for each element present in this tree in
    * in-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def inorderTraversal(callback: ILoopFunction[V]): Unit = js.native
  /**
    * @private
    */
  /* private */ def inorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any = js.native
  /* private */ def insertNode(node: js.Any): js.Any = js.native
  /**
    * Returns true if this tree contains no elements.
    * @return {boolean} true if this tree contains no elements.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Executes the provided function once for each element present in this tree in
    * level-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def levelTraversal(callback: ILoopFunction[V]): Unit = js.native
  /**
    * @private
    */
  /* private */ def levelTraversalAux(node: js.Any, callback: js.Any): js.Any = js.native
  /**
    * Returns the maximum element of this tree.
    * @return {*} the maximum element of this tree or undefined if this tree is
    * is empty.
    */
  def maximum(): js.UndefOr[V] = js.native
  /**
    * @private
    */
  /* private */ def maximumAux(node: js.Any): js.Any = js.native
  /**
    * Returns the minimum element of this tree.
    * @return {*} the minimum element of this tree or undefined if this tree is
    * is empty.
    */
  def minimum(): js.UndefOr[V] = js.native
  /**
    * @private
    */
  /* private */ def minimumAux(node: js.Any): js.Any = js.native
  /**
    * Executes the provided function once for each element present in this tree in post-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def postorderTraversal(callback: ILoopFunction[V]): Unit = js.native
  /**
    * @private
    */
  /* private */ def postorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any = js.native
  /**
    * Executes the provided function once for each element present in this tree in pre-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def preorderTraversal(callback: ILoopFunction[V]): Unit = js.native
  /**
    * @private
    */
  /* private */ def preorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any = js.native
  /**
    * Removes the specified element from this tree if it is present.
    * @return {boolean} true if this tree contained the specified element.
    */
  def remove(element: K): Boolean = js.native
  /**
    * @private
    */
  /* private */ def removeNode(node: js.Any): js.Any = js.native
  /**
    * Looks for the value with the provided search key.
    * @param {Object} element The key to look for
    * @return {Object} The value found or undefined if it was not found.
    */
  def search(element: K): js.UndefOr[V] = js.native
  /**
    * @private
    */
  /* private */ def searchNode(node: js.Any, element: js.Any): js.Any = js.native
  /**
    * Returns the number of elements in this tree.
    * @return {number} the number of elements in this tree.
    */
  def size(): Double = js.native
  /**
    * Returns an array containing all of the elements in this tree in in-order.
    * @return {Array} an array containing all of the elements in this tree in in-order.
    */
  def toArray(): js.Array[V] = js.native
  /**
    * @private
    */
  /* private */ def transplant(n1: js.Any, n2: js.Any): js.Any = js.native
}

object BSTreeKV {
  @scala.inline
  def apply[K, V](
    add: V => Boolean,
    clear: () => Unit,
    compare: js.Any,
    contains: K => Boolean,
    createNode: js.Any => js.Any,
    forEach: ILoopFunction[V] => Unit,
    height: () => Double,
    heightAux: js.Any => js.Any,
    inorderTraversal: ILoopFunction[V] => Unit,
    inorderTraversalAux: (js.Any, js.Any, js.Any) => js.Any,
    insertNode: js.Any => js.Any,
    isEmpty: () => Boolean,
    levelTraversal: ILoopFunction[V] => Unit,
    levelTraversalAux: (js.Any, js.Any) => js.Any,
    maximum: () => js.UndefOr[V],
    maximumAux: js.Any => js.Any,
    minimum: () => js.UndefOr[V],
    minimumAux: js.Any => js.Any,
    nElements: js.Any,
    postorderTraversal: ILoopFunction[V] => Unit,
    postorderTraversalAux: (js.Any, js.Any, js.Any) => js.Any,
    preorderTraversal: ILoopFunction[V] => Unit,
    preorderTraversalAux: (js.Any, js.Any, js.Any) => js.Any,
    remove: K => Boolean,
    removeNode: js.Any => js.Any,
    root: js.Any,
    search: K => js.UndefOr[V],
    searchNode: (js.Any, js.Any) => js.Any,
    size: () => Double,
    toArray: () => js.Array[V],
    transplant: (js.Any, js.Any) => js.Any
  ): BSTreeKV[K, V] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), compare = compare.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), createNode = js.Any.fromFunction1(createNode), forEach = js.Any.fromFunction1(forEach), height = js.Any.fromFunction0(height), heightAux = js.Any.fromFunction1(heightAux), inorderTraversal = js.Any.fromFunction1(inorderTraversal), inorderTraversalAux = js.Any.fromFunction3(inorderTraversalAux), insertNode = js.Any.fromFunction1(insertNode), isEmpty = js.Any.fromFunction0(isEmpty), levelTraversal = js.Any.fromFunction1(levelTraversal), levelTraversalAux = js.Any.fromFunction2(levelTraversalAux), maximum = js.Any.fromFunction0(maximum), maximumAux = js.Any.fromFunction1(maximumAux), minimum = js.Any.fromFunction0(minimum), minimumAux = js.Any.fromFunction1(minimumAux), nElements = nElements.asInstanceOf[js.Any], postorderTraversal = js.Any.fromFunction1(postorderTraversal), postorderTraversalAux = js.Any.fromFunction3(postorderTraversalAux), preorderTraversal = js.Any.fromFunction1(preorderTraversal), preorderTraversalAux = js.Any.fromFunction3(preorderTraversalAux), remove = js.Any.fromFunction1(remove), removeNode = js.Any.fromFunction1(removeNode), root = root.asInstanceOf[js.Any], search = js.Any.fromFunction1(search), searchNode = js.Any.fromFunction2(searchNode), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray), transplant = js.Any.fromFunction2(transplant))
    __obj.asInstanceOf[BSTreeKV[K, V]]
  }
  @scala.inline
  implicit class BSTreeKVOps[Self[k, v] <: BSTreeKV[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withAdd(value: V => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompare(value: js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: K => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateNode(value: js.Any => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: ILoopFunction[V] => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: () => Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeightAux(value: js.Any => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightAux")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInorderTraversal(value: ILoopFunction[V] => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inorderTraversal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInorderTraversalAux(value: (js.Any, js.Any, js.Any) => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inorderTraversalAux")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInsertNode(value: js.Any => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLevelTraversal(value: ILoopFunction[V] => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelTraversal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLevelTraversalAux(value: (js.Any, js.Any) => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelTraversalAux")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMaximum(value: () => js.UndefOr[V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaximumAux(value: js.Any => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAux")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMinimum(value: () => js.UndefOr[V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinimumAux(value: js.Any => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumAux")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNElements(value: js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostorderTraversal(value: ILoopFunction[V] => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postorderTraversal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPostorderTraversalAux(value: (js.Any, js.Any, js.Any) => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postorderTraversalAux")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPreorderTraversal(value: ILoopFunction[V] => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preorderTraversal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreorderTraversalAux(value: (js.Any, js.Any, js.Any) => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preorderTraversalAux")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemove(value: K => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveNode(value: js.Any => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: K => js.UndefOr[V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearchNode(value: (js.Any, js.Any) => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTransplant(value: (js.Any, js.Any) => js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transplant")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

