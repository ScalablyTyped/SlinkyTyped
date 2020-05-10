package typingsSlinky.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type
@js.native
trait AggregationOperators extends js.Object {
  def abs(operand: Double): Double = js.native
  def add(operand: js.Any*): js.Any = js.native
  def addToSet(expression: String): js.Any = js.native
  def allElementsTrue(expression: js.Array[String]): Boolean = js.native
  def and(expression: js.Array[Boolean]): Boolean = js.native
  def anyElementTrue(expression: js.Array[String]): Boolean = js.native
  def arrayElemAt(expression: js.Tuple2[String, Double]): js.Any = js.native
  def arrayToObject(expression: String): js.Object = js.native
  // arrayToObject(expression: [string, any][]): object
  // arrayToObject(expression: {k: string; v: any}[]): object
  def avg(expression: String): Double = js.native
  def lt(expression: String, value: Double): Boolean = js.native
  def lte(expression: String, value: Double): Boolean = js.native
}

object AggregationOperators {
  @scala.inline
  def apply(
    abs: Double => Double,
    add: /* repeated */ js.Any => js.Any,
    addToSet: String => js.Any,
    allElementsTrue: js.Array[String] => Boolean,
    and: js.Array[Boolean] => Boolean,
    anyElementTrue: js.Array[String] => Boolean,
    arrayElemAt: js.Tuple2[String, Double] => js.Any,
    arrayToObject: String => js.Object,
    avg: String => Double,
    lt: (String, Double) => Boolean,
    lte: (String, Double) => Boolean
  ): AggregationOperators = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction1(abs), add = js.Any.fromFunction1(add), addToSet = js.Any.fromFunction1(addToSet), allElementsTrue = js.Any.fromFunction1(allElementsTrue), and = js.Any.fromFunction1(and), anyElementTrue = js.Any.fromFunction1(anyElementTrue), arrayElemAt = js.Any.fromFunction1(arrayElemAt), arrayToObject = js.Any.fromFunction1(arrayToObject), avg = js.Any.fromFunction1(avg), lt = js.Any.fromFunction2(lt), lte = js.Any.fromFunction2(lte))
    __obj.asInstanceOf[AggregationOperators]
  }
  @scala.inline
  implicit class AggregationOperatorsOps[Self <: AggregationOperators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbs(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdd(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddToSet(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAllElementsTrue(value: js.Array[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allElementsTrue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnd(value: js.Array[Boolean] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnyElementTrue(value: js.Array[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyElementTrue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArrayElemAt(value: js.Tuple2[String, Double] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayElemAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArrayToObject(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayToObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAvg(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLt(value: (String, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLte(value: (String, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

