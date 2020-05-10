package typingsSlinky.valiant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interval[T] extends js.Object {
  var constructor: IntervalConstructor[Double] = js.native
  var empty: Boolean = js.native
  var from: Endpoint[T] = js.native
  var to: Endpoint[T] = js.native
  def contains(value: T): Boolean = js.native
  def contiguousWith(interval: Interval[T]): Boolean = js.native
  def equalTo(interval: Interval[T]): Boolean = js.native
  def fromComparator(a: Endpoint[T], b: Endpoint[T]): Double = js.native
  def hull(interval: Interval[T]): Interval[T] = js.native
  def intersection(interval: Interval[T]): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isSubsetOf(interval: Interval[T]): Boolean = js.native
  def toComparator(a: Endpoint[T], b: Endpoint[T]): Double = js.native
  def unify(interval: Interval[T]): Interval[T] = js.native
}

object Interval {
  @scala.inline
  def apply[T](
    constructor: IntervalConstructor[Double],
    contains: T => Boolean,
    contiguousWith: Interval[T] => Boolean,
    empty: Boolean,
    equalTo: Interval[T] => Boolean,
    from: Endpoint[T],
    fromComparator: (Endpoint[T], Endpoint[T]) => Double,
    hull: Interval[T] => Interval[T],
    intersection: Interval[T] => Boolean,
    isEmpty: () => Boolean,
    isSubsetOf: Interval[T] => Boolean,
    to: Endpoint[T],
    toComparator: (Endpoint[T], Endpoint[T]) => Double,
    unify: Interval[T] => Interval[T]
  ): Interval[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), contiguousWith = js.Any.fromFunction1(contiguousWith), empty = empty.asInstanceOf[js.Any], equalTo = js.Any.fromFunction1(equalTo), from = from.asInstanceOf[js.Any], fromComparator = js.Any.fromFunction2(fromComparator), hull = js.Any.fromFunction1(hull), intersection = js.Any.fromFunction1(intersection), isEmpty = js.Any.fromFunction0(isEmpty), isSubsetOf = js.Any.fromFunction1(isSubsetOf), to = to.asInstanceOf[js.Any], toComparator = js.Any.fromFunction2(toComparator), unify = js.Any.fromFunction1(unify))
    __obj.asInstanceOf[Interval[T]]
  }
  @scala.inline
  implicit class IntervalOps[Self[t] <: Interval[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConstructor(value: IntervalConstructor[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContiguousWith(value: Interval[T] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contiguousWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEqualTo(value: Interval[T] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFrom(value: Endpoint[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromComparator(value: (Endpoint[T], Endpoint[T]) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromComparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHull(value: Interval[T] => Interval[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hull")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntersection(value: Interval[T] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSubsetOf(value: Interval[T] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSubsetOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTo(value: Endpoint[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToComparator(value: (Endpoint[T], Endpoint[T]) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toComparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnify(value: Interval[T] => Interval[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

