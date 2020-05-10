package typingsSlinky.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcost extends js.Object {
  def BINARY(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double = js.native
  def CROSS_ENTROPY(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double = js.native
  def MSE(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double = js.native
}

object Typeofcost {
  @scala.inline
  def apply(
    BINARY: (js.Array[Double], js.Array[Double]) => Double,
    CROSS_ENTROPY: (js.Array[Double], js.Array[Double]) => Double,
    MSE: (js.Array[Double], js.Array[Double]) => Double
  ): Typeofcost = {
    val __obj = js.Dynamic.literal(BINARY = js.Any.fromFunction2(BINARY), CROSS_ENTROPY = js.Any.fromFunction2(CROSS_ENTROPY), MSE = js.Any.fromFunction2(MSE))
    __obj.asInstanceOf[Typeofcost]
  }
  @scala.inline
  implicit class TypeofcostOps[Self <: Typeofcost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBINARY(value: (js.Array[Double], js.Array[Double]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BINARY")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCROSS_ENTROPY(value: (js.Array[Double], js.Array[Double]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CROSS_ENTROPY")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMSE(value: (js.Array[Double], js.Array[Double]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSE")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

