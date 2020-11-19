package typingsSlinky.typescriptCollections.heapMod

import typingsSlinky.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heap[T] extends js.Object {
  
  /**
    * Adds the given element into the heap.
    * @param {*} element the element.
    * @return true if the element was added or fals if it is undefined.
    */
  def add(element: T): Boolean = js.native
  
  /**
    * Removes all of the elements from this heap.
    */
  def clear(): Unit = js.native
  
  /**
    * Function used to compare elements.
    * @type {function(Object,Object):number}
    * @private
    */
  var compare: js.Any = js.native
  
  /**
    * Returns true if this heap contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this Heap contains the specified element, false
    * otherwise.
    */
  def contains(element: T): Boolean = js.native
  
  /**
    * Array used to store the elements of the heap.
    * @type {Array.<Object>}
    * @private
    */
  var data: js.Any = js.native
  
  /**
    * Executes the provided function once for each element present in this heap in
    * no particular order.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[T]): Unit = js.native
  
  /**
    * Checks if this heap is empty.
    * @return {boolean} true if and only if this heap contains no items; false
    * otherwise.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * Returns the index of the left child of the node at the given index.
    * @param {number} nodeIndex The index of the node to get the left child
    * for.
    * @return {number} The index of the left child.
    * @private
    */
  /* private */ def leftChildIndex(nodeIndex: js.Any): js.Any = js.native
  
  /**
    * Returns the index of the smaller child node (if it exists).
    * @param {number} leftChild left child index.
    * @param {number} rightChild right child index.
    * @return {number} the index with the minimum value or -1 if it doesn't
    * exists.
    * @private
    */
  /* private */ def minIndex(leftChild: js.Any, rightChild: js.Any): js.Any = js.native
  
  /**
    * Returns the index of the parent of the node at the given index.
    * @param {number} nodeIndex The index of the node to get the parent for.
    * @return {number} The index of the parent.
    * @private
    */
  /* private */ def parentIndex(nodeIndex: js.Any): js.Any = js.native
  
  /**
    * Retrieves but does not remove the root element of this heap.
    * @return {*} The value at the root of the heap. Returns undefined if the
    * heap is empty.
    */
  def peek(): js.UndefOr[T] = js.native
  
  /**
    * Retrieves and removes the root element of this heap.
    * @return {*} The value removed from the root of the heap. Returns
    * undefined if the heap is empty.
    */
  def removeRoot(): js.UndefOr[T] = js.native
  
  /**
    * Returns the index of the right child of the node at the given index.
    * @param {number} nodeIndex The index of the node to get the right child
    * for.
    * @return {number} The index of the right child.
    * @private
    */
  /* private */ def rightChildIndex(nodeIndex: js.Any): js.Any = js.native
  
  /**
    * Moves the node at the given index down to its proper place in the heap.
    * @param {number} nodeIndex The index of the node to move down.
    * @private
    */
  /* private */ def siftDown(nodeIndex: js.Any): js.Any = js.native
  
  /**
    * Moves the node at the given index up to its proper place in the heap.
    * @param {number} index The index of the node to move up.
    * @private
    */
  /* private */ def siftUp(index: js.Any): js.Any = js.native
  
  /**
    * Returns the number of elements in this heap.
    * @return {number} the number of elements in this heap.
    */
  def size(): Double = js.native
}
object Heap {
  
  @scala.inline
  def apply[T](
    add: T => Boolean,
    clear: () => Unit,
    compare: js.Any,
    contains: T => Boolean,
    data: js.Any,
    forEach: ILoopFunction[T] => Unit,
    isEmpty: () => Boolean,
    leftChildIndex: js.Any => js.Any,
    minIndex: (js.Any, js.Any) => js.Any,
    parentIndex: js.Any => js.Any,
    peek: () => js.UndefOr[T],
    removeRoot: () => js.UndefOr[T],
    rightChildIndex: js.Any => js.Any,
    siftDown: js.Any => js.Any,
    siftUp: js.Any => js.Any,
    size: () => Double
  ): Heap[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), compare = compare.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), data = data.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), isEmpty = js.Any.fromFunction0(isEmpty), leftChildIndex = js.Any.fromFunction1(leftChildIndex), minIndex = js.Any.fromFunction2(minIndex), parentIndex = js.Any.fromFunction1(parentIndex), peek = js.Any.fromFunction0(peek), removeRoot = js.Any.fromFunction0(removeRoot), rightChildIndex = js.Any.fromFunction1(rightChildIndex), siftDown = js.Any.fromFunction1(siftDown), siftUp = js.Any.fromFunction1(siftUp), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[Heap[T]]
  }
  
  @scala.inline
  implicit class HeapOps[Self <: Heap[_], T] (val x: Self with Heap[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: T => Boolean): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompare(value: js.Any): Self = this.set("compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: T => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForEach(value: ILoopFunction[T] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeftChildIndex(value: js.Any => js.Any): Self = this.set("leftChildIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinIndex(value: (js.Any, js.Any) => js.Any): Self = this.set("minIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParentIndex(value: js.Any => js.Any): Self = this.set("parentIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPeek(value: () => js.UndefOr[T]): Self = this.set("peek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveRoot(value: () => js.UndefOr[T]): Self = this.set("removeRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRightChildIndex(value: js.Any => js.Any): Self = this.set("rightChildIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSiftDown(value: js.Any => js.Any): Self = this.set("siftDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSiftUp(value: js.Any => js.Any): Self = this.set("siftUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
  }
}
