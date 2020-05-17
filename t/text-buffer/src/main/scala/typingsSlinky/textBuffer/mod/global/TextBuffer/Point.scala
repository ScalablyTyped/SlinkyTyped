package typingsSlinky.textBuffer.mod.global.TextBuffer

import typingsSlinky.textBuffer.anon.ReadonlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a point in a buffer in row/column coordinates. */
@js.native
trait Point extends js.Object {
  /** A zero-indexed number representing the column of the Point. */
  var column: Double = js.native
  // Properties
  /** A zero-indexed number representing the row of the Point. */
  var row: Double = js.native
  // Comparison
  /**
    *  Compare another Point to this Point instance.
    *  Returns -1 if this point precedes the argument.
    *  Returns 0 if this point is equivalent to the argument.
    *  Returns 1 if this point follows the argument.
    */
  def compare(other: PointCompatible): Double = js.native
  // Construction
  /** Returns a new Point with the same row and column. */
  def copy(): Point = js.native
  // Operations
  /** Makes this point immutable and returns itself. */
  def freeze(): ReadonlyPoint = js.native
  /**
    *  Returns a boolean indicating whether this point has the same row and
    *  column as the given Point.
    */
  def isEqual(other: PointCompatible): Boolean = js.native
  /** Returns a Boolean indicating whether this point follows the given Point. */
  def isGreaterThan(other: PointCompatible): Boolean = js.native
  /**
    *  Returns a Boolean indicating whether this point follows or is equal to
    *  the given Point.
    */
  def isGreaterThanOrEqual(other: PointCompatible): Boolean = js.native
  /** Returns a Boolean indicating whether this point precedes the given Point. */
  def isLessThan(other: PointCompatible): Boolean = js.native
  /**
    *  Returns a Boolean indicating whether this point precedes or is equal to
    *  the given Point.
    */
  def isLessThanOrEqual(other: PointCompatible): Boolean = js.native
  /** Returns a new Point with the row and column negated. */
  def negate(): Point = js.native
  /** Returns an array of this point's row and column. */
  def serialize(): js.Tuple2[Double, Double] = js.native
  /** Returns an array of this point's row and column. */
  def toArray(): js.Tuple2[Double, Double] = js.native
  /**
    *  Build and return a new point by adding the rows and columns of the
    *  given point.
    */
  def translate(other: PointCompatible): Point = js.native
  /**
    *  Build and return a new Point by traversing the rows and columns
    *  specified by the given point.
    */
  def traverse(other: PointCompatible): Point = js.native
}

object Point {
  @scala.inline
  def apply(
    column: Double,
    compare: PointCompatible => Double,
    copy: () => Point,
    freeze: () => ReadonlyPoint,
    isEqual: PointCompatible => Boolean,
    isGreaterThan: PointCompatible => Boolean,
    isGreaterThanOrEqual: PointCompatible => Boolean,
    isLessThan: PointCompatible => Boolean,
    isLessThanOrEqual: PointCompatible => Boolean,
    negate: () => Point,
    row: Double,
    serialize: () => js.Tuple2[Double, Double],
    toArray: () => js.Tuple2[Double, Double],
    translate: PointCompatible => Point,
    traverse: PointCompatible => Point
  ): Point = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction0(copy), freeze = js.Any.fromFunction0(freeze), isEqual = js.Any.fromFunction1(isEqual), isGreaterThan = js.Any.fromFunction1(isGreaterThan), isGreaterThanOrEqual = js.Any.fromFunction1(isGreaterThanOrEqual), isLessThan = js.Any.fromFunction1(isLessThan), isLessThanOrEqual = js.Any.fromFunction1(isLessThanOrEqual), negate = js.Any.fromFunction0(negate), row = row.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), toArray = js.Any.fromFunction0(toArray), translate = js.Any.fromFunction1(translate), traverse = js.Any.fromFunction1(traverse))
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompare(value: PointCompatible => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopy(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFreeze(value: () => ReadonlyPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeze")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEqual(value: PointCompatible => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsGreaterThan(value: PointCompatible => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGreaterThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsGreaterThanOrEqual(value: PointCompatible => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGreaterThanOrEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLessThan(value: PointCompatible => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLessThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLessThanOrEqual(value: PointCompatible => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLessThanOrEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNegate(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialize(value: () => js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTranslate(value: PointCompatible => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTraverse(value: PointCompatible => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

