package typingsSlinky.textBuffer

import typingsSlinky.textBuffer.mod._Global_.TextBuffer.PointCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<text-buffer.text-buffer._Global_.TextBuffer.Point> */
@js.native
trait ReadonlyPoint extends js.Object {
  val column: Double = js.native
  val row: Double = js.native
  def compare(other: PointCompatible): Double = js.native
  def copy(): this.type = js.native
  def freeze(): this.type = js.native
  def isEqual(other: PointCompatible): Boolean = js.native
  def isGreaterThan(other: PointCompatible): Boolean = js.native
  def isGreaterThanOrEqual(other: PointCompatible): Boolean = js.native
  def isLessThan(other: PointCompatible): Boolean = js.native
  def isLessThanOrEqual(other: PointCompatible): Boolean = js.native
  def negate(): this.type = js.native
  def serialize(): js.Tuple2[Double, Double] = js.native
  def toArray(): js.Tuple2[Double, Double] = js.native
  def translate(other: PointCompatible): this.type = js.native
  def traverse(other: PointCompatible): this.type = js.native
}

object ReadonlyPoint {
  @scala.inline
  def apply(
    column: Double,
    compare: PointCompatible => Double,
    copy: () => ReadonlyPoint,
    freeze: () => ReadonlyPoint,
    isEqual: PointCompatible => Boolean,
    isGreaterThan: PointCompatible => Boolean,
    isGreaterThanOrEqual: PointCompatible => Boolean,
    isLessThan: PointCompatible => Boolean,
    isLessThanOrEqual: PointCompatible => Boolean,
    negate: () => ReadonlyPoint,
    row: Double,
    serialize: () => js.Tuple2[Double, Double],
    toArray: () => js.Tuple2[Double, Double],
    translate: PointCompatible => ReadonlyPoint,
    traverse: PointCompatible => ReadonlyPoint
  ): ReadonlyPoint = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction0(copy), freeze = js.Any.fromFunction0(freeze), isEqual = js.Any.fromFunction1(isEqual), isGreaterThan = js.Any.fromFunction1(isGreaterThan), isGreaterThanOrEqual = js.Any.fromFunction1(isGreaterThanOrEqual), isLessThan = js.Any.fromFunction1(isLessThan), isLessThanOrEqual = js.Any.fromFunction1(isLessThanOrEqual), negate = js.Any.fromFunction0(negate), row = row.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), toArray = js.Any.fromFunction0(toArray), translate = js.Any.fromFunction1(translate), traverse = js.Any.fromFunction1(traverse))
    __obj.asInstanceOf[ReadonlyPoint]
  }
  @scala.inline
  implicit class ReadonlyPointOps[Self <: ReadonlyPoint] (val x: Self) extends AnyVal {
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
    def withCopy(value: () => ReadonlyPoint): Self = {
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
    def withNegate(value: () => ReadonlyPoint): Self = {
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
    def withTranslate(value: PointCompatible => ReadonlyPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTraverse(value: PointCompatible => ReadonlyPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

