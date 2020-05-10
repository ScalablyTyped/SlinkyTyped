package typingsSlinky.typescriptCollections.priorityQueueMod

import typingsSlinky.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue[T] extends js.Object {
  var heap: js.Any = js.native
  /**
    * Inserts the specified element into this priority queue.
    * @param {Object} element the element to insert.
    * @return {boolean} true if the element was inserted, or false if it is undefined.
    */
  def add(element: T): Boolean = js.native
  /**
    * Removes all of the elements from this priority queue.
    */
  def clear(): Unit = js.native
  /**
    * Returns true if this priority queue contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this priority queue contains the specified element,
    * false otherwise.
    */
  def contains(element: T): Boolean = js.native
  /**
    * Retrieves and removes the highest priority element of this queue.
    * @return {*} the the highest priority element of this queue,
    *  or undefined if this queue is empty.
    */
  def dequeue(): js.UndefOr[T] = js.native
  /**
    * Inserts the specified element into this priority queue.
    * @param {Object} element the element to insert.
    * @return {boolean} true if the element was inserted, or false if it is undefined.
    */
  def enqueue(element: T): Boolean = js.native
  /**
    * Executes the provided function once for each element present in this queue in
    * no particular order.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[T]): Unit = js.native
  /**
    * Checks if this priority queue is empty.
    * @return {boolean} true if and only if this priority queue contains no items; false
    * otherwise.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Retrieves, but does not remove, the highest priority element of this queue.
    * @return {*} the highest priority element of this queue, or undefined if this queue is empty.
    */
  def peek(): js.UndefOr[T] = js.native
  /**
    * Returns the number of elements in this priority queue.
    * @return {number} the number of elements in this priority queue.
    */
  def size(): Double = js.native
}

object PriorityQueue {
  @scala.inline
  def apply[T](
    add: T => Boolean,
    clear: () => Unit,
    contains: T => Boolean,
    dequeue: () => js.UndefOr[T],
    enqueue: T => Boolean,
    forEach: ILoopFunction[T] => Unit,
    heap: js.Any,
    isEmpty: () => Boolean,
    peek: () => js.UndefOr[T],
    size: () => Double
  ): PriorityQueue[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), forEach = js.Any.fromFunction1(forEach), heap = heap.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), peek = js.Any.fromFunction0(peek), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[PriorityQueue[T]]
  }
  @scala.inline
  implicit class PriorityQueueOps[Self[t] <: PriorityQueue[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdd(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContains(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDequeue(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dequeue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnqueue(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enqueue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: ILoopFunction[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeap(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeek(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

